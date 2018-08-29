package Page.MenuComercial;

import qa.cnabox.core.BasePage;
import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MenuComercialCadastrarParceiroPage extends BasePage {

	public void SetClicarMenuComercial() {
		clicarBotaoBy(
				By.xpath("//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/a[@href='#']/span[.='Comercial']"));
	}

	public void SetClicarSubMenuParceiro() {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(6) li:nth-of-type(8) span"));
	}

	public void AguardaCarregarPagina() throws InterruptedException {
		Thread.sleep(3000);
	}

	public void SetClicarCadastrarParceiro() {
		clicarBotaoBy(By.cssSelector("#btnNew"));
	}

	public void SetCategoria(String numerocategoria) {
		WebElement element = getDriver().findElement(By.cssSelector(
				"[action='\\/EmpresasParceiras\\/Save'] .jarviswidget.jarviswidget-color-darken > div:nth-child(2) .widget-body .smart-form > fieldset:nth-child(1) > .row:nth-child(2) > [class='col col-6']:nth-child(1) .select [data-val='true']"));
		Select comboCategoria = new Select(element);
		comboCategoria.selectByValue(numerocategoria);
	}

	public void SetescreverNomeParceiro() throws InterruptedException {

		clicarBotaoBy(By.cssSelector("#Empresa_PessoaEscola_Nome"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("#Empresa_PessoaEscola_Nome"), geraEmpresaAleatorio());

	}

	public void SetInscricaoEstadual(String Texto) {

		escreveId("PessoaEscola_RG_IE", Texto);
	}

	public void SetescreverCNPJ(String NumeroCNPJ) throws InterruptedException {

		escreveId("Empresa_PessoaEscola_CPF_CNPJ", NumeroCNPJ);
		Thread.sleep(1000);
	}

	public void SetEscreverQtdeFuncionarios(String Texto) {

		escreveId("QuantidadeFuncionarios", Texto);
	}

	public void SetRolarAPagina() {

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,200)", "");
	}

	public void SetEscreverNomeContato() throws InterruptedException {

		clicarBotaoBy(By.cssSelector("#Contato"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("#Contato"), geraNomeAleatorio());

	}

	public void SetTelefoneCelular(String numero) {
		escreveId("Empresa_PessoaEscola_Celular", numero);
	}

	public void SetTelefoneComercial(String numero) {
		escreveId("Empresa_PessoaEscola_Telefone", numero);
	}

	public void SetEscreveEmail() {
		escreveId("Empresa_PessoaEscola_Email", GeraEmailAleatorio());
	}

	public void SetCep(String CEP) {
		escreveId("Empresa_PessoaEscola_Endereco_CEP", CEP);
	}

	public void SetNumeroEnderecoParceiro(String numero) {
		escreveId("Empresa_PessoaEscola_Endereco_Numero", numero);

	}

	public void SetSalvar() {
		clicarbotao("btnEmpresaParceiraSave");
	}
	
	public void SetoRolarCimaSemPageUP() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,-1500)", "");
	}
}
