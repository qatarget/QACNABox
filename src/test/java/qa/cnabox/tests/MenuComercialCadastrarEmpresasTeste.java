package qa.cnabox.tests;

import qa.cnabox.core.BaseTest;
import qa.cnabox.page.MenuComercial.MenuComercialCadastrarEmpresasPage;

import org.junit.Test;

public class MenuComercialCadastrarEmpresasTeste extends BaseTest {

	MenuComercialCadastrarEmpresasPage page = new MenuComercialCadastrarEmpresasPage();
	
	@Test
	
	public void DeveCadastrarNovaEmpresa () throws InterruptedException {
		
		page.esperaCarregar(3000);
		page.SetclicarMenuComercial();
		page.esperaCarregar(3000);
		page.SetClicarEmpresas();
		page.esperaCarregar(2000);
		page.SetClicarNovaEmpresa();
		page.esperaCarregar(2000);
		page.SetescreverNome();
		page.esperaCarregar(2000);
		page.SetescreverRazao();
		page.esperaCarregar(3000);
		page.BuscaCNPJ();
		page.Tempo(3000);
		page.SetInscricaoEstadual("968.811.119.681");
		page.Tempo(3000);
		page.BuscaCEP();
		page.Tempo(2000);
		page.EnderecoNumero("914");
		page.Tempo(2000);
		page.SetTelefone();
		page.Tempo(1000);
		page.SetEmail();
		page.Tempo(1000);
		page.SetTipo();
		page.Tempo(1000);
		page.Setclicarsalvar();
		
	}
}
