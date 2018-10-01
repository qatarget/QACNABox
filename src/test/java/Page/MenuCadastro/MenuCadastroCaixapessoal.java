package Page.MenuCadastro;

import qa.cnabox.core.BasePage;
import static qa.cnabox.core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class MenuCadastroCaixapessoal extends BasePage {
 
	public void SetclicarMenuCadastro() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(10) .menu-item"));
		Thread.sleep(1000);
		} 

	
	
	
	
}
