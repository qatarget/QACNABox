package qa.cnabox.tests.MenuComercial;

import qa.cnabox.core.BaseTest;
import qa.cnabox.page.MenuComercial.MenuComercialHistoricodeatendimentosPage;

import org.junit.Test;

public class MenuComercialHistoricodeAtendimentoTeste extends BaseTest {

	MenuComercialHistoricodeatendimentosPage page = new MenuComercialHistoricodeatendimentosPage();
	
	@Test
	
	public void Deverealizarfiltrohistorico () throws InterruptedException {
		

		page.SetclicarMenuComercial();
		page.Tempo(1000);
		page.SetClicarHistoricodeatendimento();
		page.Tempo(1000);
		page.SetClicaremfiltrar();
		page.Tempo(3000);
		page.SetClicaremPeriodoDE("01022017");
		page.SetPeriodoate("01082017");
		page.Tempo(1000);
		page.Situaçãodoatendido();
		page.Tempo(1000);
		page.CategoriadoAtendimento();
		page.Tempo(1000);
		page.TipodoAtendimento();
		page.Tempo(1000);
		page.SetClicaremfiltrar();
		page.Tempo(3000);
		page.SetExportar();
		
	}

}
