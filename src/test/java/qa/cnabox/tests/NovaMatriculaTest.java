package qa.cnabox.tests;

import qa.cnabox.core.BaseTest;
import qa.cnabox.page.NovaMatriculaPage;
import static qa.cnabox.core.DriverFactory.getDriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NovaMatriculaTest extends BaseTest {

	NovaMatriculaPage page = new NovaMatriculaPage();

	@Test
	public void DeveRealizarNovaMatriculaPorAtendimento() throws InterruptedException {

		getDriver()
				.findElement(By.xpath(
						"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/a[@href='#']/span[.='Comercial']"))
				.click();
		getDriver().findElement(By.xpath(
				"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/ul[@class='sub-menu']//span[.='Atendimento']"))
				.click();
		Thread.sleep(3000);
		getDriver().findElement(By.xpath("/html//button[@id='btnCreateNewProspect']")).click();
		Thread.sleep(3000);
		getDriver().findElement(By.xpath("/html//input[@id='Nome']")).sendKeys("ALUNO TESTE");
		getDriver().findElement(By.cssSelector("#GridCadastro .row:nth-child(3) [autocomplete]"))
				.sendKeys("teste@teste.com.br");
		getDriver().findElement(By.xpath("/html//input[@id='EmailSecundario']")).click();
		getDriver()
				.findElement(By.xpath(
						"/html//fieldset[@id='GridCadastro']/div[4]/section[@class='col col-12']/div/label[1]/i"))
				.click();
		getDriver().findElement(By.xpath("/html//input[@id='DataNascimento']")).sendKeys(" 14111986 ");
		getDriver()
				.findElement(By.xpath(
						"/html//fieldset[@id='GridCadastro']/div[4]/section[@class='col col-12']/div/label[1]/i"))
				.click();
		// Configuração de seleção de Combobox
		WebElement element = getDriver().findElement(By.xpath("/html//select[@id='EstadoCivilId']"));
		Select combo = new Select(element);
		combo.selectByValue("1");
		// Verificar outra forma de informar o telefone
		getDriver().findElement(By.xpath("/html//input[@id='Telefone']")).sendKeys(" 11997499671 ");
		Thread.sleep(3000);
		// Verificar outra forma de informar o cep.
		getDriver().findElement(By.xpath("/html//input[@id='Endereco_CEP']")).sendKeys("        18045520");
		Thread.sleep(3000);
		getDriver()
				.findElement(By.xpath(
						"/html//fieldset[@id='GridCadastro']/div[4]/section[@class='col col-12']/div/label[1]/i"))
				.click();
		getDriver().findElement(By.xpath("/html//input[@id='Endereco_Numero']")).sendKeys(" 33 ");
		// Comando abaixo não está funcionando. Verificar o porque.
		((JavascriptExecutor) getDriver()).executeScript("scroll(0,800)");
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("//tbody//tr[1]//td[1]//label[1]//i[1]")).click();
		WebElement estagioInteresse = getDriver().findElement(By.xpath(
				"/html//section[@id='widget-grid']/div/div[1]/div[@class='jarviswidget jarviswidget-color-darken']//div[@class='widget-body']/div[@class='smart-form']/fieldset[4]/div[@class='row']/section[@class='col col-12']/table//tr[@class='bg-color-blue txt-color-white']//select[@name='EstagioInteresseId_1']"));
		Select comboEstagioInteresse = new Select(estagioInteresse);
		comboEstagioInteresse.selectByValue("21");
		Thread.sleep(2000);
		((JavascriptExecutor) getDriver()).executeScript("scroll(0,1150)");
		Thread.sleep(2000);
		getDriver()
				.findElement(By
						.xpath("/html//table[@id='datatable_tabletools']/tbody/tr[1]/td[2]/label[@class='checkbox']/i"))
				.click();
		getDriver()
				.findElement(By
						.xpath("/html//table[@id='datatable_tabletools']/tbody/tr[1]/td[3]/label[@class='checkbox']/i"))
				.click();
		getDriver()
				.findElement(By
						.xpath("/html//table[@id='datatable_tabletools']/tbody/tr[1]/td[7]/label[@class='checkbox']/i"))
				.click();
		getDriver().findElement(By.xpath("/html//input[@id='CPF_CNPJ']")).sendKeys("437.054.040-24");
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("/html//input[@id='RG_IE']")).click();
		Thread.sleep(2000);
		WebElement midia = getDriver().findElement(By.cssSelector(
				"#widget-grid > .row:nth-child(1) > [class='col-md-6']:nth-child(1) .jarviswidget.jarviswidget-color-darken > div:nth-child(2) .widget-body > .smart-form:nth-child(1) > fieldset:nth-child(12) > .row:nth-child(5) > [class='col col-6']:nth-child(1) .select [data-val='true']"));
		Select comboMidia = new Select(midia);
		comboMidia.selectByValue("4");
		WebElement campanha = getDriver().findElement(By.xpath("/html//select[@id='CampanhaId']"));
		Select comboCampanha = new Select(campanha);
		comboCampanha.selectByValue("5");
		((JavascriptExecutor) getDriver()).executeScript("scroll(0,000)");
		Thread.sleep(2000);
		getDriver()
				.findElement(By.xpath("//div[@id='row-tipo-atendimento']/section[@class='col col-12']/div/label[3]/i"))
				.click();
		Thread.sleep(1000);
		getDriver().findElement(By.xpath("//div[@id='row-tipo-acao']/section[@class='col col-12']/div/label[6]/i"))
				.click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("/html//textarea[@id='Descricao']")).sendKeys("Teste");
		Thread.sleep(2000);
		getDriver().findElement(By.cssSelector(".form-group [type='button']:nth-of-type(2)")).click();
		

	}

}
