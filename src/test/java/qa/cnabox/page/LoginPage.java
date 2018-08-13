package qa.cnabox.page;

import qa.cnabox.core.BasePage;
import static qa.cnabox.core.DriverFactory.getDriver;

public class LoginPage extends BasePage {

	public void acessarTelaInicial() {
		getDriver().get("https://teste.cnabox.com.br");
	}

	public void SetEmail(String email) {
		escreveId("Email", email);
	}

	public void SetSenha(String senha) {
		escreveId("Password", senha);
	}

	public void entrar() {
		clicarbotao("btnLogar");
	}

	public void abrirComboBox() {
		abrirComboBox("select2-EscolaId-container");
	}

	public void digitarNomeEscola(String NomeEscola) {
		escreverNomeEscola("select2-search__field", NomeEscola);
	}

	public void setResultadoEscola() {
		selecionarResultadoEscola("select2-results__option--highlighted");
	}

	public void acessarEscola() {
		clicarbotao("btnTrocaEscola");

	}
	
	

}
