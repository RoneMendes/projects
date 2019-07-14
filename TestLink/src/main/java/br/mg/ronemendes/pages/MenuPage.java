//*****************************************Descri��o Geral***********************************************************************
// Autor: Rone Mendes
// Data: 05/2019
//
// Classe: MenuPage.java
// Descri��o: Cont�m os m�todos base para a classe "MenuTest.java", referente � intera��o nos principais menus do site. 
//*************************************************************************************************************************


package br.mg.ronemendes.pages;

import br.mg.ronemendes.core.BasePage;

public class MenuPage extends BasePage {

	public void acessarEspecificarCasosdeTeste() {
		clicarLink("Especificar Casos de Teste");
	}
	
	public void acessarPesquisarCasosdeTeste() {
		clicarLink("Pesquisar Casos de Teste");
	}
	
	public void acessarCasosdeTesteUsuario() {
		clicarLink("Casos de teste criados por usu�rio");
	}
}
