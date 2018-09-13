package tests.MenuAdministrativoContratosTeste;

import qa.cnabox.core.BaseTest;

import org.junit.Test;


import Page.MenuAdministrativoContratosPage.ProcessoMatriculaPage;;

public class ProcessoMatriculaTeste extends BaseTest {
	
	ProcessoMatriculaPage page = new ProcessoMatriculaPage();
	
	//*********************************************************Cadastro de Prospect**************************************************************//

	@Test
	public void DeveCadastrarNovoProspect() throws InterruptedException {
		
		//// Cadastrar Aluno////
		page.SetClicarMenu();
		page.Tempo(4000);
		page.SetClicarSubMenu();
		page.Tempo(4000);
		page.SetClicarCadastrarProspect();
		page.Tempo(4000);
		page.SetEscreveNomeAluno();
		page.SetEscreveEmail();
		page.ClicarCampoAtendimento();
		page.Tempo(4000);
		page.ClicarCampoDescrição();
		page.SetSexoMasculino();
		page.SetDataNascimento(" 14111986 ");
		page.SetEstadoCivil("3");
		page.RolarPaginaPageDown();
		page.SetTelefoneFixo(" 11345499472 ");
		page.SetTelefoneCelular(" 11997499671 ");
		page.RolarPaginaPageDown();
		page.Tempo(4000);
		page.ClicarCampoCep();
		page.SetCep("18045520");
		page.Tempo(4000);
		page.SetNumeroResidencia("120");
		page.Tempo(4000);
		page.RolarPaginaPageDown();
		page.Tempo(4000);
		page.SetSelecionarIdioma();
		page.Tempo(4000);
		page.SetSelecionarEstagio("20");
		page.SetSelecionarHorario();
		page.Tempo(4000);
		page.BuscaCPF();
		page.Tempo(4000);
		page.RolarPaginaPageDown();
		page.Tempo(3000);
		page.SetSelecionarMidia("41");
		page.Tempo(3000);
		page.SetSelecionarCampanha("9");
		page.Tempo(3000);
		page.SetoRolarCimaSemPageUP();
		page.Tempo(3000);
		page.SetoRolarCimaSemPageUP();
		page.Tempo(3000);
		page.ClicarMatricula();
		page.Tempo(3000);
		page.ClicarSalvar();
		
	//////// Passo 1 da matricula////
		page.Tempo(5000);
		page.RolarPagina();
		page.Tempo(4000);
		page.RolarPaginaPageDown();
		page.Tempo(4000);
		page.RolarPaginaPageDown();
		page.Tempo(4000);
		page.ClicarProximoPasso1();
		
		////// Passo 2 da matricula////
		page.Tempo(4000);
		page.RolarPagina();
		
		///// Passo 3 da matricula///	
		page.SetProximo3();
		page.Tempo(3000);
		//// legenda de estágios = 2078-Basico, 2066-Yong, 2062-Pre-School, 2070-Kids, 2074-TEENS, 2088-Fast///
		page.SetEstagio("2078");
		// Legenda de modalidade= 1 Extensivo, 2 intensivo, 3 plus////
		page.Setmodalidade("1");
		page.Tempo(2000);
		page.SetProximoestagio("1");
		page.Tempo(2000);
		page.RolarPagina();
		page.Tempo(2000);
		page.Setproximopasso();
		
		////Passo 4 da matricula//////
		page.Tempo(4000);
		page.RolarPagina();
		page.Tempo(2000);
		page.SetFormadePG("6");
		page.Tempo(2000);
		page.SetParcelas("12");
		page.Tempo(2000);
		page.Setdata("01102018");
		page.Tempo(3000);
		page.RolarPagina();
		page.Tempo(3000);
		
		//// Passo 5 da matricula ////
		
		page.Setproximopassofinal();
		page.Tempo(5000);
		page.RolarPaginaPageDown();
		page.Tempo(5000);
		page.SetObservacao();
		page.Tempo(5000);
		page.RolarPaginaPageDown();
		page.Tempo(4000);
		page.SetTemplante();
		page.Tempo(4000);
		page.RolarPaginaPageDown();
		page.Tempo(4000);
		page.SetConcluir();
		
		//// Contrato finalizado/////
		page.Tempo(6000);
		page.RolarPagina();
		page.Tempo(4000);
		page.SetclicarFecharmodalaviso();
		page.Tempo(4000);
		
	
	}
}
