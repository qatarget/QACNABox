package qa.cnabox.page;

import qa.cnabox.core.BasePage;
import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



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

	public void SetescreverCNPJ () throws InterruptedException {
		
		escreveId("PessoaEscola_CPF_CNPJ", gerarcnpj(true));
		Thread.sleep(1000);
	}
	
	
	public void SetInscricaoEstadual (String Texto) throws InterruptedException {
		
		escreveId("PessoaEscola_RG_IE", Texto);
	}
	
	public void SetCEP (String texto) throws InterruptedException {
		
		escreveId("PessoaEscola_Endereco_CEP", texto);
		Thread.sleep(1000);
	}
	
	public void SetEnderecoNumero (String texto) throws InterruptedException{
		
		escreveId("PessoaEscola_Endereco_Numero", texto);
		Thread.sleep(1000);
	
	}
	
	public void SetTelefone (String texto) throws InterruptedException{
		
		escreveId("PessoaEscola_Telefone", texto);
		Thread.sleep(1000);
		
	
	}
	
	public void SetCelular (String Texto) throws InterruptedException {
		
		escreveId("PessoaEscola_Celular", Texto);
		Thread.sleep(1000);
		
	}
	
	public void SetEmail () throws InterruptedException{
		
		escreveId("PessoaEscola_Email", GeraEmailAleatorio());
		Thread.sleep(1000);
	}
	
	public void SetTipo () throws InterruptedException{
		
		Select dropdown = new Select(getDriver().findElement(By.id("TipoEmpresaId")));
		dropdown.selectByValue("3");
		
	}
	
	}
