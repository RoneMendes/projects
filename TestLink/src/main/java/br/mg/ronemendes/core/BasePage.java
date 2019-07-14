//****************************************Descri��o Geral***************************************************************************
// Autor: Rone Mendes
// Data: 05/2019
// App: TestLink - Sistema Web respons�vel pela gest�o de Casos e Planos de Teste.
// Plataforma: Web
// 
// Classe: BasePage.java
// Descri��o: Implementa os m�todos gen�ricos (a��es gerais e b�sicas do usu�rio) utilizado pelas demais classes de todo o projeto.
//************************************************************************************************************************


package br.mg.ronemendes.core;

import org.openqa.selenium.By;

public class BasePage {

	
	public void escrever(By by, String texto) {
		DriverFactory.getDriver().findElement(by).sendKeys(texto);
	}
	
	public void escrever(String id_campo, String texto) {
		escrever(By.id(id_campo), texto);
	}
	
	public void clicarBotao(By by) {
		DriverFactory.getDriver().findElement(by).click();
	}
	
	public void clicarBotao(String id) {
		clicarBotao(By.id(id));
	}
	
//	public void clicarLink(By by, String texto) {
//		clicarLink(By.xpath("//*[@id='testspecification_topics']//a"), texto);
//	}
	
	public void clicarLink(String link) {
		DriverFactory.getDriver().findElement(By.linkText(link)).click();
	}
	
//	public void clicarBotaoPorTexto(String texto) {
//		clicarBotao(By.xpath("//button[.='"+texto+"']"));
//	}
	
}
