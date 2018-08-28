package qa.cnabox.page.MenuComercial;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class MenuComercialAtendimentoFiltroPage {
	
	
	public void DeveRealizarFiltroDeProspectPorNome() throws InterruptedException {
		getDriver()
				.findElement(By.xpath(
						"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/a[@href='#']/span[.='Comercial']"))
				.click();
		getDriver().findElement(By.xpath(
				"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/ul[@class='sub-menu']//span[.='Atendimento']"))
				.click();
		Thread.sleep(3000);
		getDriver().findElement(By.cssSelector("#AtendimentoNome")).sendKeys("ALUNO TESTE");
		getDriver().findElement(By.cssSelector("#btnAtendimentoFilter")).click();
		Thread.sleep(3000);
		Assert.assertEquals("ALUNO TESTE",
				getDriver().findElement(By.cssSelector("#AtendimentoNome")).getAttribute("value"));

	}


	public void DeveRealizarFiltroDeProspectPorEmail() throws InterruptedException {
		getDriver()
				.findElement(By.xpath(
						"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/a[@href='#']/span[.='Comercial']"))
				.click();
		getDriver().findElement(By.xpath(
				"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/ul[@class='sub-menu']//span[.='Atendimento']"))
				.click();
		Thread.sleep(3000);
		getDriver().findElement(By.cssSelector("#AtendimentoEmail")).sendKeys("TESTE@TESTE.COM.BR");
		getDriver().findElement(By.cssSelector("#btnAtendimentoFilter")).click();
		Thread.sleep(3000);
		Assert.assertEquals("TESTE@TESTE.COM.BR",
				getDriver().findElement(By.cssSelector("#AtendimentoEmail")).getAttribute("value"));
	}

	
	public void DeveRealizarFiltroDeProspectPorTelefone() throws InterruptedException {
		getDriver()
				.findElement(By.xpath(
						"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/a[@href='#']/span[.='Comercial']"))
				.click();
		getDriver().findElement(By.xpath(
				"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/ul[@class='sub-menu']//span[.='Atendimento']"))
				.click();
		Thread.sleep(3000);
		getDriver().findElement(By.cssSelector("#AtendimentoTelefone")).sendKeys("  1997499671 ");
		getDriver().findElement(By.cssSelector("#btnAtendimentoFilter")).click();
		Thread.sleep(3000);
		Assert.assertEquals("(19) 9749-9671",
				getDriver().findElement(By.cssSelector("#AtendimentoTelefone")).getAttribute("value"));
	}
}



