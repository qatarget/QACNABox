package tests.MenuRelatorioAdministrativo;

import org.junit.Test;

import Page.MenuRelatorioAdministrativo.MenuRelatorioAdministrativoEntregaMDPage;
import qa.cnabox.core.BaseTest;

public class MenuAdministrativoEntregaMDTeste extends BaseTest {
	
	MenuRelatorioAdministrativoEntregaMDPage page = new MenuRelatorioAdministrativoEntregaMDPage();

	@Test
	public void Devegerarrelatorio () throws InterruptedException {

		page.Tempo(3000);
		page.SetclicarMenuRelatorio();
		page.Tempo(1000);
		page.SetClicarSubmenucategoria();
		page.SetClicarSubmenuEntrega();
		page.Tempo(1000);
		page.Dadosdoaluno();
		page.Tempo(1000);
		page.Dadosdoresponsavel();
		page.Tempo(1000);
		page.rolar();
		page.Tempo(1000);
		page.DadosdoMD();
		page.Dadosdocontrato();
		page.Gerar();
		
	}
}
