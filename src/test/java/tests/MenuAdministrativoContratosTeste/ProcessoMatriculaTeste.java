package tests.MenuAdministrativoContratosTeste;

import qa.cnabox.core.BaseTest;

import static qa.cnabox.core.DriverFactory.getDriver;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

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
		page.SetSelecionarMidia("41");
		page.AguardaCarregarPagina();
		page.SetSelecionarCampanha("8");
		page.AguardaCarregarPagina();
		page.RolarPaginaPageUp();
		page.RolarPaginaPageUp();
		page.AguardaCarregarPagina();
		page.SetSelecionarTipoAtendimento();
		page.AguardaCarregarPagina();
		page.SetSelecionarAcaoRealizada();
		page.AguardaCarregarPagina();
		page.SetEscreverDescricao();
		page.AguardaCarregarPagina();
		//page.SetSalvar();
	
	}
}
