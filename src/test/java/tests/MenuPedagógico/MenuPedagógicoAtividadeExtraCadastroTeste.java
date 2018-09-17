package tests.MenuPedagógico;

import org.junit.Test;

import Page.MenuPedagógico.MenuPedagogicoAtividadeExtraCadastroPage;
import qa.cnabox.core.BaseTest;

public class MenuPedagógicoAtividadeExtraCadastroTeste extends BaseTest {

	MenuPedagogicoAtividadeExtraCadastroPage page = new MenuPedagogicoAtividadeExtraCadastroPage();

	@Test

	public void DeveRealizarCadastroAtividadeExtra() throws InterruptedException {

		// Cadastro de Atividade (Primeiro Passo)
		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetCadastrarNovaAtividade();
		page.AguardaCarregarPagina();
		page.EscreveNomeAtividade("Atividade Extra QA");
		page.AguardaCarregarPagina();
		page.SetTipoAtividade("6");
		page.AguardaCarregarPagina();
		page.EscreveDescricao("Descrição teste QA Target");
		page.AguardaCarregarPagina();
		page.SetIdioma("3");
		page.AguardaCarregarPagina();
		page.SetCurso("4");
		page.AguardaCarregarPagina();
		page.SetNivel("7");
		page.AguardaCarregarPagina();
		page.SetEstagio("20");
		page.AguardaCarregarPagina();
		page.SetModalidade("1");
		page.AguardaCarregarPagina();
		page.SetTurma("5223");
		page.AguardaCarregarPagina();
		page.EscreveParticipantesPrevistos("10");
		page.DataAtividade("10102018");
		page.AguardaCarregarPagina();
		page.HoraInicioAtividade("1200");
		page.AguardaCarregarPagina();
		page.HoraTerminoAtivodade("1400");
		page.AguardaCarregarPagina();
		page.ClicarBtnProximo();
		page.AguardaCarregarPagina();

		// Segundo passo do Cadastro

	}

}
