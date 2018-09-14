package Page.MenuPedagógico;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import qa.cnabox.core.BasePage;


public class MenuPedagogicoFiltroAlunoPage extends BasePage {

	public void SetClicarMenuPedagógico() {

		getDriver().findElement(By.cssSelector(".nav-left-bar li:nth-of-type(8) .menu-item span")).click();

	}

	public void SetClicarAlunos() throws InterruptedException {

		getDriver().findElement(By.cssSelector(".nav-left-bar li:nth-of-type(8) li:nth-of-type(1) span")).click();
		Thread.sleep(3000);
	}

	public void SetNomeAluno(String nomeAluno) {

		escreveTexto(By.cssSelector("#Nome"), nomeAluno);

	}

	public void ClicarBotãoFIltrar() throws InterruptedException {

		getDriver().findElement(By.cssSelector("#order-form footer [type='button']:nth-of-type(1)")).click();
		Thread.sleep(3000);
	}
	
	
	public void SetRolarAPagina() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(2000);
	}

}
