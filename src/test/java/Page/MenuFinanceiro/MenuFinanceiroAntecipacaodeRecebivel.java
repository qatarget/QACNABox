package Page.MenuFinanceiro;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import qa.cnabox.core.BasePage;




public class MenuFinanceiroAntecipacaodeRecebivel extends BasePage {

	public void SetclicarMenuFinanceiro () throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(9) .nav-title"));
		Thread.sleep(2000);
	}

	public void SetclicarMenuAntecipacaorecebiveis () throws InterruptedException {
		
		clicarBotaoBy(By.linkText("Antecipação de Recebível"));
		Thread.sleep(2000);
	}
	

	public void ClicaremNovaOperação () throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector(".btn-success"));
		Thread.sleep(2000);
	}
	
	
	public void ClicarTipo (String Nome) throws InterruptedException {
		
		WebElement element = getDriver().findElement(By.cssSelector("#TipoAntecipacaoRecebivelId"));
		Select combo = new Select(element);
		combo.selectByValue(Nome);
		
		
	}
	
	public void SelecionarOperacao (String operacao) throws InterruptedException{
		
		WebElement element = getDriver().findElement(By.cssSelector("#OperacaoSelectorId"));
		Select combo = new Select(element);
		combo.selectByValue(operacao);
	}
	
	public void ClicarOperadora () throws InterruptedException {
		
		WebElement element = getDriver().findElement(By.cssSelector("#OperadoraCartaoId"));
		Select combo = new Select(element);
		combo.selectByValue("1837");
		
		
	}
	
	public void clicarfiltrar() throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#frmFilterCreate [type]"));
		Thread.sleep(2000);
		
	}
	
	public void Setclicarnasparcelas () throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#content-movimentos .smart-form:nth-of-type(1) i"));
		Thread.sleep(2000);
		clicarBotaoBy(By.cssSelector("#content-movimentos .smart-form:nth-of-type(2) i"));
		Thread.sleep(2000);
		
}
	
	
}
