//*****************************************Descri��o Geral**********************************************************************
// Autor: Rone Mendes
// Data: 05/2019
// App: TestLink - Sistema Web respons�vel pela gest�o de Casos e Planos de Teste.
// Plataforma: Android
// 
// Classe: BaseTest.java
// Descri��o: Classe base de teste para as demais classes do sistema. Utilizada para logar/deslogar no sistema, ap�s a execu��o da bateria de testes. 
//************************************************************************************************************************


package br.mg.ronemendes.core;

import org.junit.Before;

import br.mg.ronemendes.pages.LoginPage;

public class BaseTest {

	private static LoginPage page = new LoginPage();
	
	@Before
	public void inicializar() {
		page.acessarTelaLogin();
		
		page.inserirLogin("ronemendes");
		page.inserirSenha("H@mmetT100110");
		page.logar();
	}
	
}
