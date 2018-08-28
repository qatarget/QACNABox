package qa.cnabox.page.MenuComercial;


import qa.cnabox.core.BasePage;
import sun.awt.ModalExclude;

import static qa.cnabox.core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import jdk.nashorn.internal.ir.Block;


public class MenuComercialOrcamentoPage extends BasePage {

	public void SetclicarMenuComercial() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(6) .menu-item"));
		Thread.sleep(1000);
		}

	public void SetClicarOrcamento() throws InterruptedException {

		clicarBotaoBy(By.linkText("Orçamento"));
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
		
							///Legenda estágios////
				///**value="2078"-BÁSICO1, value="2062"PRE-SCHOOLGARDEN1, value="2066"YOUNG KIDS1,//// 
				///**value="2070"KIDS 1, value="2074"TEENS1, value="2088"FAST1**/////

		Select dropdown = new Select(getDriver().findElement(By.id("#EscolaEstagioId")));
		dropdown.selectByValue("2078");
		Thread.sleep(1000);;

	}
	
	public void SetModalidade() throws InterruptedException{
		
						///Legenda estágios////
		///"1"-EXTENSIVO,"2"-INTENSIVO, "3"-PLUS/////

		Select dropdown = new Select(getDriver().findElement(By.id("#ModalidadeId")));
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
		

				///Legenda estágios////
		///"1"-cartão de debito,"2"-cartão de credito, "3"-cheque, 4-dinheiro, 5-credito em conta/////
		/// 6-cobrança bancaria(boleto), 7 carnê, 8 cheque pré datado///
		
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
	
	
	WebDriverWait block = new WebDriverWait(getDriver(),10);
	block.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-dialog modal-lg")));
	getDriver().switchTo().frame("sema");
	//WebElement pan;
	//pan = pan.findElement(By.id("criar-novo-orcamento"));
}

	public void RolarPaginaOrcamento() {
	((JavascriptExecutor) getDriver()).executeScript("scroll(0,850)");
}


	
}
