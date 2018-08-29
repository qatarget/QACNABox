package Page.MenuComercial;


import qa.cnabox.core.BasePage;
import static qa.cnabox.core.DriverFactory.getDriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.Select;





public class MenuComercialOrcamentoPage extends BasePage {

	public void SetclicarMenuComercial() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(6) .menu-item"));
		Thread.sleep(1000);
		}

	public void SetClicarOrcamento() throws InterruptedException {

		clicarBotaoBy(By.linkText("Or�amento"));
		Thread.sleep(1000);
		}


	public void SetClicaremNovoOrcamento() throws InterruptedException {

		clicarBotaoBy(By.cssSelector("[href='\\#criar-novo-orcamento']"));
		Thread.sleep(1000);
		
	}

	public void SetClicaremfiltrar() throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("[action='\\/Orcamento\\/CreateModalLoad'] button"));
		Thread.sleep(2000);
		
	}
	public void SelecionarAluno() throws InterruptedException {

		clicarBotaoBy(By.cssSelector("#GridCreateModal tr:nth-of-type(3) .smart-form i"));
		Thread.sleep(1000);
	}

	public void GerarOrcamento() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".modal-footer [type='button']:nth-of-type(2)"));
		Thread.sleep(1000);
	}


	public void Setdatavalidade(String texto) throws InterruptedException {

		clicarBotaoBy(By.cssSelector("#DataValidade"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("#DataValidade"), texto);
	}

	public void OrcamentoPasso2() throws InterruptedException {

		clicarBotaoBy(By.cssSelector("#orcamento [type='button']"));
		Thread.sleep(1000);
	}

	public void SetEstagios() throws InterruptedException{
		
							///Legenda est�gios////
				///**value="2078"-B�SICO1, value="2062"PRE-SCHOOLGARDEN1, value="2066"YOUNG KIDS1,//// 
				///**value="2070"KIDS 1, value="2074"TEENS1, value="2088"FAST1**/////

		Select dropdown = new Select(getDriver().findElement(By.id("EscolaEstagioId")));
		dropdown.selectByValue("2078");
		Thread.sleep(1000);;

	}
	
	public void SetModalidade() throws InterruptedException{
		
						///Legenda est�gios////
		///"1"-EXTENSIVO,"2"-INTENSIVO, "3"-PLUS/////

		Select dropdown = new Select(getDriver().findElement(By.id("ModalidadeId")));
		dropdown.selectByValue("1");
		Thread.sleep(1000);;
	}
	
	public void Setproximoestagio() throws InterruptedException{
		
		clicarBotaoBy(By.cssSelector(".default td:nth-of-type(1) i"));
		Thread.sleep(1000);
		
	}


	public void SetProximoPasso() throws InterruptedException{
	
	clicarBotaoBy(By.id("btnDocumentoEstagioSave"));
	Thread.sleep(1000);
}

	public void Setcondicaodepagamento() throws InterruptedException{
		

				///Legenda est�gios////
		///"1"-cart�o de debito,"2"-cart�o de credito, "3"-cheque, 4-dinheiro, 5-credito em conta/////
		/// 6-cobran�a bancaria(boleto), 7 carn�, 8 cheque pr� datado///
		
		Select dropdown = new Select(getDriver().findElement(By.id("EstagioFormaPagamentoId")));
		dropdown.selectByValue("4");
		Thread.sleep(1000);
	}
	
	public void SetMaterial() throws InterruptedException{
		
		clicarBotaoBy(By.cssSelector(".row.smart-form i"));
		Thread.sleep(1000);
	}
	
public void SetParcelamentoEstagios(String Numerodeparcelas) throws InterruptedException{
		
		clicarBotaoBy(By.cssSelector("#EstagioQtdeParcela"));
		getDriver().findElement(By.cssSelector("#EstagioQtdeParcela")).clear();
		Thread.sleep(1000);
		getDriver().findElement(By.cssSelector("#EstagioQtdeParcela")).sendKeys(Numerodeparcelas);
	}

	public void SetConcluir() throws InterruptedException{
	
	clicarBotaoBy(By.cssSelector("#btnConcluirOrcamento"));
	Thread.sleep(1000);
	}
	
public void Tempo (int Tempo) throws InterruptedException {
		
		Thread.sleep(Tempo);
		
	}

public void SetClicarantesderolar() throws InterruptedException{
	
	
 getDriver().findElement(By.cssSelector(".modal-header")).click();

} 

	public void RolarPaginaOrcamento() {
		
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		} 	
		catch (AWTException ex) {
		throw new WebDriverException("VK_PAGE_DOWN", ex);
  
		}
}

	public void Setmodalidadesequencia() throws InterruptedException{
		
			///Legenda est�gios////
			///"1"-EXTENSIVO,"2"-INTENSIVO, "3"-PLUS/////
		Select dropdown = new Select(getDriver().findElement(By.id("ModalidadeIdSequencia")));
		dropdown.selectByValue("1");
		Thread.sleep(1000);
}
	
	public void SetClicaremvoltar() throws InterruptedException{
		
		
		 getDriver().findElement(By.className("btn btn-warning btn-sm")).click();
		 Thread.sleep(1000);
		} 
	
	
	
	
}
