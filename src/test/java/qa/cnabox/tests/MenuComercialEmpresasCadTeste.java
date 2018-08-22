package qa.cnabox.tests;

import qa.cnabox.core.BaseTest;
import qa.cnabox.page.MenuComerEmpresasCadastrPage;
import qa.cnabox.core.DriverFactory;

import org.junit.Test;

public class MenuComercialEmpresasCadTeste extends BaseTest {

	MenuComerEmpresasCadastrPage page = new MenuComerEmpresasCadastrPage();
	
	@Test
	
	public void DeveCadastrarNovaEmpresa () throws InterruptedException {
		
		page.SetclicarMenuComercial();
		page.esperaCarregar(2000);
		page.SetClicarEmpresas();
		page.esperaCarregar(2000);
		page.SetClicarNovaEmpresa();
		page.esperaCarregar(2000);
		page.SetescreverNome();
		page.esperaCarregar(2000);
		page.SetescreverRazao();
		page.esperaCarregar(2000);
		page.SetescreverCNPJ();
		page.SetInscricaoEstadual("968.811.119.681");
		
		
	}
}
