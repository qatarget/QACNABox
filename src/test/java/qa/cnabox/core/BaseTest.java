package qa.cnabox.core;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import qa.cnabox.page.LoginPage;
import static qa.cnabox.core.DriverFactory.getDriver;
//import static qa.cnabox.core.DriverFactory.killDriver;



public class BaseTest {

	@Rule
	public TestName testName = new TestName();

	private LoginPage page = new LoginPage();

	@Before
	public void inicializa() throws InterruptedException {
		
		page.acessarTelaInicial();
		page.SetEmail("targetbox@cna.com.br");
		page.SetSenha("teste_Target321");
		page.entrar();
		page.abrirComboBox();
		page.digitarNomeEscola("CNA Vila Mariana");
		page.setResultadoEscola();
		page.acessarEscola();
		
	}

	@After
	public void finaliza() throws IOException 
	{
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File print = ss.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(print, new File("target" + File.separator + "screenshot" + File.separator
				+ testName.getMethodName() +  ".jpg"));

		
		}
	}


