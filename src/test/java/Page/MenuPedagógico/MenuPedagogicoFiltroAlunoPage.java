package Page.MenuPedag�gico;

import qa.cnabox.core.BasePage;
import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MenuPedagogicoFiltroAlunoPage  extends BasePage {

	public void SetClicarMenuPedag�gico() {

		getDriver().findElement(By.cssSelector(".nav-left-bar li:nth-of-type(8) .menu-item span")).click();

	}
	
	public void SetClicarAlunos() throws InterruptedException {
		
		getDriver().findElement(By.cssSelector(".nav-left-bar li:nth-of-type(8) li:nth-of-type(1) span")).click();
		Thread.sleep(3000);
	}
	
	public void SetNomeAluno(String nomeAluno) {
		
		escreveTexto(By.cssSelector("#Nome"), nomeAluno);
				
	}

}
