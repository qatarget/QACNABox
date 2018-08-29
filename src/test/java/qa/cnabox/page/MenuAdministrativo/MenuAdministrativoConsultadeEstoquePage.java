package qa.cnabox.page.MenuAdministrativo;
import qa.cnabox.core.BasePage;
import static qa.cnabox.core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class MenuAdministrativoConsultadeEstoquePage extends BasePage {


	public void SetclicarMenuComercial() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(7) .menu-item"));
		Thread.sleep(1000);
		} 
	
	public void SetrolarMenuPrincipal () {
		
		((JavascriptExecutor) getDriver()).executeScript("scroll(0,500)");
	}

	public void SetclicarFiltro() throws InterruptedException {

		clicarBotaoBy(By.id("btnEstoqueFilter"));
		Thread.sleep(1000);
		} 
	
	public void SetClicarmenuConsultaEstoque() throws InterruptedException {

			clicarBotaoBy(By.linkText("Consulta de Estoque"));
			Thread.sleep(1000);
			}

	public void SetClicarAtualizarEstoque () throws InterruptedException{
		
		clicarBotaoBy(By.cssSelector("[data-value='9733']"));
		Thread.sleep(1000);
		
	}

	public void SetAdicionarQuantidade (String Texto) throws InterruptedException{
		
		clicarBotaoBy(By.id("Quantidade"));
		Thread.sleep(1000);
		escreveTexto(By.id("Quantidade"), Texto);
	}
	
	public void SetAdicionarTipo () throws InterruptedException{
		
		////Legendas//
		//// (1)-Entrada, (2) Saída/////
		clicarBotaoBy(By.cssSelector(".inline-group .radio:nth-of-type(1) i"));
		Thread.sleep(1000);
		
	}

	public void SetObservacoes () throws InterruptedException{
		
		
		clicarBotaoBy(By.cssSelector("#Descricao"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("#Descricao"), GerarTituloAleatorio());
	}
	
	public void Setclicaremregistrar () throws InterruptedException{
		
		clicarBotaoBy(By.id("btnEstoqueMovimentacaoSave"));
		Thread.sleep(1000);
	}
	

	public void Sethistorico() throws InterruptedException{
		
		clicarBotaoBy(By.cssSelector("tbody tr:nth-of-type(1) .btn-info"));
		Thread.sleep(1000);
		
	}

	public void SethistoricoFiltrar() throws InterruptedException{
		
		clicarBotaoBy(By.cssSelector("[action] button"));
		Thread.sleep(1000);
	}
	
	

	public void Tempo (int Tempo) throws InterruptedException {
	
	Thread.sleep(Tempo);
	}

	public void Sethistoricovoltar() throws InterruptedException{
		
		clicarBotaoBy(By.cssSelector("[class='col-xs-12 col-sm-3 col-md-3 col-lg-4'] [data-toggle]"));
		Thread.sleep(1000);
	}
	
}
