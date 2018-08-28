package qa.cnabox.page.MenuComercial;

import qa.cnabox.core.BasePage;
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



public class MenuComercialCadastrarProspectPage extends BasePage {

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

	public void SetRolarAPagina(){

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

	public void BuscaCPF()  throws InterruptedException{
			
		Thread.sleep(2000);
			try {
					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_T);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_T);
				} 	
				catch (AWTException ex) {
				throw new WebDriverException("Erro ao digitar CTRL + T", ex);
	      
				}
				WebDriverWait wait = new WebDriverWait(getDriver(), 5);
				wait.until(ExpectedConditions.numberOfWindowsToBe(2));

	        for (String handle : getDriver().getWindowHandles()) {
	        	getDriver().switchTo().window(handle);}
		    Thread.sleep(1000);
	        //// Sempre trocar para a pagina desejada como por exemplo: cpf ou cnpj ///
		    getDriver().navigate().to("https://www.4devs.com.br/gerador_de_cpf");
	        Thread.sleep(2000);
	        getDriver().findElement(By.cssSelector("[type='button']")).click();
	        Thread.sleep(2000);
	       
	    ////// nesse comando o selenium armazena a variavel atribuida no campo texto_cpf////
	        String Textocampo = ObterTextoCampoId("texto_cpf");
	     Thread.sleep(2000);
	     getDriver().close();
	     Thread.sleep(6000);
	     
	     ////// Aqui ele vai retornar para a pagina do BOX////
	     
	     for (String CNABox : getDriver().getWindowHandles()) {
	     getDriver().switchTo().window(CNABox);}
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
		WebElement midia = getDriver().findElement(By.cssSelector(
				"#widget-grid > .row:nth-child(1) > [class='col-md-6']:nth-child(1) .jarviswidget.jarviswidget-color-darken > div:nth-child(2) .widget-body > .smart-form:nth-child(1) > fieldset:nth-child(12) > .row:nth-child(5) > [class='col col-6']:nth-child(1) .select [data-val='true']"));
		Select comboMidia = new Select(midia);
		comboMidia.selectByValue(numeroMidia);
	}

	public void SetSelecionarCampanha(String numeroCampanha) {
		WebElement campanha = getDriver().findElement(By.xpath("/html//select[@id='CampanhaId']"));
		Select comboCampanha = new Select(campanha);
		comboCampanha.selectByValue(numeroCampanha);
	}

	public void SetSelecionarTipoAtendimento() {

		clicarBotaoBy(By.cssSelector("#row-tipo-atendimento .radio:nth-of-type(1) i"));

	}

	public void SetSelecionarAcaoRealizada() {

		clicarBotaoBy(By.cssSelector("#row-tipo-acao .radio:nth-of-type(3) i"));

	}

	public void SetEscreverDescricao() {
		escreveId("Descricao", "Teste");
	}

	public void SetSalvar() {
		clicarbotao("btnProspectSaveTesteNivel");
	}

	public void SetRolarPaginaParaCima() {
		rolarParaCimaPageUP();
	}
	
	public void SetoRolarCimaSemPageUP() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,-1500)", "");
	}
	
	
	
}
