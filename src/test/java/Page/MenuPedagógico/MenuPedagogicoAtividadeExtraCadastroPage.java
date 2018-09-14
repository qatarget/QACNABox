package Page.MenuPedagógico;

import static qa.cnabox.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import qa.cnabox.core.BasePage;

public class MenuPedagogicoAtividadeExtraCadastroPage extends BasePage {

	public void SetClicarMenu() {
		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(8) .menu-item span"));
	}

	public void SetClicarSubMenu() {
		clicarBotaoBy(By.cssSelector(
				"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[8]/ul[@class='sub-menu']//span[.='Atividade Extra']"));
	}

	public void AguardaCarregarPagina() throws InterruptedException {
		Thread.sleep(3000);
	}

	public void SetCadastrarNovaAtividade() throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".btn-success.hidden-mobile"));
		Thread.sleep(3000);
	}

	public void EscreveNomeAtividade(String NomeAtividade) throws InterruptedException {

		clicarBotaoBy(By.cssSelector("#Nome"));
		Thread.sleep(1000);
		escreveTexto(By.id("Nome"), NomeAtividade);
	}

	public void SetTipoAtividade(String idTipoAtividade) {

		WebElement TipoAtividade = getDriver().findElement(By.id("TipoAtividadeExtraId"));
		Select comboTipoAtividade = new Select(TipoAtividade);
		comboTipoAtividade.selectByValue(idTipoAtividade);
	}

	public void EscreveDescricao(String Texto) throws InterruptedException {
		clicarBotaoBy(By.cssSelector("textarea"));
		AguardaCarregarPagina();
		escreveTexto(By.cssSelector("textarea"), Texto);
		Thread.sleep(1000);
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

	public void EscreveParticipantesPrevistos(String EscreveNumero) throws InterruptedException {
		clicarBotaoBy(By.cssSelector("#ParticipantesPrevistos"));
		AguardaCarregarPagina();
		escreveTexto(By.cssSelector("#ParticipantesPrevistos"), EscreveNumero);
		Thread.sleep(1000);
	}

	public void DataAtividade(String Data) throws InterruptedException {
		clicarBotaoBy(By.cssSelector(".date"));
		Thread.sleep(1500);
		escreveTexto(By.cssSelector(".date"), Data);
	}

	public void HoraInicioAtividade(String HoraInicio) throws InterruptedException {

		clicarBotaoBy(By.id("HoraInicio"));
		AguardaCarregarPagina();
		escreveTexto(By.id("HoraInicio"), HoraInicio);
		Thread.sleep(1000);

	}

	public void HoraTerminoAtivodade(String HoraFim) throws InterruptedException {

		clicarBotaoBy(By.id("HoraFim"));
		Thread.sleep(1500);
		escreveTexto(By.id("HoraFim"), HoraFim);
		Thread.sleep(1500);
	}

	public void ClicarBtnProximo() throws InterruptedException {

		clicarBotaoBy(By.id("btnSaveStepOne"));
		AguardaCarregarPagina();
	}

	public void SetSala() {

		getDriver()
				.findElement(By.cssSelector(
						"/html//table[@id='tabela_sala_disponivel']/tbody/tr[2]/td[1]/label[@class='checkbox']/i"))
				.click();
	}

	public void SetProfessor() {

		getDriver().findElement(By.cssSelector(
				"/html//table[@id='tabela_professor_disponivel']/tbody/tr[1]/td[1]/label[@class='checkbox']/i"));
	}

	public void SetRolarAPagina() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)", "");
		AguardaCarregarPagina();
	}

	public void ClicarBtnSalvar() throws InterruptedException {

		clicarBotaoBy(By.id("btnSaveAll"));
		AguardaCarregarPagina();
	}

}
