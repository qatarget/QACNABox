package qa.cnabox.test;

import org.junit.Test;


import qa.cnabox.page.LoginPage;

public class LoginTest {

	private LoginPage page = new LoginPage();

	@Test
	public void DeveRealizarLogin() {

		page.url("https://teste.cnabox.com.br");
		page.setEmail("targetbox@cna.com.br");
		// dsl.escreve("Email", "targetbox@cna.com.br");
		// driver.findElement(By.id("Email")).sendKeys("targetbox@cna.com.br");
		page.setPassword("teste_Target321");
		// dsl.escreve("Password", "teste_Target321");
		// driver.findElement(By.id("Password")).sendKeys("teste_Target321");
		page.setButton("btnLogar");
		// dsl.clicarbotao("btnLogar");
		// driver.findElement(By.id("btnLogar")).click();
		page.abrirComboBox("select2-EscolaId-container");
		// dsl.abrirComboBox("select2-EscolaId-container");
		// driver.findElement(By.id("select2-EscolaId-container")).click();
		page.digitarNomeEscola("ADMINISTRACAO NACIONAL CNA");
		// dsl.escreverNomeEscola("select2-search__field", "ADMINISTRACAO NACIONAL
		// CNA");
		// driver.findElement(By.className("select2-search__field")).sendKeys("ADMINISTRACAO
		// NACIONAL CNA");
		page.setResultadoEscola("select2-results__option--highlighted");
		// dsl.selecionarResultadoEscola("select2-results__option--highlighted");
		// driver.findElement(By.className("select2-results__option--highlighted")).click();
		page.acessarEscola("btnTrocaEscola");
		// dsl.clicarbotao("btnTrocaEscola");
		// driver.findElement(By.id("btnTrocaEscola")).click();

		// driver.quit();

	}
}
