package qa.cnabox.tests.MenuComercial;

import qa.cnabox.core.BaseTest;
import qa.cnabox.page.MenuComercial.MenuComercialCadastrarParceiroPage;

import org.junit.Test;

public class MenuComercialCadastrarParceiroTeste extends BaseTest {

	MenuComercialCadastrarParceiroPage page = new MenuComercialCadastrarParceiroPage();

	@Test
	public void DeveCadastrarNovoParceiro() throws InterruptedException {
		page.SetClicarMenuComercial();
		page.AguardaCarregarPagina();
		page.SetRolarAPagina();
		page.SetClicarSubMenuParceiro();
		page.AguardaCarregarPagina();
		page.SetClicarCadastrarParceiro();
		page.AguardaCarregarPagina();
		page.SetCategoria("1");
		page.SetescreverNomeParceiro();
		page.AguardaCarregarPagina();
		page.SetescreverCNPJ("    93663029000134");
		page.AguardaCarregarPagina();
		page.SetEscreverQtdeFuncionarios("10");
		page.SetRolarAPagina();
		page.SetEscreverNomeContato();
		page.SetTelefoneComercial("1112344567");
		page.SetTelefoneCelular("11123456789");
		page.SetEscreveEmail();
		page.SetRolarAPagina();
		page.SetRolarAPagina();
		page.AguardaCarregarPagina();
		page.SetCep("    08771184");
		page.AguardaCarregarPagina();
		page.SetNumeroEnderecoParceiro("120");
		page.SetoRolarCimaSemPageUP();
		page.AguardaCarregarPagina();
		page.SetSalvar();

	}

}
