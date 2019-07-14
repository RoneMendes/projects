//*****************************************Descri��o Geral***********************************************************************
// Autor: Rone Mendes
// Data: 05/2019
//
// Classe: MenuTest.java
// Descri��o: Cont�m os m�todos de teste referente a navega��o entre os menus realizada pelo usu�rio no site. 
//*************************************************************************************************************************


package br.mg.ronemendes.testes;

import org.junit.Test;

import br.mg.ronemendes.core.BaseTest;
import br.mg.ronemendes.core.DriverFactory;
import br.mg.ronemendes.pages.MenuPage;

public class MenuTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	
	@Test
	public void testEspecificarCasosdeTeste() {
		DriverFactory.getDriver().switchTo().frame("mainframe");
		menu.acessarEspecificarCasosdeTeste();
	}
	
	@Test
	public void testPesquisarCasosdeTeste() {
		DriverFactory.getDriver().switchTo().frame("mainframe");
		menu.acessarPesquisarCasosdeTeste();
	}
	
	@Test
	public void testCasosDeTestesUsuario() {
		DriverFactory.getDriver().switchTo().frame("mainframe");
		menu.acessarCasosdeTesteUsuario();
	}
	
}
