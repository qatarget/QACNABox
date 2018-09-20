package Page.MenuPedagógico;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import qa.cnabox.core.BasePage;

public class MenuPedagogicoFiltroAlunoSemTurmaPage extends BasePage {

	public void SetClicarMenuPedagógico() {

		getDriver().findElement(By.cssSelector(".nav-left-bar li:nth-of-type(8) .menu-item span")).click();

	}
	
	public void SetClicarSubMenu() {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) li:nth-of-type(2) span"));
	}

	public void AguardaCarregarPagina() throws InterruptedException {
		Thread.sleep(3000);
	}

	public void ClicarAlunoSemTurma() throws InterruptedException {

		getDriver().findElement(By.cssSelector(".nav-left-bar li:nth-of-type(8) li:nth-of-type(2) span")).click();
		Thread.sleep(2000);

	}

	public void EscreveNomeALuno(String Nome) {

		getDriver().findElement(By.id("Nome")).getAttribute(Nome);
	}

	public void SetSituacaoALuno(String idSituacao) throws InterruptedException {

		WebElement situacaoAluno = getDriver().findElement(By.id("StatusAlunoId"));
		Select comboSituacao = new Select(situacaoAluno);
		comboSituacao.selectByValue(idSituacao);
		Thread.sleep(2000);
	}

	public void SetIdioma(String idIdioma) throws InterruptedException {

		WebElement Idioma = getDriver().findElement(By.id("IdiomaId"));
		Select comboIdioma = new Select(Idioma);
		comboIdioma.selectByValue(idIdioma);
		Thread.sleep(1500);

	}

	public void SetCurso(String idCurso) throws InterruptedException {

		WebElement Curso = getDriver().findElement(By.id("CursoId"));
		Select comboCurso = new Select(Curso);
		comboCurso.selectByValue(idCurso);
		Thread.sleep(1500);

	}
	
	public void SetNivel(String idNivel) throws InterruptedException {
		
		WebElement Nivel = getDriver().findElement(By.id("NivelId"));
		Select comboNivel = new Select(Nivel);
		comboNivel.selectByValue(idNivel);
		Thread.sleep(1500);
	}
	
	public void SetEstagio(String idEstagio) throws InterruptedException {
		
		WebElement Estagio = getDriver().findElement(By.id("EstagioId"));
		Select comboEstagio = new Select(Estagio);
		comboEstagio.selectByValue(idEstagio);
		Thread.sleep(1500);
	}
	
	public void ClicarBotãoFIltrar() throws InterruptedException {

		getDriver().findElement(By.cssSelector(".widget-body footer [type='button']:nth-of-type(1)")).click();
		Thread.sleep(3000);
	}

}
