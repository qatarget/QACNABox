package qa.cnabox.tests.MenuComercial;

import org.junit.Test;

import qa.cnabox.core.BaseTest;
import qa.cnabox.page.MenuComercial.MenuComercialOrcamentoPage;

public class MenuComercialOrcamentoTeste extends BaseTest {

	MenuComercialOrcamentoPage page = new MenuComercialOrcamentoPage();
	
	@Test
	
	public void DeveCadastrarNovoOrçamento () throws InterruptedException {
		
		page.Tempo(3000);
		page.SetclicarMenuComercial();
		page.Tempo(2000);
		page.SetClicarOrcamento();
		page.Tempo(2000);
		page.SetClicaremNovoOrcamento();
		page.Tempo(2000);
		page.SetClicaremfiltrar();
		page.Tempo(2000);
		page.SelecionarAluno();
		page.Tempo(2000);
		page.GerarOrcamento();
		page.Tempo(2000);
		
		
		
		
		
	}
}
