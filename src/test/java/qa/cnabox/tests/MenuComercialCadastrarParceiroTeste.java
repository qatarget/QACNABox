package qa.cnabox.tests;

import qa.cnabox.core.BaseTest;
import qa.cnabox.page.MenuComercialCadastrarParceiroPage;
import static qa.cnabox.core.DriverFactory.getDriver;

import java.awt.AWTException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class MenuComercialCadastrarParceiroTeste extends BaseTest  {
	
	MenuComercialCadastrarParceiroPage page = new MenuComercialCadastrarParceiroPage();
	
	@Test
	public void DeveCadastrarNovoParceiro() throws InterruptedException {
		page.SetClicarMenuComercial();
		page.SetClicarSubMenuParceiro();
		page.AguardaCarregarPagina();
		page.SetClicarCadastrarParceiro();
		page.AguardaCarregarPagina();
		page.SetCategoria("1");
		page.SetescreverNomeParceiro();
		page.AguardaCarregarPagina();
		page.SetescreverCNPJ("    75183755000178");
		page.AguardaCarregarPagina();
		page.SetEscreverQtdeFuncionarios("10");
		page.SetRolarAPagina();
		page.SetEscreverNomeContato();
		page.SetTelefoneComercial("1112344567");
		page.SetTelefoneCelular("11123456789");
		page.SetEscreveEmail();
		page.SetRolarAPagina();
		page.AguardaCarregarPagina();
		page.SetCep("    02118000");
		page.AguardaCarregarPagina();
		page.SetNumeroEnderecoParceiro("120");
		page.SetoRolarCimaSemPageUP();
		//page.SetSalvar();
		
	}

}
