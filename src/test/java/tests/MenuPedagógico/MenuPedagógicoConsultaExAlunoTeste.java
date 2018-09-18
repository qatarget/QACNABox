package tests.MenuPedagógico;

import org.junit.Test;

import Page.MenuPedagógico.MenuPedagogicoConsultaExAlunoPage;
import qa.cnabox.core.BaseTest;

public class MenuPedagógicoConsultaExAlunoTeste extends BaseTest {

	MenuPedagogicoConsultaExAlunoPage page = new MenuPedagogicoConsultaExAlunoPage();

	@Test

	public void DeveConsultarExAlunoPorNome() throws InterruptedException {

		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.EscreveNomeExAluno("ADRIANE DELMONDES DE ARAUJO");
		page.FiltrarEmTela();
	}

	public void DeveCOnsultarExAlunoPorSituacao() throws InterruptedException {

		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.SetSituacao("2");
		page.FiltrarEmTela();

	}

	public void DeveConsultarExAlunoPorDataDeStatus() throws InterruptedException {
		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.EscreveDataStatusIn("01012018");
		page.EscreveDataStatusEnd("31122018");
		page.FiltrarEmTela();
	}

	public void DeveConsultarExAlunoPorIdioma() throws InterruptedException {
		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.SetIdioma("1");
		page.FiltrarEmTela();
	}

	public void DeveConsultarExAlunoPorCurso() throws InterruptedException {
		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.SetIdioma("1");
		page.SetCurso("4");

	}

	public void DeveCOnsultarExALunoPorNivel() throws InterruptedException {
		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.SetIdioma("1");
		page.SetCurso("4");
		page.SetNivel("9");
		page.FiltrarEmTela();
	}
	
	public void DeveConsultarExAlunoPorEstagio() throws InterruptedException {
		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.SetIdioma("1");
		page.SetCurso("4");
		page.SetNivel("9");
		page.SetEstagio("24");
		page.FiltrarEmTela();
	}
	
	public void DeveGerarRelatorioDeExAluno() throws InterruptedException {
		page.SetClicarMenu();
		page.SetClicarSubMenu();
		page.SetIdioma("1");
		page.SetCurso("4");
		page.SetNivel("9");
		page.SetEstagio("24");
		page.FiltrarEmTela();
		page.ExportarRelatorioExAluno();
	}
	

}