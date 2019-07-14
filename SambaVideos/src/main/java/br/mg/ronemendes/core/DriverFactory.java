//*****************************************Descri��o Geral*********************************************************************
// Autor: Rone Mendes
// Data: 06/2019
//
// Classe: DriverFactory.java
// Descri��o: Utilizada centralizar o driver. Padr�es Singleton e Factory. 
//*****************************************************************************************************************************


package br.mg.ronemendes.core;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.mg.ronemendes.core.Propriedades;

public class DriverFactory {

	
	private static WebDriver driver; 

	//construtor
	private DriverFactory() {}
	
	//todo mundo q quiser acessar algo dessa classe, tera q vir atrav�s de um m�todo estatico
	public static WebDriver getDriver() {
		//se driver diferente de null, ou seja, ja esta instanciado, ele nao entra aq
		if(driver == null) {
			switch (Propriedades.browser) {
				case FIREFOX: driver = new FirefoxDriver(); break;
				case CHROME: driver = new ChromeDriver(); break;	
			}
			driver.manage().window().setSize(new Dimension(1200, 765));
		}
		return driver;
	}
	
	public static void killDriver() {
		if(driver != null) { //pra evitar null pointed. Pq se pedir p matar sem nenhuma instancia, vai dar problema
			driver.quit();
			driver = null; //se alguem pedir de novo, uma nova instancia sera criada naquele momento
		}
	}
}
