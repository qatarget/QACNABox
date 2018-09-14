package Page.MenuPedagógico;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import qa.cnabox.core.BasePage;

public class MenuPedagogicoFIltroAlunosComAvaliacaoPendentePage extends BasePage {

	public void SetClicarMenu() {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) .menu-item span"));
	}

	public void SetClicarSubMenu() {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) li:nth-of-type(3) span"));
	}

	public void AguardaCarregarPagina() throws InterruptedException {
		Thread.sleep(3000);
	}

	public void EscreveNomeAluno(String texto) {

		escreveTexto(By.id("NomeAluno"), texto);
	}

	public void SetprofessorInstrutor(String idProf) throws InterruptedException {
		WebElement Professor = getDriver().findElement(By.id("ProfessorId"));
		Select comboProfessor = new Select(Professor);
		comboProfessor.selectByValue(idProf);
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

	public void SetTipoAvaliacao(String IdTipoAvaliacao) throws InterruptedException {

		WebElement TipoAvaliacao = getDriver().findElement(By.id("TipoAvaliacaoId"));
		Select comboTipoAvaliacao = new Select(TipoAvaliacao);
		comboTipoAvaliacao.selectByValue("IdTipoAvaliacao");
		Thread.sleep(1500);
	}

	public void EscreveDataRealizacao(String EscreveDataDe) throws InterruptedException {

		clicarBotaoBy(By.id("DataDe"));
		Thread.sleep(1500);
		escreveTexto(By.id("DataDe"), EscreveDataDe);
	}

	public void EscreveDataAte(String EscreveDataAte) throws InterruptedException {

		clicarBotaoBy(By.id("DataFim"));
		Thread.sleep(1500);
		escreveTexto(By.id("DataAte"), EscreveDataAte);
	}

	public void ClicarBotaoFiltro() throws InterruptedException {
		clicarBotaoBy(By.id("btnAvaliacoesPendentesFilter"));
		Thread.sleep(3000);
	}

}
