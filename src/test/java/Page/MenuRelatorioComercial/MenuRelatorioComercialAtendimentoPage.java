package Page.MenuRelatorioComercial;

import static qa.cnabox.core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import qa.cnabox.core.BasePage;


public class MenuRelatorioComercialAtendimentoPage extends BasePage {


	
	public void SetclicarMenuRelatorio() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(11) .nav-title"));
		Thread.sleep(1000);

	}

	public void SetClicarSubmenu() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(11) li:nth-of-type(2) .menu-item"));
		Thread.sleep(1000);
	}
	
	public void SetClicarSubmenucategoria() throws InterruptedException {

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
	clicarBotaoBy(By.cssSelector(".select2-selection--multiple .select2-selection__rendered"));
	Thread.sleep(1000);	
	Select dropdown = new Select(getDriver().findElement(By.cssSelector("#TipoSituacaoPessoaEscola")));
	dropdown.selectByValue(Texto);
	Thread.sleep(1000);
	
	}
	
	public void SetTipoatendimento () throws InterruptedException{
		
		
	}
	
	public void Setfiltrartendimento () throws InterruptedException{
		
		clicarBotaoBy(By.id("btnRelatorioAtendimentosFilter"));
		Thread.sleep(1000);
		
	}
	
	public void SetClicaremExportar () throws InterruptedException{
		
		clicarBotaoBy(By.id("btnExportarRelatorioAtendimentos"));
		Thread.sleep(8000);
	}
	
	
	public void Tempo (int Tempo) throws InterruptedException {
		
		Thread.sleep(Tempo);
	}
	
	 public void takeScreenshot(){
		  
		 try{
		        Thread.sleep(10000);
		        long id = Thread.currentThread().getId();
		        BufferedImage image = new Robot().createScreenCapture(new Rectangle(
		            java.awt.Toolkit.getDefaultToolkit().getScreenSize()));
		        ImageIO.write(image, "jpg", new File("./target/surefire-reports/"
		            + id + "/screenshot.jpg"));
		    }
		    catch( Exception e ) {
		        e.printStackTrace();
		    }
		}
}
