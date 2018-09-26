package Page.MenuPedagógico;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import qa.cnabox.core.BasePage;

public class MenuPedagogicoCadastrarReservaDeSalaPage extends BasePage {

	public void SetClicarMenu() {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) .menu-item span"));
	}

	public void SetClicarSubMenu() {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) li:nth-of-type(7) span"));
	}

	public void AguardaCarregarPagina() throws InterruptedException {
		Thread.sleep(1200);

	}

	public void BtnCadastroReservaSala() throws InterruptedException {

		clicarBotaoBy(By.id("btnReservaSalaNew"));
		Thread.sleep(3000);
	}

	public void SetDataReserva(String ImputData) throws InterruptedException {

		clicarBotaoBy(By.id("DataInicio"));
		Thread.sleep(1000);
		escreveTexto(By.id("DataInicio"), ImputData);
		Thread.sleep(1000);
	}

	public void SetHorarioInicio(String HoraInicio) throws InterruptedException {

		clicarBotaoBy(By.id("HoraInicio"));
		Thread.sleep(1000);
		escreveTexto(By.id("HoraInicio"), HoraInicio);
		Thread.sleep(1000);
	}

	public void SetHorarioFim(String HoraFim) throws InterruptedException {

		clicarBotaoBy(By.id("HoraFim"));
		Thread.sleep(1000);
		escreveTexto(By.id("HoraFim"), HoraFim);
		Thread.sleep(1000);

	}

	public void SetSala(String SalaDisponivelId) throws InterruptedException {

		WebElement Sala = getDriver().findElement(By.id("SalaId"));
		Select comboSala = new Select(Sala);
		comboSala.selectByValue(SalaDisponivelId);
		Thread.sleep(2000);
	}

	public void SetTipoReserva(String TipoReservaId) throws InterruptedException {

		WebElement TipoReserva = getDriver().findElement(By.id("TipoAtividadeId"));
		Select comboTipoReserva = new Select(TipoReserva);
		comboTipoReserva.selectByValue(TipoReservaId);
		Thread.sleep(2000);
	}

	public void EscreveNPessoas(String NumPessoas) throws InterruptedException {

		escreveTexto(By.id("NumeroPessoas"), NumPessoas);
		Thread.sleep(1000);
	}

	public void SetResponsavelReserva(String Responsavel) throws InterruptedException {

		WebElement ResponsavelReserva = getDriver().findElement(By.id("ColaboradorResponsavelId"));
		Select comboResponsavel = new Select(ResponsavelReserva);
		comboResponsavel.selectByValue(Responsavel);
		Thread.sleep(2000);
	}

	public void EscreveDescricao(String texto) throws InterruptedException {

		escreveTexto(By.id("Descricao"), texto);
		Thread.sleep(1000);
	}

	public void BtnConfirmarReserva() throws InterruptedException {

		clicarBotaoBy(By.id("btnReservaSalaCreate"));
		Thread.sleep(3000);
	}
	
	
}
