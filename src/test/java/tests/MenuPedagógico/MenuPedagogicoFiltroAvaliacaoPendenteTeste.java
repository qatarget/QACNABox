package tests.MenuPedagógico;

import org.junit.Test;

import Page.MenuPedagógico.MenuPedagogicoFIltroAlunosComAvaliacaoPendentePage;
import qa.cnabox.core.BaseTest;

public class MenuPedagogicoFiltroAvaliacaoPendenteTeste extends BaseTest {

	MenuPedagogicoFIltroAlunosComAvaliacaoPendentePage page = new MenuPedagogicoFIltroAlunosComAvaliacaoPendentePage();

	@Test

	public void DeveFiltrarAvaliacaoPendentePorNomeAluno() throws InterruptedException {

		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.EscreveNomeAluno("MARIA LUZIRENE VIEIRA PEREIRA");
		page.ClicarBotaoFiltro();
	}

	@Test

	public void DeveFiltrarAvaliacaoPendentePorProfessor() throws InterruptedException {

		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetprofessorInstrutor("336");
		page.ClicarBotaoFiltro();

	}

	@Test

	public void DeveFiltrarAvaliacaoPendentePorIdioma() throws InterruptedException {

		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetIdioma("1");
		page.ClicarBotaoFiltro();

	}

	@Test

	public void DeveFiltrarAvaliacaoPendentePorCurso() throws InterruptedException {

		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetIdioma("1");
		page.SetCurso("4");
		page.ClicarBotaoFiltro();
	}

	@Test

	public void DeveFiltrarAvaliacaoPendentePorNivel() throws InterruptedException {

		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetIdioma("1");
		page.SetCurso("4");
		page.SetNivel("10");
		page.ClicarBotaoFiltro();
	}

	@Test

	public void DeveFiltrarAvaliacaoPendentePorEstagio() throws InterruptedException {

		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetIdioma("1");
		page.SetCurso("4");
		page.SetNivel("10");
		page.SetEstagio("72");
		page.ClicarBotaoFiltro();
	}
	
	@Test 
	
	public void DeveFiltrarAvaliacaoPendentePorModalidade() throws InterruptedException {
		
		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetModalidade("1");
		page.ClicarBotaoFiltro();
	}
	
	@Test
	
	public void DeveFIltrarAvaliacaoPendentePorData() throws InterruptedException {
		
		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.EscreveDataRealizacao("01012018");
		page.EscreveDataAte("31122018");
		page.ClicarBotaoFiltro();
	}
}
