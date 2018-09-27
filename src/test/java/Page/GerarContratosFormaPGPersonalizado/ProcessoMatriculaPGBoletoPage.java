package Page.GerarContratosFormaPGPersonalizado;

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

public class ProcessoMatriculaPGBoletoPage extends BasePage {

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
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,200)", "");
		
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
		public void SetFormadePG()throws InterruptedException {
			
			clicarBotaoBy(By.linkText("PERSONALIZADO"));
			Thread.sleep(2000);
			
		}
		
		public void SetAdicionarParcelas()throws InterruptedException {
			
			clicarBotaoBy(By.linkText("Adicionar Parcela"));
			Thread.sleep(2000);
			
		}
		
		public void SetCondicao(String numero)throws InterruptedException {
			
			clicarBotaoBy(By.id("TipoConfiguracaoLancamentoPersonalizado"));
			Thread.sleep(3000);
			WebElement modalidade = getDriver().findElement(By.id("TipoConfiguracaoLancamentoPersonalizado"));
			Select combomodalidade = new Select(modalidade);
			combomodalidade.selectByValue(numero);
		}
		
		
		
		public void Setdata(String proximadata)throws InterruptedException {
			
			clicarBotaoBy(By.cssSelector("#DataVencimento"));
			Thread.sleep(2000);
			getDriver().findElement(By.cssSelector("#DataVencimento")).sendKeys(proximadata);
			Thread.sleep(2000);
		}
		
		public void SetFormaDePagamento(String numero)throws InterruptedException {
			
			clicarBotaoBy(By.id("FormaPagamentoId"));
			Thread.sleep(2000);
			WebElement modalidade = getDriver().findElement(By.id("FormaPagamentoId"));
			Select combomodalidade = new Select(modalidade);
			combomodalidade.selectByValue(numero);
		}
		
		public void Setresponsavel()throws InterruptedException {
			
			clicarBotaoBy(By.cssSelector("[action='\\/Lancamento\\/Save'] tr:nth-of-type(6) .select"));
			Thread.sleep(2000);
			try {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			} catch (AWTException ex) {
				throw new WebDriverException("VK_PAGE_DOWN", ex);

			}
		}
			
		public void SetEstagioLancamento()throws InterruptedException {
			
			clicarBotaoBy(By.id("EstagioIdEspecificado"));
			Thread.sleep(2000);
			
			try {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_B);
				robot.keyRelease(KeyEvent.VK_B);
			} catch (AWTException ex) {
				throw new WebDriverException("VK_B", ex);

			}
		}
			
			
			//String teclaEsquerda = KeyEvent.("keypress"); 
			//teclaEsquerda.ctrlKey = false;
			//teclaEsquerda.which = 40; //Código da tecla - seta esquerda
