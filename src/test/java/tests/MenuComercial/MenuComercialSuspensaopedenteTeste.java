package tests.MenuComercial;

import org.junit.Test;

import Page.MenuComercial.MenuGerencialSuspensaopedentePage;
import qa.cnabox.core.BaseTest;

public class MenuComercialSuspensaopedenteTeste extends BaseTest {

	MenuGerencialSuspensaopedentePage page = new MenuGerencialSuspensaopedentePage();
	
	@Test

	public void Deverealizarasuspensao () throws InterruptedException {

		page.Tempo(3000);
		page.SetclicarMenuComercial();
		page.Tempo(2000);
		page.SetrolarMenuPrincipal();
		page.Tempo(2000);
		page.SetClicarmenuSuspensaoPendente();
		page.Tempo(2000);
		page.SetclicarFiltro();
		page.Tempo(2000);
		page.RolarPagina();
		page.Tempo(2000);
		page.RolarPagina();
		page.RolarPagina();
		page.RolarPagina();
		page.Setselecionaralunos();
		page.Tempo(2000);
		page.SetselecionarAprovar();
		page.SetDescricao();
		page.Tempo(2000);
		page.SetDescricaosalvar();
		
		
	
	
	
	
	
	}


}
