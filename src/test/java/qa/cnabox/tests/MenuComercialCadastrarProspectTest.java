package qa.cnabox.tests;

import qa.cnabox.core.BaseTest;
import qa.cnabox.page.MenuComercialCadastrarProspectPage;
import static qa.cnabox.core.DriverFactory.getDriver;

import java.awt.AWTException;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class MenuComercialCadastrarProspectTest extends BaseTest {

	MenuComercialCadastrarProspectPage page = new MenuComercialCadastrarProspectPage();

//*********************************************************Cadastro de Prospect**************************************************************//

	@Test
	public void DeveCadastrarNovoProspect() throws InterruptedException, AWTException {
		page.SetClicarMenu();
		page.AguardaCarregarPagina();
		page.SetClicarSubMenu();
		page.AguardaCarregarPagina();
		page.SetClicarCadastrarProspect();
		page.AguardaCarregarPagina();
		page.SetEscreveNomeAluno();
		page.SetEscreveEmail();
		page.SetEscreverEmailAleatorio();
		page.SetSexoMasculino();
		page.SetDataNascimento(" 14111986 ");
		page.SetEstadoCivil("3");
		page.SetTelefoneFixo(" 11345499472 ");
		page.SetTelefoneCelular(" 11997499671 ");
		page.SetCep("        18045520");
		page.RolarPagina();
		page.SetNumeroResidencia("120");
		page.RolarPagina();
		page.SetSelecionarIdioma();
		page.AguardaCarregarPagina();
		page.RolarPagina();
		page.SetSelecionarHorario();
		page.AguardaCarregarPagina();
		page.SetRolarAPagina();
		//Colocar CPF Manualmente//
		page.SetEscreveCPF("894.882.430-90");
		page.AguardaCarregarPagina();
		page.SetRolarAPagina();
		page.SetSelecionarMidia("41");
		page.AguardaCarregarPagina();
		page.SetSelecionarCampanha("8");
		Thread.sleep(2000);
		page.SetRolarPaginaParaCima();
		Thread.sleep(2000);
		page.SetoRolarCimaSemPageUP();
		Thread.sleep(2000);
		page.SetSelecionarTipoAtendimento();
		page.SetSelecionarAcaoRealizada();

	}

	// ************************************************************ Filtros	// ***********************************************************************//

	@Test
	public void DeveRealizarFiltroDeProspectPorNome() throws InterruptedException {
		getDriver()
				.findElement(By.xpath(
						"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/a[@href='#']/span[.='Comercial']"))
				.click();
		getDriver().findElement(By.xpath(
				"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/ul[@class='sub-menu']//span[.='Atendimento']"))
				.click();
		Thread.sleep(3000);
		getDriver().findElement(By.cssSelector("#AtendimentoNome")).sendKeys("ALUNO TESTE");
		getDriver().findElement(By.cssSelector("#btnAtendimentoFilter")).click();
		Thread.sleep(3000);
		Assert.assertEquals("ALUNO TESTE",
				getDriver().findElement(By.cssSelector("#AtendimentoNome")).getAttribute("value"));

	}

	@Test
	public void DeveRealizarFiltroDeProspectPorEmail() throws InterruptedException {
		getDriver()
				.findElement(By.xpath(
						"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/a[@href='#']/span[.='Comercial']"))
				.click();
		getDriver().findElement(By.xpath(
				"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/ul[@class='sub-menu']//span[.='Atendimento']"))
				.click();
		Thread.sleep(3000);
		getDriver().findElement(By.cssSelector("#AtendimentoEmail")).sendKeys("TESTE@TESTE.COM.BR");
		getDriver().findElement(By.cssSelector("#btnAtendimentoFilter")).click();
		Thread.sleep(3000);
		Assert.assertEquals("TESTE@TESTE.COM.BR",
				getDriver().findElement(By.cssSelector("#AtendimentoEmail")).getAttribute("value"));
	}

	@Test
	public void DeveRealizarFiltroDeProspectPorTelefone() throws InterruptedException {
		getDriver()
				.findElement(By.xpath(
						"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/a[@href='#']/span[.='Comercial']"))
				.click();
		getDriver().findElement(By.xpath(
				"//div[@id='menu-lateral']/ul[@class='nav-left-bar']/li[6]/ul[@class='sub-menu']//span[.='Atendimento']"))
				.click();
		Thread.sleep(3000);
		getDriver().findElement(By.cssSelector("#AtendimentoTelefone")).sendKeys("  1997499671 ");
		getDriver().findElement(By.cssSelector("#btnAtendimentoFilter")).click();
		Thread.sleep(3000);
		Assert.assertEquals("(19) 9749-9671",
				getDriver().findElement(By.cssSelector("#AtendimentoTelefone")).getAttribute("value"));
	}
}
