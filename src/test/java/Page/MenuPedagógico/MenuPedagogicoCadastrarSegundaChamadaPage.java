package Page.MenuPedagógico;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import qa.cnabox.core.BasePage;

public class MenuPedagogicoCadastrarSegundaChamadaPage extends BasePage {
	
	public void SetClicarMenu() {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) .menu-item span"));
	}

	public void SetClicarSubMenu() {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) li:nth-of-type(7) span"));
	}

	public void AguardaCarregarPagina() throws InterruptedException {
		Thread.sleep(1200);

	}
	
	public void BtnCadastrarSegChamada() throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector(".btn-success"));
		Thread.sleep(3000);
	}
	
	public void SetIdioma(String idIdioma) throws InterruptedException {

		WebElement Idioma = getDriver().findElement(By.id("IdiomaId"));
		Select comboIdioma = new Select(Idioma);
		comboIdioma.selectByValue(idIdioma);
		Thread.sleep(1500);
	}
	
	public void SetTipoAvaliacao(String IdTipoAvaliacao) throws InterruptedException {
		
		WebElement TipoAvaliacao = getDriver().findElement(By.id("TipoAvaliacaoId"));
		Select comboTipoAvaliacao = new Select(TipoAvaliacao);
		comboTipoAvaliacao.selectByValue(IdTipoAvaliacao);
		
	}

	public void SetData(String Data) throws InterruptedException {
		
		clicarBotaoBy(By.id("DataInicio"));
		Thread.sleep(1200);
		escreveTexto(By.id("DataInicio"), Data);
		Thread.sleep(1000);
	}
	
	public void SetHorarioInicio(String HorarioIn) throws InterruptedException {
		
		clicarBotaoBy(By.id("HoraInicio"));
		Thread.sleep(1200);
		escreveTexto(By.id("HoraInicio"), HorarioIn);
		Thread.sleep(1000);
		
	}
	
	public void SetHorarioTermino(String HoraOut) throws InterruptedException {
		
		clicarBotaoBy(By.id("HoraFim"));
		Thread.sleep(1200);
		escreveTexto(By.id("HoraFim"), HoraOut);
		Thread.sleep(1000);
		
	}
}
