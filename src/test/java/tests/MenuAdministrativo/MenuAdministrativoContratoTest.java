package tests.MenuAdministrativo;

import org.junit.Test;
import Page.MenuAdministrativo.MenuAdministrativoContratoPage;
import qa.cnabox.core.BaseTest;

public class MenuAdministrativoContratoTest extends BaseTest {

	MenuAdministrativoContratoPage page = new MenuAdministrativoContratoPage();
	@Test
	
	public void Deverealizarofiltro() throws InterruptedException { 
		
		page.Tempo(4000);
		page.SetClicarMenuAdministrativo();
		page.Tempo(4000);
		page.SetClicarContratos();
		page.Tempo(3000);
		page.SetFiltrarcontratos();
		page.Tempo(2000);
		page.SetPesquisaContratoNome("QA");
		page.Tempo(2000);
		page.RolarPagina();
		page.SetClicaremfiltrar();
		page.Tempo(3000);
		page.SetbotãoAcoes();
		page.Tempo(5000);
		page.RolarPagina();
		page.Tempo(4000);
		page.RolarPaginaPageDown();
		page.Tempo(4000);
		page.Setclicartotal();
		page.Tempo(4000);
		page.SetBotãoCaixa();
		page.Tempo(4000);
		page.SetGerarBoletosclick();
		page.Tempo(5000);
		page.RolarPaginaPageDown();
		page.Tempo(4000);
		page.RolarPaginaPageDown();
		page.Tempo(4000);
		page.RolarPaginaPageDown();
		page.Tempo(4000);
		page.SetLayout("2");
		page.Tempo(2000);
		page.Setmodalidadeboleto("2");
		page.Tempo(3000);
		page.Settipoconta("1016");
		page.Tempo(3000);
		page.SetCarteiraID("1382");
		page.Tempo(3000);
		page.SetBotãoGerar();
		
//page.Tempo(3000);
///Legenda 1- Comum, 2-Carnê///
//page.SetLayout("2");
//page.Tempo(2000);
////Legenda 1- Sem registro, 2-Com registro ///
//page.Setmodalidadeboleto("2");
//page.Tempo(2000);
//// Legenda Informe a contaConrrete com o seu respectivo ID Cadastrado no Box.///
//page.Settipoconta("1016");
//page.Tempo(2000);
//page.SetCarteiraID("1382");
//page.Tempo(3000);
//page.SetBotãoGerar();

}
}