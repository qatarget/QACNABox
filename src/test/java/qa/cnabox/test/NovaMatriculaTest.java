package qa.cnabox.test;

import org.junit.Test;
import org.openqa.selenium.By;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

import javafx.scene.control.Tab;

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
		getDriver().findElement(By.xpath("/html//input[@id='DataNascimento']")).sendKeys("14071986");
		getDriver()
		.findElement(By.xpath(
				"/html//fieldset[@id='GridCadastro']/div[4]/section[@class='col col-12']/div/label[1]/i"))
		.click();

	}
}