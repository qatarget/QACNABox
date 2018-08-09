package qa.cnabox.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import qa.cnabox.test.LoginTest;

@RunWith(Suite.class)
@SuiteClasses({
	LoginTest.class	
	//caso tenha mais de uma classe, separar por "," e colocar a outra classe na linha de baixo.
})
public class SuiteGeral {

}
