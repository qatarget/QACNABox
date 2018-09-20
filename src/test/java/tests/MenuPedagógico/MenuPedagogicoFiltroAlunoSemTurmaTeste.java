package tests.MenuPedag�gico;

import org.junit.Test;

import Page.MenuPedag�gico.MenuPedagogicoFiltroAlunoSemTurmaPage;
import qa.cnabox.core.BaseTest;

public class MenuPedagogicoFiltroAlunoSemTurmaTeste extends BaseTest {

	MenuPedagogicoFiltroAlunoSemTurmaPage page = new MenuPedagogicoFiltroAlunoSemTurmaPage();

	@Test
	
	public void DeveFiltrarAlunoSemTurmaPorNome() throws InterruptedException {
		
		page.SetClicarMenuPedag�gico();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.EscreveNomeALuno("JOSIANE SANTOS SILVA");
		page.ClicarBot�oFIltrar();
	}
	
	public void DeveFiltrarAlunoSemTurmaPorSituacao() throws InterruptedException {
		
		page.SetClicarMenuPedag�gico();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetSituacaoALuno("5");
		page.ClicarBot�oFIltrar();
		
	}
	
	public void DeveFiltrarAlunoSemTurmaPorIdioma() throws InterruptedException {
		
		page.SetClicarMenuPedag�gico();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetIdioma("2");
		page.ClicarBot�oFIltrar();
		page.ClicarBot�oFIltrar();
		
	}
	
	
	
}
