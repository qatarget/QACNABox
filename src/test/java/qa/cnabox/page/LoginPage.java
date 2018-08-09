package qa.cnabox.page;

import qa.cnabox.core.DSL;

public class LoginPage {

	private DSL dsl = new DSL();

	public void url(String url) {
		dsl.url(url);
	}

	public void setEmail(String email) {
		dsl.escreve("Email", email);
	}

	public void setPassword(String senha) {
		dsl.escreve("Password", senha);
	}

	public void setButton(String clicar_botao) {
		dsl.clicarbotao(clicar_botao);
	}

	public void abrirComboBox(String abrirComboBox) {
		dsl.abrirComboBox(abrirComboBox);
	}

	public void digitarNomeEscola(String NomeEscola) {
		dsl.escreverNomeEscola("select2-search__field", NomeEscola);
	}

	public void setResultadoEscola(String SelecionarEscola) {
		dsl.selecionarResultadoEscola(SelecionarEscola);
	}

	public void acessarEscola(String btn_acessarEscola) {
		dsl.clicarbotao(btn_acessarEscola);

	}

}
