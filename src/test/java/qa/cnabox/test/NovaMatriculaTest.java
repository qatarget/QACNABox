package qa.cnabox.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static qa.cnabox.core.DriverFactory.getDriver;

public class NovaMatriculaTest {

	private LoginTest login = new LoginTest();

	@Test
	public void DeveRealizarNovaMatriculaPorAtendimento() throws InterruptedException {

		login.DeveRealizarLogin();

		getDriver()
				.findElement(By.xpath(
						"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/a[@href='#']/span[.='Comercial']"))
				.click();
		getDriver().findElement(By.xpath(
				"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/ul[@class='sub-menu']//span[.='Atendimento']"))
				.click();
		Thread.sleep(1500);
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
		getDriver().findElement(By.xpath("/html//input[@id='IdiomaId']")).click();
		Thread.sleep(3000);

	}
}