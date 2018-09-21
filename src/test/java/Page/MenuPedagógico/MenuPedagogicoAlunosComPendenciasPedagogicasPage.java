package Page.MenuPedagógico;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import qa.cnabox.core.BasePage;

public class MenuPedagogicoAlunosComPendenciasPedagogicasPage extends BasePage {

	public void SetClicarMenu() {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) .menu-item span"));
	}

	public void SetClicarSubMenu() {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) li:nth-of-type(4) span"));
	}

	public void AguardaCarregarPagina() throws InterruptedException {
		Thread.sleep(1200);
	}

	public void EscreveNomeAluno(String NomeAluno) {

		escreveTexto(By.id("Nome"), NomeAluno);

	}

	public void SetProfessor(String IdProfessor) {
		WebElement Professor = getDriver().findElement(By.id("ProfessorId"));
		Select comboProfessor = new Select(Professor);
		comboProfessor.selectByValue(IdProfessor);
	}

	public void SetCurso(String idCurso) throws InterruptedException {

		clicarBotaoBy(By.id("CursoId"));
		AguardaCarregarPagina();
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

	public void SetIdioma(String idIdioma) throws InterruptedException {

		WebElement Idioma = getDriver().findElement(By.id("IdiomaId"));
		Select comboIdioma = new Select(Idioma);
		comboIdioma.selectByValue(idIdioma);
		Thread.sleep(1500);
	}

	public void SetTurma(String idTurma) throws InterruptedException {

		WebElement Turma = getDriver().findElement(By.id("TurmaId"));
		Select comboTurma = new Select(Turma);
		comboTurma.selectByValue(idTurma);
		Thread.sleep(1500);
	}

	public void SetModalidade(String idModalidade) throws InterruptedException {

		WebElement Modalidade = getDriver().findElement(By.id("ModalidadeId"));
		Select comboModalidade = new Select(Modalidade);
		comboModalidade.selectByValue(idModalidade);
		Thread.sleep(1500);
	}

	public void ClicarBotaoFiltrar() throws InterruptedException {

		clicarBotaoBy(By.id("btnPendenciasPedagogicasFilter"));
		Thread.sleep(2000);
	}

	public void SetRolarAPagina() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)", "");
		AguardaCarregarPagina();
	}

}
