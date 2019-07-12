//*************************************************Descri��o Geral*******************************************************************
// Autor: Rone Mendes
// Data: 06/2019
//
// Classe: RealizarVisitaTeste.java
// Descri��o: respons�vel pelos testes no fluxo de realizar visita ao PDV.
//*******************************************************************************************************************************

package br.mg.ronemendes.aplicforce.test;

import static br.mg.ronemendes.aplicforce.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.mg.ronemendes.aplicforce.core.BaseTest;
import br.mg.ronemendes.aplicforce.page.RealizarVisitaPage;

public class RealizarVisitaTeste extends BaseTest {

	private RealizarVisitaPage visita = new RealizarVisitaPage();

	@Test
	public void iniciarVisita() throws Exception {

		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		boolean result;

		visita.clicarBotaoVisita();
		visita.clicarBotaoOK();
		visita.coletarEstoque();
		visita.preencherEstoque("1");
		visita.confirmarContagem();
		visita.clicarProdutos();

		result = visita.existeProduto();
		if (result == true) {
			visita.preencherQtdProdutos();
			visita.rastrear();
			visita.adicionarManual();
			visita.clicarBot�oAddSerial();
			visita.clicarSerial();

			visita.esperar(3000);
			visita.voltar();

			visita.finalizarVenda();

			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("afv.aplic.com.br.dev:id/stepper_title")));
			visita.scrollDown();
			visita.formaPagamento();
			visita.confirmarFinalizar();

		} else {
			visita.finalizarVenda();
			Assert.assertEquals("ATEN��O! Seu carrinho est� vazio. Voc� precisa clicar em VISITA SEM VENDA para "
					+ "concluir uma visita deste tipo.", visita.obterTexto());
			visita.clicarVisitaSemVenda();
			visita.selecionarMotivoVisita();
			visita.clicarConfirmarMotivo();
			visita.confirmarFinalizar();
		}

		

	}

	@Test
	public void visitaSemVenda() {

		visita.clicarBotaoVisita();
		visita.clicarBotaoOK();
		visita.coletarEstoque();
		visita.preencherEstoque("1");
		visita.confirmarContagem();
		visita.clicarSemVenda();
		visita.motivoVisita();
		visita.confirmarMotivo();
		visita.confirmarFinalizar();
		visita.esperar(5000); // sleep para esperar mensagem de confirma��o ser exibida.

	}

}
