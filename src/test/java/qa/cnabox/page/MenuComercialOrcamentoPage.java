package qa.cnabox.page;


import qa.cnabox.core.BasePage;
import static qa.cnabox.core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class MenuComercialOrcamentoPage extends BasePage {

	public void SetclicarMenuComercial() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".nav-left-bar li:nth-of-type(6) .menu-item"));
		Thread.sleep(1000);
		}

	public void SetClicarHistoricodeatendimento() throws InterruptedException {

		clicarBotaoBy(By.linkText("Orçamento"));
		Thread.sleep(1000);
		}


	public void SetClicaremNovoOrcamento() throws InterruptedException {

		clicarBotaoBy(By.cssSelector("[href='\\#criar-novo-orcamento']"));
		Thread.sleep(1000);
	}

	public void SetClicaremfiltrar() throws InterruptedException {

		clicarBotaoBy(By.cssSelector("[action='\\/Orcamento\\/CreateModalLoad'] button"));
		Thread.sleep(1000);
	}
	public void SelecionarAluno() throws InterruptedException {

		clicarBotaoBy(By.cssSelector("#GridCreateModal tr:nth-of-type(3) .smart-form i"));
		Thread.sleep(1000);
	}

	public void GerarOrcamento() throws InterruptedException {

		clicarBotaoBy(By.cssSelector(".modal-footer [type='button']:nth-of-type(2)"));
		Thread.sleep(1000);
	}






}