//
			//$("botao").trigger(teclaEsquerda);
		//}

		public void SetQuantidadedeparcelas()throws InterruptedException {
			
			clicarBotaoBy(By.id("QuatidadeDeParcelasDoEstagio"));
		
			getDriver().findElement(By.id("QuatidadeDeParcelasDoEstagio")).clear();
			getDriver().findElement(By.id("QuatidadeDeParcelasDoEstagio")).click();
			getDriver().findElement(By.id("QuatidadeDeParcelasDoEstagio")).sendKeys("6");
			Thread.sleep(2000);
		}
		
		
		
		public void SetAdicionar()throws InterruptedException {
			
			clicarBotaoBy(By.id("btnLancamentoSave"));
			Thread.sleep(2000);
			
		}
		
		public void SetClicar()throws InterruptedException {
			
			clicarBotaoBy(By.id("TotalDiferencaLancamentosPersonalizadosDisplayModal"));
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
		
		
		public void Setclicartotal()throws InterruptedException {
			
			clicarBotaoBy(By.cssSelector("#conteudoTabCondicaoFinanceira > div:nth-of-type(1) [colspan]"));
			Thread.sleep(2000);
			
		}
		
		public void SetclicarFecharmodalaviso()throws InterruptedException {
			
			clicarBotaoBy(By.id("botClose1"));
			Thread.sleep(2000);
			
		}
		
		public void SetEstagioLancamento2()throws InterruptedException {
			
			clicarBotaoBy(By.id("EstagioIdEspecificado"));
			Thread.sleep(2000);
			
			try {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_B);
				robot.keyRelease(KeyEvent.VK_B);
				robot.keyPress(KeyEvent.VK_B);
				robot.keyRelease(KeyEvent.VK_B);
			} catch (AWTException ex) {
				throw new WebDriverException("VK_B", ex);

			}
		}

 		public void SetLancarmaterial() throws InterruptedException{
 		
 		clicarBotaoBy(By.linkText("MATERIAL DIDÁTICO"));
 		Tempo(2000);
 		
 	}
 		public void SetAdicionarparcelaMate() throws InterruptedException{
 		
 		clicarBotaoBy(By.id("btnLancamentoNew"));
 		Tempo(2000);
 		
 	}
 	
 		public void SetAdicionarcondicaomaterial(String numero) throws InterruptedException{
 	 		
 	 		clicarBotaoBy(By.id("TipoConfiguracaoLancamentoPersonalizado"));
 	 		Tempo(2000);
 	 		WebElement elemento = getDriver().findElement(By.id("TipoConfiguracaoLancamentoPersonalizado"));
 	 		Select combomodalidade = new Select(elemento);
			combomodalidade.selectByValue(numero);
 	 	}
 	 	
 		public void Setdatamaterial(String proximadata)throws InterruptedException {
			
			clicarBotaoBy(By.cssSelector("#DataVencimento"));
			Thread.sleep(2000);
			getDriver().findElement(By.cssSelector("#DataVencimento")).sendKeys(proximadata);
			Thread.sleep(2000);
		}
 		
 		public void SetAdicionarformadepagamentoMD(String numero) throws InterruptedException{
 	 		
 	 		clicarBotaoBy(By.id("FormaPagamentoId"));
 	 		Tempo(2000);
 	 		WebElement MD = getDriver().findElement(By.id("FormaPagamentoId"));
 	 		Select combomodalidade = new Select(MD);
			combomodalidade.selectByValue(numero);
 	 	}
 		
 		
 		public void SetresponsavelMD()throws InterruptedException {
			
			clicarBotaoBy(By.cssSelector("#lancamento-adicionar .modal-dialog .modal-content [action='\\/Lancamento\\/Save'] .modal-body.smart-form > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(6) [colspan='5'] .select.state-success #ResponsavelId"));
			Thread.sleep(2000);
			try {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			} catch (AWTException ex) {
				throw new WebDriverException("VK_PAGE_DOWN", ex);

			}
			
			clicarBotaoBy(By.cssSelector("#lancamento-adicionar tr:nth-of-type(6) [colspan]"));
		}
 		
 		public void SetValordaparcela() throws InterruptedException{
 	 		
 	 		clicarBotaoBy(By.id("ValorDaRepeticao"));
 	 		Tempo(2000);
 	 		escreveTexto(By.id("ValorDaRepeticao"), "138,33");
 	 		try {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
			} catch (AWTException ex) {
				throw new WebDriverException("VK_TAB", ex);

			}
 	 	}
 		public void Setquantidadeparcela() throws InterruptedException{
 	 		
 	 		//clicarBotaoBy(By.xpath("/html//input[@id='NumeroRepeticoes']"));
 	 		Tempo(2000);
 	 		escreveTexto(By.xpath("/html//input[@id='NumeroRepeticoes']"), "6");
 	 		Tempo(2000);
 	 		
 	 		
 	 	}
 		
 		public void SetAdicionarMD() throws InterruptedException{
 	 		
 	 		clicarBotaoBy(By.id("btnLancamentoSave"));
 	 		Tempo(2000);
 		}
 		
 		public void Ajustarparcela() throws InterruptedException{
 	 		
 	 		clicarBotaoBy(By.cssSelector("#LancamentoGrid tr:nth-of-type(12) .fa-pencil"));
 	 		Tempo(2000);
 		}
 		
 		public void Ajustarparcelalancamento() throws InterruptedException{
 	 		
 	 		clicarBotaoBy(By.cssSelector("#lancamento-editar #ValorParcela"));
 	 		Tempo(3000);
 	 		getDriver().findElement(By.cssSelector("#lancamento-editar #ValorParcela")).clear();
 	 		Tempo(2000);
 	 		getDriver().findElement(By.cssSelector("#lancamento-editar #ValorParcela")).click();
 	 		Tempo(2000);
 	 		getDriver().findElement(By.cssSelector("#lancamento-editar #ValorParcela")).sendKeys("370,26");
 	 		Tempo(2000);
 		}
 		
 		public void Adicionarajuste() throws InterruptedException{
 	 		
 	 	clicarBotaoBy(By.id("btnLancamentoEdit"));
 	 	Tempo(2000);
 		}
 		
 		public void PageUp() throws InterruptedException{
 		
 		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			robot.keyRelease(KeyEvent.VK_PAGE_UP);
			
		} catch (AWTException ex) {
			throw new WebDriverException("VK_PAGE_UP", ex);

		}
	}
 		
}



