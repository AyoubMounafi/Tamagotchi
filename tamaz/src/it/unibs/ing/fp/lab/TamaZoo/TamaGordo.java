package it.unibs.ing.fp.lab.TamaZoo;

public class TamaGordo extends Tamagotchi

{
	private final int AMPLIFICAZIONE_CAREZZE = 2;

	public TamaGordo(String nome, int sazieta) {
		super(nome, MAX_AFFETTO, sazieta);
		super.nomeTipo = "gordo";
	}

	public void riceviCarezze(int numCarezze) {
		setGradoSazieta(Math.max(0, getGradoSazieta() - (AMPLIFICAZIONE_CAREZZE * numCarezze / FATTORE_CAREZZE)));
	}

	public void riceviBiscotti(int numBiscotti) {
		for (int i = 1; i <= numBiscotti; i++) {
			setGradoSazieta(Math.min(getGradoSazieta() * INCREMENTO_BISCOTTO, MAX_SAZIETA));
		}

	}

	public boolean sonoMorto() {
		return getGradoSazieta() == 0;
	}

	public boolean sonoTriste() {
		return getGradoSazieta() < SOGLIA_SAZIETA_BASSA;
	}
}
