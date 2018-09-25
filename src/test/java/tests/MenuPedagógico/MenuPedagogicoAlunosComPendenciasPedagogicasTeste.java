package tests.MenuPedagógico;

import org.junit.Test;

import qa.cnabox.core.BaseTest;

public class MenuPedagogicoAlunosComPendenciasPedagogicasTeste extends BaseTest {

	Page.MenuPedagógico.MenuPedagogicoAlunosComPendenciasPedagogicasPage page = new Page.MenuPedagógico.MenuPedagogicoAlunosComPendenciasPedagogicasPage();

	@Test

	public void DeveRealizarFiltroPorNome() throws InterruptedException {

		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.EscreveNomeAluno("ANA CAROLINA TORRETTA");
		page.ClicarBotaoFiltrar();
	}

	public void DeveRealizarFiltroPorProfessor() throws InterruptedException {

		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetProfessor("336");
		page.ClicarBotaoFiltrar();
	}

	public void DeveFIltrarPorIdioma() throws InterruptedException {

		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetIdioma("1");
		page.ClicarBotaoFiltrar();

	}

}
