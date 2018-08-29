package qa.cnabox.page.MenuRelatorioComercial;

import org.openqa.selenium.By;

import qa.cnabox.core.BasePage;

public class MenuRelatorioComercialAtendimentoPage extends BasePage {

	
	
	public void SetclicarMenuComercial() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(11) li:nth-of-type(2) .menu-item"));
		Thread.sleep(1000);

	}

	public void SetClicarEmpresas() throws InterruptedException {

		clicarBotaoBy(By.linkText("Atendimentos"));
		Thread.sleep(1000);
	}
	
	
	public void SetSelecionarPeriodoDe(String Texto) throws InterruptedException{
		
		clicarBotaoBy(By.cssSelector("#DataRealizacaoAtendimentoDe"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("#DataRealizacaoAtendimentoDe"), Texto);
	}
	
public void SetSelecionarPeriodoAte(String Texto) throws InterruptedException{
		
		clicarBotaoBy(By.cssSelector("#DataRealizacaoAtendimentoAte"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("#DataRealizacaoAtendimentoAte"), Texto);
	}
}
