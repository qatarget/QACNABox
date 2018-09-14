package tests.MenuPedagógico;

import org.junit.Test;

import Page.MenuPedagógico.MenuPedagogicoFiltroAlunoPage;
import qa.cnabox.core.BaseTest;

public class MenuPedagogicoFiltroAlunoTeste extends BaseTest {

	MenuPedagogicoFiltroAlunoPage page = new MenuPedagogicoFiltroAlunoPage();

	@Test

	public void DeveRealizarFIltroPorNome() throws InterruptedException {

		page.SetClicarMenuPedagógico();
		page.SetClicarAlunos();
		page.SetNomeAluno("ACASSIA REGINA NASCIMENTO DE MEDEIROS");
		page.ClicarBotãoFIltrar();
		page.SetRolarAPagina();

	}

}
