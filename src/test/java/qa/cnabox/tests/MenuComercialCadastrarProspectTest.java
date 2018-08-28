package qa.cnabox.tests;

import qa.cnabox.core.BaseTest;
import qa.cnabox.page.MenuComercial.MenuComercialCadastrarProspectPage;

import static qa.cnabox.core.DriverFactory.getDriver;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
public class MenuComercialCadastrarProspectTest extends BaseTest {

	MenuComercialCadastrarProspectPage page = new MenuComercialCadastrarProspectPage();

//*********************************************************Cadastro de Prospect**************************************************************//

	@Test
	public void DeveCadastrarNovoProspect() throws InterruptedException {
		page.SetClicarMenu();
		page.AguardaCarregarPagina();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetClicarCadastrarProspect();
		page.AguardaCarregarPagina();
		page.SetEscreveNomeAluno();
		page.SetEscreveEmail();
		page.SetSelecionarTipoAtendimento();
		page.AguardaCarregarPagina();
		page.SetSelecionarAcaoRealizada();
		page.AguardaCarregarPagina();
		page.SetEscreverDescricao();
		page.AguardaCarregarPagina();
		page.SetSexoMasculino();
		page.SetDataNascimento(" 14111986 ");
		page.SetEstadoCivil("3");
		page.SetTelefoneFixo(" 11345499472 ");
		page.SetTelefoneCelular(" 11997499671 ");
		page.SetRolarAPagina();
		page.SetCep("        18045520");
		page.RolarPagina();
		page.SetNumeroResidencia("120");
		page.RolarPagina();
		page.SetSelecionarIdioma();
		page.AguardaCarregarPagina();
		page.RolarPagina();
		page.SetSelecionarHorario();
		page.AguardaCarregarPagina();
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,350)", "");
		page.AguardaCarregarPagina();
		page.BuscaCPF();
		Thread.sleep(3000);
		page.AguardaCarregarPagina();
		page.SetRolarAPagina();
		page.SetSelecionarMidia("41");
		page.AguardaCarregarPagina();
		page.SetSelecionarCampanha("8");
		page.AguardaCarregarPagina();
		page.SetoRolarCimaSemPageUP();
		page.AguardaCarregarPagina();
		page.SetSalvar();

	}
}


	