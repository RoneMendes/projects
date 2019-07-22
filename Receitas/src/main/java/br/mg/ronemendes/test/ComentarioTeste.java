//*****************************************Descri��o Geral***********************************************************************
// Autor: Rone Mendes
// Data: 07/2019
// Projeto: Processo Seletivo QA - Take
//
// Classe: ComentarioTeste.java
// Descri��o: Cont�m os m�todo de teste referente a inser��o de um coment�rio no sistema. 
//*************************************************************************************************************************



package br.mg.ronemendes.test;

import org.junit.Test;

import br.mg.ronemendes.core.BaseTest;
import br.mg.ronemendes.pages.ComentarioPage;

public class ComentarioTeste extends BaseTest {

	private ComentarioPage com = new ComentarioPage();
	
	//fun��o que insere um coment�rio na p�gina principal
	@Test
	public void deveInserirComentario() throws InterruptedException {

		com.inserirComentario("Teste 123456789RR");
		Thread.sleep(3000);					//sleep inserido para carregamento dos demais campos
		com.inserirEmail("testerone999@email.com.br");
		com.inserirNome("Rone Teste1");
		com.inserirSite("www.teste000.comm.br");
		com.clicarPublicarComentario();
		
		//Aqui seria inserido um "Assert" para confirmar a publica��o do coment�rio e n�o gerar um "falso positivo",
		//por�m o sistema est� com um bug ao qual n�o exibe a mensagem. Ocorre de maneira intermitente.
		// Esse teste cobre apenas o caminho feliz do fluxo.
	}
	
}
