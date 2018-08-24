package qa.cnabox.page;

import qa.cnabox.core.BasePage;
import static qa.cnabox.core.DriverFactory.getDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuComerEmpresasCadastrPage extends BasePage {

	public void SetclicarMenuComercial() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(6) .menu-item"));
		Thread.sleep(1000);

	}

	public void SetClicarEmpresas() throws InterruptedException {

		clicarBotaoBy(By.linkText("Empresas"));
		Thread.sleep(1000);

	}

	public void SetClicarNovaEmpresa() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".list-btn [data-toggle]"));
		Thread.sleep(1000);
	}

	public void SetescreverNome() throws InterruptedException {

		clicarBotaoBy(By.cssSelector("#PessoaEscola_Nome"));
		Thread.sleep(000);
		escreveTexto(By.cssSelector("#PessoaEscola_Nome"), geraNomeAleatorio());
	}

	public void SetescreverRazao() throws InterruptedException {

		clicarBotaoBy(By.cssSelector("#PessoaEscola_Apelido"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("#PessoaEscola_Apelido"), geraEmpresaAleatorio());
	}

	public void BuscaCNPJ() throws InterruptedException {

		Thread.sleep(2000);
		try {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_T);
			} 	
			catch (AWTException ex) {
			throw new WebDriverException("Erro ao digitar CTRL + T", ex);
      
			}
			WebDriverWait wait = new WebDriverWait(getDriver(), 5);
			wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String handle : getDriver().getWindowHandles()) {
        	getDriver().switchTo().window(handle);}
	    Thread.sleep(1000);
        //// Sempre trocar para a pagina desejada como por exemplo: cpf ou cnpj ///
	    getDriver().navigate().to("https://www.4devs.com.br/gerador_de_cnpj");
        Thread.sleep(2000);
        getDriver().findElement(By.cssSelector("[type='button']")).click();
        Thread.sleep(2000);
       
    ////// nesse comando o selenium armazena a variavel atribuida no campo texto_cpf////
        String Textocampo = ObterTextoCampoId("texto_cnpj");
     Thread.sleep(2000);
     getDriver().close();
     Thread.sleep(6000);
     
     ////// Aqui ele vai retornar para a pagina do BOX////
     
     for (String CNABox : getDriver().getWindowHandles()) {
     getDriver().switchTo().window(CNABox);}
     Thread.sleep(2000);
     getDriver().findElement(By.id("PessoaEscola_CPF_CNPJ")).click();
     Thread.sleep(3000);
     
     //// aqui ele vai escrever a variavel armazenada anteriormente///
     getDriver().findElement(By.id("PessoaEscola_CPF_CNPJ")).sendKeys(Textocampo);
     
}
	

	public void SetInscricaoEstadual(String Texto) throws InterruptedException {

		escreveTexto(By.cssSelector("[data-mask='999\\.999\\.999\\.999']"), Texto);
		Thread.sleep(1000);
	}

	public void SetCEP(String texto) throws InterruptedException {

		
	}

	public void SetEnderecoNumero(String texto) throws InterruptedException {

		escreveId("PessoaEscola_Endereco_Numero", texto);
		Thread.sleep(1000);

	}

	public void SetTelefone(String texto) throws InterruptedException {

		escreveId("PessoaEscola_Telefone", texto);
		Thread.sleep(1000);

	}

	public void SetCelular(String Texto) throws InterruptedException {

		escreveId("PessoaEscola_Celular", Texto);
		Thread.sleep(1000);

	}

	public void SetEmail() throws InterruptedException {

		escreveId("PessoaEscola_Email", GeraEmailAleatorio());
		Thread.sleep(1000);
	}

	public void SetTipo() throws InterruptedException {

		Select dropdown = new Select(getDriver().findElement(By.id("TipoEmpresaId")));
		dropdown.selectByValue("3");
		Thread.sleep(1000);
	}
	
	public void Tempo (int Tempo) throws InterruptedException {
		
		Thread.sleep(Tempo);
	}

}
