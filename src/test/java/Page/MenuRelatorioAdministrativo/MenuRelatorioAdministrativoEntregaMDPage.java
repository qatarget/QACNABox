package Page.MenuRelatorioAdministrativo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;

import qa.cnabox.core.BasePage;

public class MenuRelatorioAdministrativoEntregaMDPage extends BasePage {
	
	public void SetclicarMenuRelatorio() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(11) .nav-title span"));
		Thread.sleep(1000);

	}

	public void SetClicarSubmenucategoria() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(1) .menu-item span"));
		Thread.sleep(1000);
	}
	
	public void SetClicarSubmenuEntrega() throws InterruptedException {

		clicarBotaoBy(By.linkText("Entrega de Material Didático"));
		Thread.sleep(1000);
	}

	public void Dadosdoaluno() throws InterruptedException {

		clicarBotaoBy(By.cssSelector("#accordion-avaliacao .panel-default:nth-of-type(1) .label-checkbox-relatorio i"));
		Thread.sleep(1000);
		
	}
	
	public void Dadosdoresponsavel() throws InterruptedException {

		clicarBotaoBy(By.cssSelector("#accordion-avaliacao .panel-default:nth-child(3) .label-checkbox-relatorio i"));
		Thread.sleep(1000);
		
	}
	
	public void DadosdoMD() throws InterruptedException {

		clicarBotaoBy(By.cssSelector("#accordion-avaliacao .panel-default:nth-child(5) .label-checkbox-relatorio i"));
		Thread.sleep(1000);
		
	}

	public void rolar() throws InterruptedException {

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

	public void Dadosdocontrato() throws InterruptedException {

		clicarBotaoBy(By.cssSelector("#accordion-avaliacao .panel-default:nth-child(7) .label-checkbox-relatorio i"));
		Thread.sleep(1000);
		
	}

	public void Gerar() throws InterruptedException {

		clicarBotaoBy(By.cssSelector("[type='submit']"));
		Thread.sleep(1000);
		
	}
	
	public void Tempo (int d)throws InterruptedException {
		
		Thread.sleep(d);
	}
	
}


