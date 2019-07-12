//***********************************Descri��o Geral*******************************************************************************************************************
// Autor: Rone Mendes
// Data: 06/2019
//
// Classe: RealizarVisitaPage.java
// Descri��o: Cont�m os m�todos referente as a��es do fluxo de visita ao PDV (Ponto de Venda). 
//***************************************************************************************************

package br.mg.ronemendes.aplicforce.page;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.mg.ronemendes.aplicforce.core.BasePage;
import br.mg.ronemendes.aplicforce.core.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import net.bytebuddy.implementation.bytecode.Throw;

public class RealizarVisitaPage extends BasePage {

	WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);

	public void finalizarDriver() {
		DriverFactory.killDriver();
	}

	public void clicarBotaoVisita() {

		String mensagem = "";

		do {

			mensagem = obterTextoBotao();

			if (mensagem.equals("INICIAR VISITA")) {
				clicar(By.id("afv.aplic.com.br.dev:id/btnStartVisit"));
			} else {
				clicar(By.id("afv.aplic.com.br.dev:id/btnStartVisit"));
			}

		} while (mensagem.equals("PR�XIMO CLIENTE"));

	}

	public void clicarBotaoOK() {
		clicar(By.id("afv.aplic.com.br.dev:id/btnStepZeroFirstAction"));
	}

	public void coletarEstoque() {
		clicarPorTexto("REALIZAR CONTAGEM DO ESTOQUE");
	}

	public void preencherEstoque(String num) {
		// escrever(By.id("afv.aplic.com.br.dev:id/txtQuantity"), num);
		escrever(By.xpath("//*[@class = 'android.widget.EditText' and @bounds = '[970,264][1032,392]']"), num);
		escrever(By.xpath("//*[@class = 'android.widget.EditText' and @bounds = '[970,504][1032,632]']"), num);
		escrever(By.xpath("//*[@class = 'android.widget.EditText' and @bounds = '[970,744][1032,872]']"), num);
		escrever(By.xpath("//*[@class = 'android.widget.EditText' and @bounds = '[970,984][1032,1112]']"), num);
		escrever(By.xpath("//*[@class = 'android.widget.EditText' and @bounds = '[970,1224][1032,1352]']"), num);
		escrever(By.xpath("//*[@class = 'android.widget.EditText' and @bounds = '[970,1464][1032,1592]']"), num);
		escrever(By.xpath("//*[@class = 'android.widget.EditText' and @bounds = '[970,1704][1032,1812]']"), num);
		scrollDown();
		escrever(By.xpath("//*[@class = 'android.widget.EditText' and @bounds = '[970,1572][1032,1700]']"), num);
	}

	public void confirmarContagem() {
		clicarPorTexto("CONFIRMAR CONTAGEM");
	}

	public void clicarProdutos() {
		clicarPorTexto("PRODUTOS");
	
	}

	public void clicarSemVenda() {
		clicar(By.id("afv.aplic.com.br.dev:id/btnStepTwoSecondAction"));
	}

	public boolean existeProduto() {
		return existeElementoPorTexto("Pre�o de Venda");
	}

//	public void preencherQtdProdutosTeste() throws Exception {

//		if (result == true) {
//			escrever(By.id("afv.aplic.com.br.dev:id/txtQuantity"), "1");
//		} else {
//			clicarPorTexto("FINALIZAR VENDA");
//			Assert.assertEquals("ATEN��O! Seu carrinho est� vazio. Voc� precisa clicar em VISITA SEM VENDA para "
//					+ "concluir uma visita deste tipo.", obterTexto());
//			clicar(By.id("afv.aplic.com.br.dev:id/btnStepTwoSecondAction"));
//			clicarPorTexto("PDV Fechado (hor�rio)");
//			clicarPorTexto("CONFIRMAR MOTIVO");
//			clicar(By.id("afv.aplic.com.br.dev:id/btnStepThreeFirstAction"));
//
//			finalizarDriver();
//		}

//	}
	
	public void preencherQtdProdutos() {
		escrever(By.id("afv.aplic.com.br.dev:id/txtQuantity"), "1");
	}

	public void rastrear() {
		clicar(By.id("afv.aplic.com.br.dev:id/btnTracking"));
	}

	public void adicionarManual() {
		clicarPorTexto("ADICIONAR MANUALMENTE");
	}

	public void clicarBot�oAddSerial() {
		clicar(By.id("afv.aplic.com.br.dev:id/btnShowTrackList"));
	}

	public void clicarSerial() {
		clicar(By.id("afv.aplic.com.br.dev:id/lblTrack"));
		clicar(By.id("afv.aplic.com.br.dev:id/action_add_tracks"));
	}

	public void voltar() {
		clicar(MobileBy.AccessibilityId("Navegar para cima"));
	}

	public void excluirSerial() {
		clicar(By.id("afv.aplic.com.br.dev:id/btnRemoveTrack"));
	}

	public void finalizarVenda() {
		clicar(By.id("afv.aplic.com.br.dev:id/btnConfirmSale"));
	}

	public void formaPagamento() {
		clicarPorTexto("Dinheiro");
	}

	public void confirmarFinalizar() {
		clicar(By.id("afv.aplic.com.br.dev:id/btnStepThreeFirstAction"));
	}

	public void motivoVisita() {
		clicarPorTexto("PDV Fechado (hor�rio)");
	}

	public void confirmarMotivo() {
		clicarPorTexto("CONFIRMAR MOTIVO");
	}

	public void clicarVisitaSemVenda() {
		clicar(By.id("afv.aplic.com.br.dev:id/btnStepTwoSecondAction"));
	}
	
	public void selecionarMotivoVisita() {
		clicarPorTexto("PDV Fechado (hor�rio)");
	}
	
	public void clicarConfirmarMotivo() {
		clicarPorTexto("CONFIRMAR MOTIVO");
	}
	
	public void esperar(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
