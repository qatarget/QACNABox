package qa.cnabox.tests.MenuRelatorioComercial;

import org.junit.Test;

import qa.cnabox.core.BaseTest;
import qa.cnabox.page.MenuRelatorioComercial.MenuRelatorioComercialAtendimentoPage;


public class MenuRelatorioComercialAtendimentoTeste extends BaseTest {

	MenuRelatorioComercialAtendimentoPage page= new MenuRelatorioComercialAtendimentoPage();

	@Test

	public void Devegerarrelatorio () throws InterruptedException {
		

		page.SetclicarMenuRelatorio();
		page.Tempo(1000);
		page.SetClicarSubmenu();
		page.Tempo(1000);
		page.SetClicarSubmenucategoria();
		page.Tempo(1000);
		page.SetSelecionarPeriodoDe("01022017");
		page.Tempo(1000);
		page.SetSelecionarPeriodoAte("01082017");
		page.Tempo(1000);
		page.SetSituacaodoAtendido("3"); //Legenda **///** "3"- ALUNO, 1-CADASTRO, "2"-Prospect, "4"-Empresa, "5"-Ex-Aluno, "6"-Suspenso///
		page.Tempo(1000);
		page.Setfiltrartendimento();
		page.Tempo(9000);
		page.SetClicaremExportar();
		page.Tempo(5000);
		page.takeScreenshot();
		page.Tempo(3000);

	}
}





