package programa8;

import java.util.Random;

public class Pluviometre {
	int plujaDarreraHora;
	int[] plujaDia = new int[24];

	/*
	 * //CONSTRUCTOR
	 * Pluviometre(int pPluja, int [] pDia){
	 * this.plujaDarreraHora=pPluja;
	 * this.plujaDia=pDia;
	 * }
	 */

	public int getPlujaDarreraHora() {
		Random r = new Random();
		return r.nextInt(20);
	}

	public int[] getPlujaDia() {
		Random r = new Random();
		for (int i = 0; i < 24; i++) {
			int random = r.nextInt(20);
			this.plujaDia[i] = random;
		}
		return this.plujaDia;
	}

}
