package Repository;

public class Bilet {
	private String spectacol;
	private int rand;
	private int numar;

	public void setSpectacol(String spectacol) {
		this.spectacol = spectacol;
	}

	public void setRand(int rand) {
		this.rand = rand;
	}

	public void setNumar(int numar) {
		this.numar = numar;
	}

	public String getSpectacol() {
		return this.spectacol;
	}

	public int getNumar() {
		return this.numar;
	}

	public int getRand() {
		return this.rand;
	}

	public String toString() {
		return ("Spectacol:" + this.spectacol + "; Rand: " + this.rand + "; Numar: " + this.numar);
	}
}
