package com.terremoto.alarme;

public class Alarme {

	private Exercito exercito;
	private GuardaCosteira guardaCosteira;
	private CorpoBombeiros corpoBombeiros;
	private SAMU samu;

	public void tremorDetectado(int magnetude, boolean terrestre) {

		if (terrestre) {

			exercito.suporteTragedia();
		} else {
			guardaCosteira.alertaTsunami();
		}
		
		samu.alertaPossiveisFeridos();
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
		samu.alertaPossiveisFeridos();
		corpoBombeiros.alertaIncendio();
	}

	public void setSamu(SAMU samu) {
		this.samu = samu;
		
	}

}
