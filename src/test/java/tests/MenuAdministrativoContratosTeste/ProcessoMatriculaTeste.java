package tests.MenuAdministrativoContratosTeste;

import qa.cnabox.core.BaseTest;

import org.junit.Test;


import Page.MenuAdministrativoContratosPage.ProcessoMatriculaPage;;

public class ProcessoMatriculaTeste extends BaseTest {
	
	ProcessoMatriculaPage page = new ProcessoMatriculaPage();
	
	//*********************************************************Cadastro de Prospect**************************************************************//

	@Test
	public void DeveCadastrarNovoProspect() throws InterruptedException {
		page.SetClicarMenu();
		page.AguardaCarregarPagina();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetClicarCadastrarProspect();
		page.AguardaCarregarPagina();
		page.SetEscreveNomeAluno();
		page.SetEscreveEmail();
		page.ClicarCampoAtendimento();
		page.AguardaCarregarPagina();
		page.ClicarCampoDescrição();
		page.SetSexoMasculino();
		page.SetDataNascimento(" 14111986 ");
		page.SetEstadoCivil("3");
		page.RolarPaginaPageDown();
		page.SetTelefoneFixo(" 11345499472 ");
		page.SetTelefoneCelular(" 11997499671 ");
		page.RolarPaginaPageDown();
		page.AguardaCarregarPagina();
		page.ClicarCampoCep();
		page.SetCep("18045520");
		page.AguardaCarregarPagina();
		page.SetNumeroResidencia("120");
		page.AguardaCarregarPagina();
		page.RolarPaginaPageDown();
		page.AguardaCarregarPagina();
		page.SetSelecionarIdioma();
		page.AguardaCarregarPagina();
		page.SetSelecionarEstagio("20");
		page.SetSelecionarHorario();
		page.AguardaCarregarPagina();
		page.BuscaCPF();
		page.AguardaCarregarPagina();
		page.RolarPaginaPageDown();
		page.AguardaCarregarPagina();
		page.SetSelecionarMidia("41");
		page.AguardaCarregarPagina();
		page.SetSelecionarCampanha("9");
		page.AguardaCarregarPagina();
		page.SetoRolarCimaSemPageUP();
		page.AguardaCarregarPagina();
		page.SetoRolarCimaSemPageUP();
		page.AguardaCarregarPagina();
		page.ClicarMatricula();
		page.AguardaCarregarPagina();
		page.ClicarSalvar();
		page.Tempo(4000);
		page.RolarPagina();
		page.Tempo(4000);
		page.ClicarProximoPasso1();
		page.Tempo(3000);
		page.RolarPagina();
		page.SetProximo3();
		page.Tempo(3000);
		
		
		
		
		
		
		//page.SetSalvar();
	
	}
}
