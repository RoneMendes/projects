//****************************************Descri��o Geral***************************************************************************
// Autor: Rone Mendes
// Data: 07/2019
// Projeto: Processo Seletivo QA - Take
// Plataforma: Web
// 
// Classe: BasePage.java
// Descri��o: Implementa os m�todos gen�ricos (a��es gerais do usu�rio) utilizado pelas demais classes de todo o projeto.
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
	
	public void clicar(By by) {
		DriverFactory.getDriver().findElement(by).click();
	}
	
}
