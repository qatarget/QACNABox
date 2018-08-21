package qa.cnabox.page;

import qa.cnabox.core.BasePage;
import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;



public class MenuComerEmpresasCadastrPage extends BasePage {
	
	public void SetclicarMenuComercial () throws InterruptedException  {
		
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(6) .menu-item"));
		Thread.sleep(1000);
		
	}
	
	public void SetClicarEmpresas () throws InterruptedException {
		
		clicarBotaoBy(By.linkText("Empresas"));
		Thread.sleep(1000);
		
	}

	
	public void SetClicarNovaEmpresa () throws InterruptedException{
		
		clicarBotaoBy(By.cssSelector(".list-btn [data-toggle]"));
		Thread.sleep(1000);
	}


	public void SetescreverNome () throws InterruptedException {
	 
		clicarBotaoBy(By.cssSelector("#PessoaEscola_Nome"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("PessoaEscola_Nome"), geraNomeAleatorio());
}

	public void SetescreverRazão () throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#PessoaEscola_Apelido"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("#PessoaEscola_Apelido"), geraEmpresaAleatorio() );
	}

	public void SetescreverCNPJ () throws InterruptedException {}
}
