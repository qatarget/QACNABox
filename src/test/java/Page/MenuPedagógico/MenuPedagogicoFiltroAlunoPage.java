package Page.MenuPedagógico;

import qa.cnabox.core.BasePage;
import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;


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

}
