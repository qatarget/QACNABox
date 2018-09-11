package Page.MenuAdministrativoContratosPage;

import static org.junit.Assert.assertEquals;
import static qa.cnabox.core.DriverFactory.getDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.cnabox.core.BasePage;

public class ProcessoMatriculaPage extends BasePage {

	public void SetClicarMenu() {

		clicarBotaoBy(
				By.xpath("//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/a[@href='#']/span[.='Comercial']"));
	}

	public void SetClicarSubMenu() {
		clicarBotaoBy(By.xpath(
				"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/ul[@class='sub-menu']//span[.='Atendimento']"));
	}

	public void AguardaCarregarPagina() throws InterruptedException {
		Thread.sleep(3000);

	}

	public void SetClicarCadastrarProspect() {
		clicarBotaoBy(By.xpath("/html//button[@id='btnCreateNewProspect']"));
	}

	public void SetEscreveNomeAluno() {
		escreveId("Nome", geraNomeAleatorio());

	}

	public void SetEscreveEmail() {
		escreveId("Email", GeraEmailAleatorio());
	}

	public void SetEscreverEmailAleatorio() {
		escreveId("EmailSecundario", GeraEmailAleatorio());
	}

	public void SetSexoMasculino() {
		clicarBotaoBy(By.xpath("//div//fieldset[@id='GridCadastro']//div[@class='inline-group']//label[2]//i[1]"));
	}

	public void SetSexoFeminino() {
		clicarBotaoBy(By.xpath("//div//fieldset[@id='GridCadastro']//div[@class='inline-group']//label[1]//i[1]"));
	}

	public void SetDataNascimento(String data) {
		escreveTexto(By.xpath("/html//input[@id='DataNascimento']"), data);
	}

	public void SetEstadoCivil(String numerocombo) {

		WebElement element = getDriver().findElement(By.xpath("/html//select[@id='EstadoCivilId']"));
		Select combo = new Select(element);
		combo.selectByValue(numerocombo);
	}

	public void SetTelefoneCelular(String numero) {
		escreveId("Celular", numero);
	}

	public void SetTelefoneFixo(String numero) {
		escreveId("Telefone", numero);
	}

	public void SetCep(String CEP) {
		escreveId("Endereco_CEP", CEP);
	}

	public void SetNumeroResidencia(String numero) {
		escreveId("Endereco_Numero", numero);

	}

