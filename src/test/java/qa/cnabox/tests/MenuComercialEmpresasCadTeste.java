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
		page.SetClicarEmpresas();
		page.SetClicarNovaEmpresa();
		page.SetescreverNome();
		page.SetescreverRazao();
		page.SetescreverCNPJ();
		page.SetInscricaoEstadual("968.811.119.681");
		
		
	}
}
