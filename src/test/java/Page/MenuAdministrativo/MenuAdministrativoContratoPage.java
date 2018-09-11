package Page.MenuAdministrativo;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import qa.cnabox.core.BasePage;

public class MenuAdministrativoContratoPage extends BasePage {
	
	
	public void SetClicarMenuAdministrativo() throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(7) .nav-title"));
		Thread.sleep(2000);
	}
	
	public void SetBot�oCaixa()throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector(".btnCaixaContrato"));
		Thread.sleep(2000);
		
	}
	
	public void SetGerarBoletos() throws InterruptedException {
		getDriver().switchTo().frame(0);
		clicarBotaoBy(By.linkText("Gerar Boletos"));
		Thread.sleep(2000);
		
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
		
		clicarBotaoBy(By.cssSelector("btnGerarBoletos"));
		Thread.sleep(2000);
		
	}
	

}
