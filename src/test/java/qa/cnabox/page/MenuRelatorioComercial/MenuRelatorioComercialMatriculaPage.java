package qa.cnabox.page.MenuRelatorioComercial;

import org.openqa.selenium.By;

import qa.cnabox.core.BasePage;

public class MenuRelatorioComercialMatriculaPage extends BasePage {
	
	public void SetclicarMenuRelatorio() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(11) .nav-title"));
		Thread.sleep(1000);

	}

	public void SetClicarSubmenu() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(11) li:nth-of-type(2) .menu-item"));
		Thread.sleep(1000);
	}
	
	public void SetClicarSubmenucategoria() throws InterruptedException {

		clicarBotaoBy(By.linkText("Matrículas"));
		Thread.sleep(1000);
	}

	
	public void SetClicarDadosmatricula() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".label-checkbox-relatorio i"));
		Thread.sleep(1000);
	}
	
	public void SetClicarPeriodoDE(String Texto) throws InterruptedException {

		clicarBotaoBy(By.cssSelector(""));
		Thread.sleep(1000);
		}
	
}
