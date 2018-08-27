package qa.cnabox.page;


import qa.cnabox.core.BasePage;
import static qa.cnabox.core.DriverFactory.getDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuComercialHistoricodeatendimentosPage extends BasePage {

	public void SetclicarMenuComercial() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(6) .menu-item"));
		Thread.sleep(1000);
		}

	public void SetClicarEmpresas() throws InterruptedException {

		clicarBotaoBy(By.linkText("Histórico de Atendimentos"));
		Thread.sleep(1000);
		}

	public void SetClicaremfiltrar() throws InterruptedException {

		clicarBotaoBy(By.cssSelector("#order-form footer [type='button']:nth-child(1)"));
		Thread.sleep(1000);
	}

	public void SetClicaremPeriodoDE(String texto) throws InterruptedException {

		clicarBotaoBy(By.cssSelector("#DataRealizacaoAtendimentoDe"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("#DataRealizacaoAtendimentoDe"),texto);
	
	}
	
	public void SetPeriodoate (String texto) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#DataRealizacaoAtendimentoAte"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("#DataRealizacaoAtendimentoAte"),texto);
		
	}

}
