package Page.MenuPedagógico;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import qa.cnabox.core.BasePage;

public class MenuPedagogicoConsultaFrequenciaPage extends BasePage {

	public void SetClicarMenu() {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) .menu-item span"));
	}

	public void SetClicarSubMenu() {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) li:nth-of-type(7) span"));
	}

	public void AguardaCarregarPagina() throws InterruptedException {
		Thread.sleep(1200);

	}

	public void EscreveNomeAluno(String NomeAluno) {

		escreveTexto(By.cssSelector("#order-form .row:nth-of-type(1) [type]"), NomeAluno);

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

	public void EscreveFrequenciaDe(String PorcentagemFreqDe) throws InterruptedException {

		escreveTexto(By.id("PresencaPeriodoStart"), PorcentagemFreqDe);
		Thread.sleep(1200);
	}

	public void EscreveFrequenciaAte(String PorcentagemFreqAte) throws InterruptedException {

		escreveTexto(By.id("PresencaPeriodoEnd"), PorcentagemFreqAte);
		Thread.sleep(1200);
	}

	public void EscrevePediodoDe(String DataPeriodoDe) throws InterruptedException {

		clicarBotaoBy(By.id("DataReferenciaStart"));
		escreveTexto(By.id("DataReferenciaStart"), DataPeriodoDe);
		Thread.sleep(1300);
	}

	public void EscrevePediodoAte(String DataPeriodoAte) throws InterruptedException {

		clicarBotaoBy(By.id("DataReferenciaEnd"));
		escreveTexto(By.id("DataReferenciaEnd"), DataPeriodoAte);
		Thread.sleep(1300);
	}

	public void EscreveHoraAulaDe(String HoraAulaInicio) throws InterruptedException {

		clicarBotaoBy(By.id("HoraAulaInicio"));
		escreveTexto(By.id("HoraAulaInicio"), HoraAulaInicio);
		Thread.sleep(1300);
	}

	public void EscreveHoraAulaAte(String HoraAulaFim) throws InterruptedException {

		clicarBotaoBy(By.id("HoraAulaTermino"));
		escreveTexto(By.id("HoraAulaTermino"), HoraAulaFim);
		Thread.sleep(1300);

	}

	public void ClicarBotaoFIltro() throws InterruptedException {

		clicarBotaoBy(By.id("btnAlunosFaltantes"));
		Thread.sleep(3000);
	}

	public void ExportarRelatorio() throws InterruptedException {

		clicarBotaoBy(By.id("btnExportarXlsAnalitico"));
		Thread.sleep(3000);
	}
}
