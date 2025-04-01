package programa8;

import java.util.Random;

public class Anemometre {
	int ventActual;
	String direccioVentActual;
	int[] ventDia = new int[24];
	String[] direccioVentDia = new String[24];

	// CONSTRUCTOR
	/*
	 * Anemometre (int pVent, int [] pVentDia, String pDireccio, String []
	 * pDireccioDia){
	 * this.ventActual=pVent;
	 * this.ventDia=pVentDia;
	 * this.direccioVentActual=pDireccio;
	 * this.direccioVentDia=pDireccioDia;
	 * }
	 */
	public int getVentActual() {
		Random r = new Random();
		return r.nextInt(100);
	}

	public String getDireccioVentActual() {
		String[] auxDireccions = { "N", "NE", "E", "SE", "S", "SO", "O", "NO" };
		Random r = new Random();
		int random = r.nextInt(8);
		return auxDireccions[random];
	}

	public int[] getVentDia() {
		Random r = new Random();
		for (int i = 0; i < 24; i++) {
			int random = r.nextInt(100);
			this.ventDia[i] = random;
		}
		return this.ventDia;
	}

	public String[] getDireccioVentDia() {
		String[] auxDireccions = { "N", "NE", "E", "SE", "S", "SO", "O", "NO" };
		Random r = new Random();
		for (int i = 0; i < 24; i++) {
			int random = r.nextInt(8);
			this.direccioVentDia[i] = auxDireccions[random];
		}
		return this.direccioVentDia;
	}

}
