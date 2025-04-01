package programa8;

import java.util.Random;

public class Termometre {
	private int temperatura;
	private int[] temperaturaDia = new int[24];

	// CONSTRUCTOR
	/*
	 * Termometre(int pTemp, int [] pDia){
	 * this.temperatura=pTemp;
	 * this.temperaturaDia=pDia;
	 * }
	 */
	public int getTemperaturaActual() {
		Random r = new Random();
		return r.nextInt(40);
	}

	public int[] getTemperaturaDia() {
		Random r = new Random();
		for (int i = 0; i < 24; i++) {
			int random = r.nextInt(40);
			this.temperaturaDia[i] = random;
		}
		return this.temperaturaDia;
	}

}
