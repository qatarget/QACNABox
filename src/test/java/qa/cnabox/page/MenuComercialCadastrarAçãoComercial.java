package qa.cnabox.page;

import qa.cnabox.core.BasePage;
import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;


public class MenuComercialCadastrarAçãoComercial extends BasePage {

	public void SetClicarMenuComercial() {
		clicarBotaoBy(
				By.xpath("//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/a[@href='#']/span[.='Comercial']"));
	}

	public void SetClicarSubMenuAçãoComercial() {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(6) li:nth-of-type(1) span"));
	}

	public void AguardaCarregarPagina() throws InterruptedException {
		Thread.sleep(3000);
	}

	public void SetClicarCadastrarAçãoComercial() {
		clicarBotaoBy(By.cssSelector(".btn-success.hidden-mobile"));
	}

	public void SetEscreveNomeAçãoComercial(String Texto) {
		escreveId("#Nome", Texto);
	}

	public void SetEscreveBudgetAção(String Budget) {
		escreveId(".money", Budget);
	}

	public void SetEscreveNomeContato() {
		escreveId("#ContatoNome", geraNomeAleatorio());

	}

}
