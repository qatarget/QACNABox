package tests.MenuComercial;

import org.junit.Test;

import Page.MenuComercial.MenuComercialOrcamentoPage;
import qa.cnabox.core.BaseTest;

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
		page.SetClicarantesderolar();
		page.Tempo(2000);
		page.RolarPaginaOrcamento();
		page.Tempo(2000);
		page.GerarOrcamento();
		page.Tempo(2000);
		page.RolarPaginaOrcamento();
		page.Tempo(2000);
		page.Setdatavalidade("20092018");
		page.Tempo(2000);
		page.OrcamentoPasso2();
		page.Tempo(2000);
		page.SetEstagios();
		page.Tempo(2000);
		page.SetModalidade();
		page.Tempo(2000);
		page.RolarPagina();
		page.Tempo(2000);
		page.Setmodalidadesequencia();
		page.Tempo(2000);
		page.Setproximoestagio();
		page.Tempo(2000);
		page.SetProximoPasso();
		page.Tempo(2000);
		page.RolarPaginaOrcamento();
		page.Tempo(2000);
		page.Setcondicaodepagamento();
		page.Tempo(2000);
		page.SetMaterial();
		page.Tempo(2000);
		page.SetParcelamentoEstagios("12");
		page.Tempo(2000);
		page.SetConcluir();
		page.Tempo(2000);
		page.SetClicaremvoltar();
		
		
		
		
		
		
	}
}
