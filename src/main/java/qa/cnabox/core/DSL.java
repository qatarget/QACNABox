package qa.cnabox.core;

import org.openqa.selenium.By;
import static qa.cnabox.core.DriverFactory.getDriver;

public class DSL {
	
	public void url(String url) 
	{
		getDriver().get(url);
	}
	
	public void escreve(String id_campo, String texto) {
		getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}

	public void clicarbotao(String id_botao) {
		getDriver().findElement(By.id(id_botao)).click();
	}

	public void abrirComboBox(String id_combobox) {
		getDriver().findElement(By.id(id_combobox)).click();
	}
	
	public void escreverNomeEscola(String name_escola, String texto) {
		getDriver().findElement(By.className(name_escola)).sendKeys(texto);

	}
	
	public void selecionarResultadoEscola(String escola) {
		getDriver().findElement(By.className(escola)).click();

	}

}
