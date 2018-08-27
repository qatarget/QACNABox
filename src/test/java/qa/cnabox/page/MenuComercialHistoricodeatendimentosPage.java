package qa.cnabox.page;


import qa.cnabox.core.BasePage;
import static qa.cnabox.core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class MenuComercialHistoricodeatendimentosPage extends BasePage {

	public void SetclicarMenuComercial() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(6) .menu-item"));
		Thread.sleep(1000);
		}

	public void SetClicarHistoricodeatendimento() throws InterruptedException {

		clicarBotaoBy(By.linkText("Histórico de Atendimentos"));
		Thread.sleep(1000);
		}

	public void SetClicaremfiltrar() throws InterruptedException {

		clicarBotaoBy(By.cssSelector("#order-form footer [type='button']:nth-child(1)"));
		Thread.sleep(1000);
	}

	public void SetClicaremPeriodoDE(String texto) throws InterruptedException {

		clicarBotaoBy(By.cssSelector("#DataRealizacaoAtendimentoDe"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("#DataRealizacaoAtendimentoDe"),texto);
	
	}
	
	public void SetPeriodoate (String texto) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#DataRealizacaoAtendimentoAte"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("#DataRealizacaoAtendimentoAte"),texto);
		Thread.sleep(1000);
		clicarBotaoBy(By.cssSelector("#wid-filtro header"));
	}
	
	public void Situaçãodoatendido() throws InterruptedException{
		
		                    ///Legendas////
		/// 3-Aluno, 5-Ex-aluno, 2-Prospect, 1-Cadastro, 6-Suspenso, 4-Empresa/////
		
		
		Select dropdown = new Select(getDriver().findElement(By.id("TipoSituacaoPessoaEscola")));
		dropdown.selectByValue("3");
		Thread.sleep(1000);;
		
	}

	
	public void CategoriadoAtendimento() throws InterruptedException{
		
							///Legendas////
		//// 1-Comercial, 2- Pedagógico, 3-Financeiro, 11-Adiministrativo////
		
		Select dropdown = new Select(getDriver().findElement(By.id("CategoriaAtendimentoId")));
		dropdown.selectByValue("11");
		Thread.sleep(1000);
		}

	public void TipodoAtendimento() throws InterruptedException{
		
					///Legendas////
	/// 2- eletronico,3-Pessoal,1-telefonico,4-SMS/////
	
		
		Select dropdown = new Select(getDriver().findElement(By.id("TipoAtendimentoId")));
		dropdown.selectByValue("3");
		Thread.sleep(1000);

}
	
	public void Setopcoesefetivoou (String texto) throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("#order-form [class='col col-4']:nth-of-type(3) .radio:nth-of-type(1) i"));
		Thread.sleep(1000);
	
	
	}
	
	public void SetExportar() throws InterruptedException{
		
		Thread.sleep(1000);
		clicarBotaoBy(By.cssSelector("#order-form [href]"));
		Thread.sleep(1000);
		
	}
	
public void Tempo (int Tempo) throws InterruptedException {
		
		Thread.sleep(Tempo);
	}
}
