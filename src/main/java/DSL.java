import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {
	
	private WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}
	
	public void escreve(String id_campo, String texto) {
		driver.findElement(By.id(id_campo)).sendKeys(texto);
	}

	public void clicarbotao(String id_botao) {
		driver.findElement(By.id(id_botao)).click();
	}

	public void abrirComboBox(String id_combobox) {
		driver.findElement(By.id(id_combobox)).click();
	}
	
	public void escreverNomeEscola(String name_escola, String texto) {
		driver.findElement(By.className(name_escola)).sendKeys(texto);

	}
	
	public void selecionarResultadoEscola(String escola) {
		driver.findElement(By.className(escola)).click();

	}
}
