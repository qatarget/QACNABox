package Page.MenuAdministrativo;

import static qa.cnabox.core.DriverFactory.getDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import qa.cnabox.core.BasePage;

public class MenuAdministrativoContratoPage extends BasePage {
	
	public void SetClicarMenuAdministrativo() throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(7) .nav-title"));
		Thread.sleep(2000);
	}
	
	public void SetClicarContratos() throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(7) > .sub-menu:nth-child(2) > li:nth-of-type(3)"));
		Thread.sleep(2000);
	}
	
	public void SetFiltrarcontratos() throws InterruptedException {
		clicarBotaoBy(By.id("Nome"));
		Thread.sleep(2000);
	}
	
	public void SetPesquisaContratoNome(String Nome) throws InterruptedException {
		escreveTexto(By.id("Nome"), Nome);
		Thread.sleep(2000);
	}
	
	public void SetClicaremfiltrar() throws InterruptedException {
		clicarBotaoBy(By.id("btnContratoFilter"));
		Thread.sleep(2000);
	}
	
	public void RolarPaginaPageDown() {

		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		} catch (AWTException ex) {
			throw new WebDriverException("VK_PAGE_DOWN", ex);

		}
	}
	
	public void Setbot�oAcoes() throws InterruptedException {
		clicarBotaoBy(By.cssSelector("tbody tr:nth-of-type(2) .text-center .fa-search"));
		Thread.sleep(2000);
	}
	
	
	public void SetBot�oCaixa()throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector(".btnCaixaContrato"));
		Thread.sleep(2000);
		
	}
	
	public void SetGerarBoletosclick ()throws InterruptedException {
		
		getDriver().findElement(By.id("btnCaixaContrato")).click();
		
	//	try {
	//	  Robot bot = new Robot();
	//	    bot.mouseMove(x, y);    
	//	    bot.mousePress(InputEvent.getMaskForButton(1));
	//	    bot.mouseRelease(InputEvent.BUTTON1_MASK);
	//	}
	//	catch (AWTException ex) {
	//		throw new WebDriverException("VK_PAGE_DOWN", ex);

	//	}
		//getDriver().findElement(By.id("btnCaixaContrato")).click();
		
}
	
	public void SetLayout(String forma)throws InterruptedException {
		
		clicarBotaoBy(By.id("TipoLayoutBoletoId"));
		Thread.sleep(2000);
		WebElement Formapg = getDriver().findElement(By.id("TipoLayoutBoletoId"));
		Select comboforma = new Select(Formapg);
		comboforma.selectByValue(forma);
	}
		
	
	public void Setmodalidadeboleto(String forma)throws InterruptedException {
		
		clicarBotaoBy(By.id("TipoBoleto"));
		Thread.sleep(2000);
		WebElement Formapg = getDriver().findElement(By.id("TipoBoleto"));
		Select comboforma = new Select(Formapg);
		comboforma.selectByValue(forma);
	}
    
	
	public void Settipoconta (String Conta) throws InterruptedException {
		
		clicarBotaoBy(By.id("ContaCorrenteId"));
		Thread.sleep(2000);
		WebElement Contapg = getDriver().findElement(By.id("ContaCorrenteId"));
		Select comboConta = new Select(Contapg);
		comboConta.selectByValue(Conta);
	
	}
	
	public void SetCarteiraID (String Carteira) throws InterruptedException {
		
		clicarBotaoBy(By.id("ContaCorrenteCarteiraId"));
		Thread.sleep(2000);
		WebElement Carteirapg = getDriver().findElement(By.id("ContaCorrenteCarteiraId"));
		Select comboCarteira = new Select(Carteirapg);
		comboCarteira.selectByValue(Carteira);
	
	}
	
	public void SetBot�oGerar()throws InterruptedException {
		
		clicarBotaoBy(By.id("btnGerarBoletos"));
		Thread.sleep(2000);
		
	}
		public void Tempo (int Tempo) throws InterruptedException {
		
		Thread.sleep(Tempo);
	}

		public void Setclicartotal()throws InterruptedException {
			
			clicarBotaoBy(By.cssSelector("#conteudoTabCondicaoFinanceira > div:nth-of-type(1) [colspan]"));
			Thread.sleep(2000);
			
		}

}
