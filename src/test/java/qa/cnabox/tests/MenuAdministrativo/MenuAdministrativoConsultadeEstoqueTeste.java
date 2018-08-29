package qa.cnabox.tests.MenuAdministrativo;

import org.junit.Test;

import qa.cnabox.core.BaseTest;
import qa.cnabox.page.MenuAdministrativo.MenuAdministrativoConsultadeEstoquePage;

public class MenuAdministrativoConsultadeEstoqueTeste extends BaseTest{

	MenuAdministrativoConsultadeEstoquePage page = new MenuAdministrativoConsultadeEstoquePage();
	
	
	@Test

	public void Deveinserirestoque () throws InterruptedException {

		page.Tempo(3000);
		page.SetclicarMenuComercial();
		page.Tempo(2000);
		page.SetClicarmenuConsultaEstoque();
		page.Tempo(2000);
		page.SetclicarFiltro();
		page.Tempo(2000);
		page.SetClicarAtualizarEstoque();
		page.Tempo(2000);
		page.SetAdicionarQuantidade("12");
		page.Tempo(2000);
		page.SetAdicionarTipo();
		page.Tempo(2000);
		page.SetObservacoes();
		page.Tempo(2000);
		page.Setclicaremregistrar();
	
	
	
	}
	
}
