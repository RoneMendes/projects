//*****************************************Descri��o Geral***********************************************************************
// Autor: Rone Mendes
// Data: 06/2019
//
// Classe: Propriedades.java
// Descri��o: Classe respons�vel por definir em qual navegador os testes ser�o realizados. 
//*************************************************************************************************************************

package br.mg.ronemendes.core;

public class Propriedades {

	public static boolean FECHAR_BROWSER = false;

	//para definir em qual browser executar
	public static Browsers browser = Browsers.CHROME;
	
	//para definir em qual browser executar
	public enum Browsers{
		 CHROME,
		 FIREFOX
	}
}
