package com.terremoto.alarme;

import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class AlarmeTest {


	
	@Test
	public void terremotoForte() {
		// Criar mocks
		Exercito exercito = mock(Exercito.class);
		SAMU samu = mock(SAMU.class);

		// Preparar ambiente
		Alarme alarme = new Alarme();
		alarme.setExercito(exercito);
		alarme.setSamu(samu);

		// Efetua um estímulo
		alarme.tremorDetectado(8, true);

		// Verificar se os mocks foram acionados
		verify(exercito).suporteTragedia();
		verify(samu).alertaPossiveisFeridos();
		// Espera que o exército seja ativado
	}

	@Test
	public void maremotoForte() {
		// Criar mocks
		GuardaCosteira guardaCosteira = mock(GuardaCosteira.class);

		// Preparar ambiente
		Alarme alarme = new Alarme();
		SAMU samu = mock(SAMU.class);
		alarme.setGuardaCosteira(guardaCosteira);
		alarme.setSamu(samu);

		// Efetua um estímulo
		alarme.tremorDetectado(8, false);

		// Verificar se os mocks foram acionados
		verify(guardaCosteira).alertaTsunami();
		verify(samu).alertaPossiveisFeridos();

	}

	@Test
	public void queimada() {
		// Criar mocks
		CorpoBombeiros corpoBombeiros = mock(CorpoBombeiros.class);

		// Preparar ambiente
		Alarme alarme = new Alarme();
		SAMU samu = mock(SAMU.class);
		alarme.setCorpoBombeiros(corpoBombeiros);
		alarme.setSamu(samu);

		// Efetua um estímulo
		alarme.queimadaDetectado();

		// Verificar se os mocks foram acionados
		InOrder inOrder = inOrder(samu, corpoBombeiros);
		inOrder.verify(samu).alertaPossiveisFeridos();
		inOrder.verify(corpoBombeiros).alertaIncendio();

	}
}