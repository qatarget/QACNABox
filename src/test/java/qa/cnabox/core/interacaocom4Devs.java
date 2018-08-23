package qa.cnabox.core;

import qa.cnabox.core.BaseTest;
import static qa.cnabox.core.DriverFactory.getDriver;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.junit.Test;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriverException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javafx.beans.binding.ObjectExpression;






public class interacaocom4Devs  extends BaseTest{
	
	@Test
	public void interacao4devs ()throws InterruptedException{
	
		
		
		try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_T);
        } catch (AWTException ex) {
            throw new WebDriverException("Erro ao digitar CTRL + T", ex);
        }

        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String handle : getDriver().getWindowHandles()) {
        	getDriver().switchTo().window(handle);}
        
        Thread.sleep(1000);
        getDriver().navigate().to("https://www.4devs.com.br/gerador_de_cpf");
        Thread.sleep(2000);
        getDriver().findElement(By.cssSelector("[type='button']")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.cssSelector(".clipboard-copy")).click();
        Thread.sleep(2000);
        
        getDriver().findElement(By.cssSelector(".clipboard-copy")).click();
        Thread.sleep(2000);
        
        getDriver().close();
        
        
      
        
        
        
        
//		 getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"");
 //
	//	 for (String handle : getDriver().getWindowHandles()) {
 //
	// getDriver().switchTo().window(handle);}
	//
		//getDriver().navigate().to("https://www.4devs.com.br/gerador_de_cpf");
	
	}

}
