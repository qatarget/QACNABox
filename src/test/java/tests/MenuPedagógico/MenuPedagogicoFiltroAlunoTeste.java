package tests.MenuPedag�gico;

import org.junit.Test;

import Page.MenuPedag�gico.MenuPedagogicoFiltroAlunoPage;
import qa.cnabox.core.BaseTest;

public class MenuPedagogicoFiltroAlunoTeste extends BaseTest {

	MenuPedagogicoFiltroAlunoPage page = new MenuPedagogicoFiltroAlunoPage();

	@Test

	public void DeveRealizarFIltroPorNome() throws InterruptedException {

		page.SetClicarMenuPedag�gico();
		page.SetClicarAlunos();
		page.SetNomeAluno("ACASSIA REGINA NASCIMENTO DE MEDEIROS");
		page.ClicarBot�oFIltrar();
		page.SetRolarAPagina();

	}

}
