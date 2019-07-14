//*****************************************Descri��o Geral***********************************************************************
// Autor: Rone Mendes
// Data: 06/2019
//
// Classe: EnviarTest.java
// Descri��o: Cont�m os m�todos referente aos envios de v�deos ao site, realizados pelo usu�rio. 
//*************************************************************************************************************************


package br.mg.ronemendes.test;

import org.junit.Assert;
import org.junit.Test;

import br.mg.ronemendes.core.BaseTest;
import br.mg.ronemendes.pages.EnviarPage;
import br.mg.ronemendes.pages.MenuPage;

public class EnviarTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private EnviarPage env = new EnviarPage();
	
	
	@Test
	public void uparArquivo() throws InterruptedException {
		menu.acessarTelaEnviarArquivos();
		env.clicarUpload();
		Assert.assertEquals("CLIQUE OU ARRASTE PARA ADICIONAR NOVOS V�DEOS.", env.obterMensagem());
	}

}
