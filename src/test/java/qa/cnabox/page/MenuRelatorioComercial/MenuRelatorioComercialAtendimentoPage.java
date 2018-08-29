package qa.cnabox.page.MenuRelatorioComercial;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

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
	
	public void SetSituacaodoAtendido( String Texto) throws InterruptedException{
	
								////Legenda///
		///** 3- ALUNO, 1-CADASTRO, 2-Prospect, 4-Empresa, 5-Ex-Aluno, 6-Suspenso///
	
	Select dropdown = new Select(getDriver().findElement(By.cssSelector(".select2-selection--multiple .select2-selection__rendered")));
	dropdown.selectByValue(Texto);
	Thread.sleep(1000);
	
	}
	
	public void SetTipoatendimento () throws InterruptedException{
		
		
	}
	
	public void Setfiltrartendimento () throws InterruptedException{
		
		clicarBotaoBy(By.id("btnRelatorioAtendimentosFilter"));
		Thread.sleep(1000);
		
	}
	
}
