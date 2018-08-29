package Page.MenuComercial;

import qa.cnabox.core.BasePage;


import org.openqa.selenium.By;


public class MenuComercialCadastrarA��oComercial extends BasePage {

	public void SetClicarMenuComercial() {
		clicarBotaoBy(
				By.xpath("//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/a[@href='#']/span[.='Comercial']"));
	}

	public void SetClicarSubMenuA��oComercial() {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(6) li:nth-of-type(1) span"));
	}

	public void AguardaCarregarPagina() throws InterruptedException {
		Thread.sleep(3000);
	}

	public void SetClicarCadastrarA��oComercial() {
		clicarBotaoBy(By.cssSelector(".btn-success.hidden-mobile"));
	}

	public void SetEscreveNomeA��oComercial(String Texto) {
		escreveId("#Nome", Texto);
	}

	public void SetEscreveBudgetA��o(String Budget) {
		escreveId(".money", Budget);
	}

	public void SetEscreveNomeContato() {
		escreveId("#ContatoNome", geraNomeAleatorio());

	}

}
