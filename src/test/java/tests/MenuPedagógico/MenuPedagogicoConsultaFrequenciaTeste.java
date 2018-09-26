package tests.MenuPedagógico;

import org.junit.Test;

import Page.MenuPedagógico.MenuPedagogicoConsultaFrequenciaPage;
import qa.cnabox.core.BaseTest;

public class MenuPedagogicoConsultaFrequenciaTeste extends BaseTest {

	MenuPedagogicoConsultaFrequenciaPage page = new MenuPedagogicoConsultaFrequenciaPage();

	@Test

	public void DeveConsultarFrequenciaPorNome() throws InterruptedException {

		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.EscreveNomeAluno("ISABELLA TRINDADE DOS SANTOS");
		page.ClicarBotaoFIltro();

	}

	@Test

	public void DeveConsultarFrequenciaPorProfessor() throws InterruptedException {

		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetProfessor("336");
		page.ClicarBotaoFIltro();

	}

	@Test

	public void DeveConsultarFrequenciaPorIdioma() throws InterruptedException {

		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetIdioma("1");
		page.ClicarBotaoFIltro();

	}

	@Test

	public void DeveConsultarFrequenciaPorFrequencia() throws InterruptedException {

		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.EscreveFrequenciaDe("10");
		page.EscreveFrequenciaAte("70");
		page.ClicarBotaoFIltro();
	}

	@Test

	public void DeveRealizarEportacaoDeRelatorio() throws InterruptedException {

		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.ClicarBotaoFIltro();
		page.AguardaCarregarPagina();
		page.ExportarRelatorio();

	}

}
