package tests.MenuPedagógico;

import org.junit.Test;

import Page.MenuPedagógico.MenuPedagogicoFiltroAlunoSemTurmaPage;
import qa.cnabox.core.BaseTest;

public class MenuPedagogicoFiltroAlunoSemTurmaTeste extends BaseTest {

	MenuPedagogicoFiltroAlunoSemTurmaPage page = new MenuPedagogicoFiltroAlunoSemTurmaPage();

	@Test
	
	public void DeveFiltrarAlunoSemTurmaPorNome() throws InterruptedException {
		
		page.SetClicarMenuPedagógico();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.EscreveNomeALuno("JOSIANE SANTOS SILVA");
		page.ClicarBotãoFIltrar();
	}
	
	public void DeveFiltrarAlunoSemTurmaPorSituacao() throws InterruptedException {
		
		page.SetClicarMenuPedagógico();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetSituacaoALuno("5");
		page.ClicarBotãoFIltrar();
		
	}
	
	public void DeveFiltrarAlunoSemTurmaPorIdioma() throws InterruptedException {
		
		page.SetClicarMenuPedagógico();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetIdioma("2");
		page.ClicarBotãoFIltrar();
		page.ClicarBotãoFIltrar();
		
	}
	
	
	
}
