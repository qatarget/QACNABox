package Page.MenuPedagógico;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import qa.cnabox.core.BasePage;

public class MenuPedagogicoConsultaExAlunoPage extends BasePage {

	public void SetClicarMenu() {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) .menu-item span"));
	}

	public void SetClicarSubMenu() {
		clicarBotaoBy(By.cssSelector(
				"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[8]/ul[@class='sub-menu']//span[.='Ex-aluno']"));
	}

	public void EscreveNomeExAluno(String NomeExAluno) throws InterruptedException {

		escreveTexto(By.id("Nome"), NomeExAluno);
		Thread.sleep(1500);
	}

	public void SetSituacao(String idSituacao) {
		WebElement Situacao = getDriver().findElement(By.id("StatusAlunoId"));
		Select comboSituacao = new Select(Situacao);
		comboSituacao.selectByValue(idSituacao);

	}

	public void EscreveDataStatusIn(String DataStatusIn) throws InterruptedException {

		clicarBotaoBy(By.id("DataSituacaoStart"));
		Thread.sleep(1500);
		escreveTexto(By.id("DataSituacaoStart"), DataStatusIn);
		Thread.sleep(1500);
	}

	public void EscreveDataStatusEnd(String DataStatusOut) throws InterruptedException {
		clicarBotaoBy(By.id("DataSituacaoEnd"));
		Thread.sleep(1500);
		escreveTexto(By.id("DataSituacaoEnd"), DataStatusOut);
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

	public void FiltrarEmTela() throws InterruptedException {

		clicarBotaoBy(By.id("btnExAlunosFilter"));
		Thread.sleep(2000);
	}

	public void ExportarRelatorioExAluno() throws InterruptedException {

		clicarBotaoBy(By.id("btnExportarXlsAnalitico"));
		Thread.sleep(2000);
	}

}
