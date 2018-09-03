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
			page.SetSelecionarTipoAtendimento();
	
	
	}
}
