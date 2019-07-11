//*************************************************Descri��o Geral*******************************************************************
// Autor: Rone Mendes
// Data: 06/2019
//
// Classe: VerificarTelaCobrancaBoletos.java
// Descri��o: valida as informa��es da tela Cobran�a / Boletos
//*******************************************************************************************************************************

package br.mg.ronemendes.aplicforce.test;

import org.junit.Assert;
import org.junit.Test;

import br.mg.ronemendes.aplicforce.core.BaseTest;
import br.mg.ronemendes.aplicforce.page.MenuPage;

public class VerificarTelaCobrancaBoletosTeste {

	private MenuPage menu = new MenuPage();
	
	@Test
	public void testVerificarTelaCobrancaBoleto() {
		menu.acessarMenu();
		menu.acessarCobrancasBoletos();
		menu.esperar(2000);
		Assert.assertEquals("Cobran�as / Boletos", menu.obterTitulo());
	}
	
}
