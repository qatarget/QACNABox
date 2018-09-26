package tests.MenuPedagógico;

import org.junit.Test;

import Page.MenuPedagógico.MenuPedagogicoCadastrarReservaDeSalaPage;
import qa.cnabox.core.BaseTest;

public class MenuPedagogicoCadastrarReservaDeSalaTeste extends BaseTest {

	MenuPedagogicoCadastrarReservaDeSalaPage page = new MenuPedagogicoCadastrarReservaDeSalaPage();

	@Test

	public void DeveCadastrarNovaReservaDeSala() throws InterruptedException {

		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.BtnCadastroReservaSala();
		page.SetDataReserva("25102018");
		page.SetHorarioInicio("1300");
		page.SetHorarioFim("1900");
		page.SetSala("749");
		page.SetTipoReserva("5");
		page.EscreveNPessoas("10");
		page.SetResponsavelReserva("7937");
		page.EscreveDescricao("TESTE AUTOMATIZADO DA FUNCIONALIDADE DE CADASTRO DE NOVA RESERVA DE SALA");
		page.BtnConfirmarReserva();

	}

}
