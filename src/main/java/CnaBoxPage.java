import org.openqa.selenium.WebDriver;

public class CnaBoxPage {
	
	private DSL dsl;
	
	public CnaBoxPage(WebDriver driver) {
		dsl = new DSL(driver);	
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


