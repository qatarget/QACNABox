package qa.cnabox.page.MenuComercial;


import qa.cnabox.core.BasePage;
import static qa.cnabox.core.DriverFactory.getDriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;





public class MenuGerencialSuspensaopedentePage extends BasePage {

	public void SetclicarMenuComercial() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(6) .menu-item"));
		Thread.sleep(1000);
		} 
	
	public void SetrolarMenuPrincipal () {
		
		((JavascriptExecutor) getDriver()).executeScript("scroll(0,500)");
	}

	public void SetclicarFiltro() throws InterruptedException {

		clicarBotaoBy(By.id("btnSuspensaoFilter"));
		Thread.sleep(1000);
		} 
	
	public void SetClicarmenuSuspensaoPendente() throws InterruptedException {

			clicarBotaoBy(By.linkText("Suspensão Pendente"));
			Thread.sleep(1000);
			}
	
	public void RolarPagina() {
		
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		} 	
		catch (AWTException ex) {
		throw new WebDriverException("VK_PAGE_DOWN", ex);
  
		}
}


	public void Setselecionaralunos() throws InterruptedException{
		clicarBotaoBy(By.cssSelector("tbody tr:nth-of-type(49) .txt-color-green i"));
		clicarBotaoBy(By.cssSelector("tbody tr:nth-of-type(50) .txt-color-green i"));
	
	
	}

	public void SetselecionarAprovar() throws InterruptedException{
		
		clicarBotaoBy(By.cssSelector("#btnAprovarSuspensao"));
		Thread.sleep(1000);
	}


	public void SetDescricao() throws InterruptedException{
		
		clicarBotaoBy(By.cssSelector("textarea"));
		Thread.sleep(1000);
		getDriver().findElement(By.cssSelector("textarea")).sendKeys("Sim");
	}
	
	
	
		public void Tempo (int Tempo) throws InterruptedException {
		
		Thread.sleep(Tempo);
		
	}
		public void SetDescricaosalvar() throws InterruptedException{
			
			clicarBotaoBy(By.className("btn btn-primary"));
			Thread.sleep(1000);
		}
		
		
}
