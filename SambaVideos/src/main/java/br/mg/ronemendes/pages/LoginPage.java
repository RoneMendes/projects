//*****************************************Descri��o Geral***********************************************************************
// Autor: Rone Mendes
// Data: 06/2019
//
// Classe: LoginPage.java
// Descri��o: Cont�m os m�todos referente ao login realizado pelo usu�rio 
//*************************************************************************************************************************


package br.mg.ronemendes.pages;

import org.openqa.selenium.By;

import br.mg.ronemendes.core.BasePage;
import br.mg.ronemendes.core.DriverFactory;

public class LoginPage extends BasePage{
	
	public void acessarTelaLogin() {
		DriverFactory.getDriver().get("http://web1.qa.sambatech.com:10000/auth/login");
	}
	
	public void inserirEmail(String texto) {
		escrever(By.id("inputEmail"), texto);
	}
	
	public void inserirSenha(String texto) {
		escrever(By.id("inputPassword"), texto);
	}
	
	public void clicarEntrar() {
		clicar(By.id("login"));
	}
	


}
