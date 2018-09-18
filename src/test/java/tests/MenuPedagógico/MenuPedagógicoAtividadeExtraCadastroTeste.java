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
		page.SetTipoAtividade("6");
		page.EscreveDescricao("Descrição teste QA Target");
		page.SetIdioma("1");
		page.SetCurso("2");
		page.SetNivel("5");
		page.SetEstagio("15");
		page.SetModalidade("1");
		page.SetTurma("5241");
		page.EscreveParticipantesPrevistos("5");
		page.SetRolarAPagina();
		page.DataAtividade("10102018");
		page.AguardaCarregarPagina();
		page.HoraInicioAtividade("1200");
		page.HoraTerminoAtivodade("1400");
		page.ClicarBtnProximo();
		page.AguardaCarregarPagina();

		// Segundo passo do Cadastro

		page.SetSala();
		page.AguardaCarregarPagina();
		page.SetProfessor();
		page.AguardaCarregarPagina();
		page.SetRolarAPagina();
		page.ClicarBtnSalvar();

	}

}
