package com.terremoto.alarme;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class AlarmeTest {

	@Test
	public void terremotoForte() {
		// Criar mocks
		Exercito exercito = mock(Exercito.class);

		// Preparar ambiente
		Alarme alarme = new Alarme();
		alarme.setExercito(exercito);

		// Efetua um estímulo
		alarme.tremorDetectado(8, true);

		// Verificar se os mocks foram acionados
		verify(exercito).suporteTragedia();
		// Espera que o exército seja ativado
	}

	@Test
	public void maremotoForte() {
		// Criar mocks
		GuardaCosteira guardaCosteira = mock(GuardaCosteira.class);

		// Preparar ambiente
		Alarme alarme = new Alarme();
		alarme.setGuardaCosteira(guardaCosteira);

		// Efetua um estímulo
		alarme.tremorDetectado(8, false);

		// Verificar se os mocks foram acionados
		verify(guardaCosteira).alertaTsunami();

		// Espera que o exército seja ativado
	}

	@Test
	public void queimada() {
		// Criar mocks
		CorpoBombeiros corpoBombeiros = mock(CorpoBombeiros.class);

		// Preparar ambiente
		Alarme alarme = new Alarme();
		alarme.setCorpoBombeiros(corpoBombeiros);

		// Efetua um estímulo
		alarme.queimadaDetectado();

		// Verificar se os mocks foram acionados
		verify(corpoBombeiros).alertaIncendio();

		// Espera que o exército seja ativado
	}
}