	public void SetRolarAPagina() {

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,200)", "");
	}

	public void SetSelecionarIdioma() {

		clicarBotaoBy(By.xpath("//tbody//tr[1]//td[1]//label[1]//i[1]"));

	}

	public void SetSelecionarEstagio(String estagio) throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".txt-color-white .input-sm"));
		Thread.sleep(1000);

	}

	public void SetSelecionarHorario() {
		clicarBotaoBy(
				By.xpath("/html//table[@id='datatable_tabletools']/tbody/tr[1]/td[2]/label[@class='checkbox']/i"));
		clicarBotaoBy(
				By.xpath("/html//table[@id='datatable_tabletools']/tbody/tr[1]/td[3]/label[@class='checkbox']/i"));
		clicarBotaoBy(
				By.xpath("/html//table[@id='datatable_tabletools']/tbody/tr[1]/td[7]/label[@class='checkbox']/i"));
	}

	public void BuscaCPF() throws InterruptedException {

		Thread.sleep(2000);
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_T);
		} catch (AWTException ex) {
			throw new WebDriverException("Erro ao digitar CTRL + T", ex);

		}
		WebDriverWait wait = new WebDriverWait(getDriver(), 5);
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		for (String handle : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(handle);
		}
		Thread.sleep(1000);
		//// Sempre trocar para a pagina desejada como por exemplo: cpf ou cnpj ///
		getDriver().navigate().to("https://www.4devs.com.br/gerador_de_cpf");
		Thread.sleep(2000);
		getDriver().findElement(By.cssSelector("[type='button']")).click();
		Thread.sleep(2000);

		////// nesse comando o selenium armazena a variavel atribuida no campo
		////// texto_cpf////
		String Textocampo = ObterTextoCampoId("texto_cpf");
		Thread.sleep(2000);
		getDriver().close();
		Thread.sleep(6000);

		////// Aqui ele vai retornar para a pagina do BOX////

		for (String CNABox : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(CNABox);
		}
		Thread.sleep(2000);
		getDriver().findElement(By.id("CPF_CNPJ")).click();
		Thread.sleep(3000);

		//// aqui ele vai escrever a variavel armazenada anteriormente///
		getDriver().findElement(By.id("CPF_CNPJ")).sendKeys(Textocampo);

	}

	public void SetEscreveRG() {
		escreveId("RG_IE", "452484863");
	}

	public void SetSelecionarMidia(String numeroMidia) {
		getDriver().findElement(By.xpath("/html//select[@id='MidiaId']")).click();
		WebElement midia = getDriver().findElement(By.xpath("/html//select[@id='MidiaId']"));
		Select comboMidia = new Select(midia);
		comboMidia.selectByValue(numeroMidia);
	}

	public void SetSelecionarCampanha(String numeroCampanha) {
		getDriver().findElement(By.xpath("/html//select[@id='CampanhaId']")).click();
		WebElement campanha = getDriver().findElement(By.xpath("/html//select[@id='CampanhaId']"));
		Select comboCampanha = new Select(campanha);
		comboCampanha.selectByValue(numeroCampanha);
	}

	public void SetSelecionarAtendimento() {

		clicarBotaoBy(By.cssSelector("#row-atendimento-receptivo .radio:nth-of-type(2) i"));

	}

	public void SetSelecionarTipoAtendimento() {

		clicarBotaoBy(By.cssSelector("#row-tipo-atendimento .radio:nth-of-type(3) i"));

	}

	public void SetSelecionarAcaoRealizada() {

		clicarBotaoBy(By.cssSelector("#row-tipo-acao .radio:nth-of-type(6) i"));

	}

	public void SetEscreverDescricao() {
		escreveId("Descricao", "Teste");
	}

	public void SetSalvar() {
		clicarbotao(".form-group [type='button']:nth-of-type(2)");
	}

	public void SetRolarPaginaParaCima() {
		rolarParaCimaPageUP();
	}

	public void SetoRolarCimaSemPageUP() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,-1500)", "");
	}

	public void BuscaCEP() throws InterruptedException {

		Thread.sleep(2000);
		getDriver().findElement(By.id("PessoaEscola_Endereco_CEP")).click();
		escreveTexto(By.id("PessoaEscola_Endereco_CEP"), GeraCEP());
		Thread.sleep(1000);

	}

	public void RolarPaginaPageDown() {

		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		} catch (AWTException ex) {
			throw new WebDriverException("VK_PAGE_DOWN", ex);

		}
	}

	public void RolarPaginaPageUp() {

		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			robot.keyRelease(KeyEvent.VK_PAGE_UP);
			robot.keyRelease(KeyEvent.VK_PAGE_UP);
		
		} catch (AWTException ex) {
			throw new WebDriverException("VK_PAGE_UP", ex);

		}
	}
	
	public void ClicarCampoCep() throws InterruptedException {
		clicarBotaoBy(By.cssSelector("#widget-grid fieldset:nth-child(8) [autocomplete]"));
		Thread.sleep(1000);
	}
	public void ClicarCampoAtendimento() throws InterruptedException {
		clicarBotaoBy(By.cssSelector("#row-tipo-atendimento .radio:nth-of-type(3) i"));
		Thread.sleep(1000);
	}
	
	public void ClicarCampoDescrição() throws InterruptedException {
		clicarBotaoBy(By.id("Descricao"));
		Thread.sleep(1000);
		escreveTexto(By.id("Descricao"), GerarTituloAleatorio());
	}
	
	public void ClicarSalvar()throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector(".form-group [type='button']:nth-of-type(2)"));
		Thread.sleep(1000);
	}
	
	public void ClicarMatricula()throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#row-tipo-acao .radio:nth-of-type(6) i"));
		Thread.sleep(1000);
	}


	public void ClicarProximoPasso1()throws InterruptedException {
		
		clicarBotaoBy(By.id("btnAlunoSave"));
		Thread.sleep(1000);
	}
	
	public void Tempo (int Tempo) throws InterruptedException {
		
		Thread.sleep(Tempo);
	}

	public void RolarPagina() {
	((JavascriptExecutor) getDriver()).executeScript("scroll(0,1300)");
	
	}

		public void SetProximo3()throws InterruptedException {
		
		clicarBotaoBy(By.id("btnDocumentoSave"));
		Thread.sleep(2000);
		
	}
		
		public void SetEstagio(String numeromodalidade)throws InterruptedException {
			
			clicarBotaoBy(By.id("EscolaEstagioId"));
			Thread.sleep(2000);
			WebElement modalidade = getDriver().findElement(By.id("EscolaEstagioId"));
			Select combomodalidade = new Select(modalidade);
			combomodalidade.selectByValue(numeromodalidade);
			
		}
		
		public void Setmodalidade(String numeromodalidade)throws InterruptedException {
			
			clicarBotaoBy(By.id("ModalidadeId"));
			Thread.sleep(2000);
			WebElement modalidade = getDriver().findElement(By.id("ModalidadeId"));
			Select combomodalidade = new Select(modalidade);
			combomodalidade.selectByValue(numeromodalidade);
			
		}
		
		
		public void SetProximoestagio(String numeromodalidade)throws InterruptedException {
			
			clicarBotaoBy(By.cssSelector(".default td:nth-of-type(1) i"));
			Thread.sleep(2000);
			clicarBotaoBy(By.id("ModalidadeIdSequencia"));
			Thread.sleep(2000);
			WebElement modalidade = getDriver().findElement(By.id("ModalidadeIdSequencia"));
			Select combomodalidade = new Select(modalidade);
			combomodalidade.selectByValue(numeromodalidade);
			
		}

		public void Setproximopasso()throws InterruptedException {
			
			clicarBotaoBy(By.id("btnDocumentoEstagioSave"));
			Thread.sleep(2000);
			
		}
		public void SetFormadePG(String forma)throws InterruptedException {
			
			clicarBotaoBy(By.id("FormaPagamentoIdUnica"));
			Thread.sleep(2000);
			WebElement Formapg = getDriver().findElement(By.id("FormaPagamentoIdUnica"));
			Select comboforma = new Select(Formapg);
			comboforma.selectByValue(forma);
		}
		
		public void SetParcelas(String numero)throws InterruptedException {
			
			clicarBotaoBy(By.id("NumeroParcelaUnica"));
			Thread.sleep(2000);
			getDriver().findElement(By.id("NumeroParcelaUnica")).clear();
			Thread.sleep(2000);
			clicarBotaoBy(By.id("NumeroParcelaUnica"));
			Thread.sleep(2000);
			escreveId("NumeroParcelaUnica", numero);
			Thread.sleep(2000);
		}
		
		public void Setdata(String proximadata)throws InterruptedException {
			
			clicarBotaoBy(By.cssSelector("#DataVencimentoUnicaProximoPagamento"));
			Thread.sleep(2000);
			getDriver().findElement(By.cssSelector("#DataVencimentoUnicaProximoPagamento")).clear();
			Thread.sleep(2000);
			clicarBotaoBy(By.cssSelector("#DataVencimentoUnicaProximoPagamento"));
			Thread.sleep(2000);
			getDriver().findElement(By.cssSelector("#DataVencimentoUnicaProximoPagamento")).sendKeys(proximadata);
			Thread.sleep(2000);
		}
		
		
		public void Setproximopassofinal()throws InterruptedException {
			
			clicarBotaoBy(By.id("btnCondicoesFinanceirasSave"));
			Thread.sleep(2000);
			
		}
		
		public void SetConcluir()throws InterruptedException {
			
			clicarBotaoBy(By.id("btnGerarContrato"));
			Thread.sleep(2000);
			
		}
		
		public void SetObservacao()throws InterruptedException {
			
			clicarBotaoBy(By.id("ObservacoesContrato"));
			Thread.sleep(2000);
			
		}
		
		public void SetTemplante()throws InterruptedException {
			
			clicarBotaoBy(By.id("TemplateId"));
			Thread.sleep(2000);
			
		}
		
		public void SetBotãoCaixa()throws InterruptedException {
			
			clicarBotaoBy(By.cssSelector(".btnCaixaContrato"));
			Thread.sleep(2000);
			
		}
		
		public void SetGerarBoletos() throws InterruptedException {
			getDriver().switchTo().frame(0);
			clicarBotaoBy(By.linkText("Gerar Boletos"));
			Thread.sleep(2000);
			
		}
		
		public void SetLayout(String forma)throws InterruptedException {
			
			clicarBotaoBy(By.id("TipoLayoutBoletoId"));
			Thread.sleep(2000);
			WebElement Formapg = getDriver().findElement(By.id("TipoLayoutBoletoId"));
			Select comboforma = new Select(Formapg);
			comboforma.selectByValue(forma);
		}
			
		
		public void Setmodalidadeboleto(String forma)throws InterruptedException {
			
			clicarBotaoBy(By.id("TipoBoleto"));
			Thread.sleep(2000);
			WebElement Formapg = getDriver().findElement(By.id("TipoBoleto"));
			Select comboforma = new Select(Formapg);
			comboforma.selectByValue(forma);
		}
        
		
		public void Settipoconta (String Conta) throws InterruptedException {
			
			clicarBotaoBy(By.id("ContaCorrenteId"));
			Thread.sleep(2000);
			WebElement Contapg = getDriver().findElement(By.id("ContaCorrenteId"));
			Select comboConta = new Select(Contapg);
			comboConta.selectByValue(Conta);
		
		}
		
		public void SetCarteiraID (String Carteira) throws InterruptedException {
			
			clicarBotaoBy(By.id("ContaCorrenteCarteiraId"));
			Thread.sleep(2000);
			WebElement Carteirapg = getDriver().findElement(By.id("ContaCorrenteCarteiraId"));
			Select comboCarteira = new Select(Carteirapg);
			comboCarteira.selectByValue(Carteira);
		
		}
		
		public void SetBotãoGerar()throws InterruptedException {
			
			clicarBotaoBy(By.cssSelector("btnGerarBoletos"));
			Thread.sleep(2000);
			
		}
		
		public void Setclicartotal()throws InterruptedException {
			
			clicarBotaoBy(By.cssSelector("#conteudoTabCondicaoFinanceira > div:nth-of-type(1) [colspan]"));
			Thread.sleep(2000);
			
		}
		
		public void SetclicarFecharmodalaviso()throws InterruptedException {
			
			clicarBotaoBy(By.id("botClose1"));
			Thread.sleep(2000);
			
		}
}
