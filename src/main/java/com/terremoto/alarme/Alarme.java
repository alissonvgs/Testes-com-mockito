package com.terremoto.alarme;

public class Alarme {

	private Exercito exercito;
	private GuardaCosteira guardaCosteira;
	private CorpoBombeiros corpoBombeiros;

	public void tremorDetectado(int magnetude, boolean terrestre) {

		if (terrestre) {

			exercito.suporteTragedia();
		} else {
			guardaCosteira.alertaTsunami();
		}
	}

	public void setExercito(Exercito exercito) {
		this.exercito = exercito;

	}

	public void setGuardaCosteira(GuardaCosteira guardaCosteira) {
		this.guardaCosteira = guardaCosteira;

	}

	public void setCorpoBombeiros(CorpoBombeiros corpoBombeiros) {
		this.corpoBombeiros = corpoBombeiros;
		
	}

	public void queimadaDetectado() {
		corpoBombeiros.alertaIncendio();
	}

}
