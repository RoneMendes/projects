//*************************************************Descri��o Geral*******************************************************************
// Autor: Rone Mendes
// Data: 06/2019
//
// Classe: VerificarTelaCobrancaBoletos.java
// Descri��o: valida as informa��es da tela Relat�rio de vendas
//*******************************************************************************************************************************
package br.mg.ronemendes.aplicforce.test;

import org.junit.Assert;
import org.junit.Test;

import br.mg.ronemendes.aplicforce.core.BaseTest;
import br.mg.ronemendes.aplicforce.page.MenuPage;

public class VerificarTelaRelatorioVendas{

	private MenuPage menu = new MenuPage();
	
	@Test
	public void testVerificarTelaRelVendas() {
		
		menu.acessarMenu();
		menu.acessarRelatorioVendas();
		menu.esperar(2000);
		Assert.assertEquals("Relat�rio de Vendas", menu.obterTitulo());
	}
	
	
}
