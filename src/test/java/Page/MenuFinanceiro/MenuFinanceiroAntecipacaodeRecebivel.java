package Page.MenuFinanceiro;

import org.openqa.selenium.By;

import qa.cnabox.core.BasePage;




public class MenuFinanceiroAntecipacaodeRecebivel extends BasePage {

	public void SetclicarMenuFinanceiro () throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(9) .nav-title"));
		Thread.sleep(2000);
	}

	public void SetclicarMenuAntecipacaorecebiveis () throws InterruptedException {
		
		clicarBotaoBy(By.linkText("Antecipa��o de Receb�vel"));
		Thread.sleep(2000);
	}
	




}
