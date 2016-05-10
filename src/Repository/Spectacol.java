package Repository;

public class Spectacol {
	private String titlu;
	private String regia;
	private String distributia;
	private String data;
	private int nrbilete;

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public void setRegia(String regia) {
		this.regia = regia;
	}

	public void setDistributia(String distributia) {
		this.distributia = distributia;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setBilet(int nrbilete) {
		this.nrbilete = nrbilete;
	}

	public String getTitlu() {
		return this.titlu;
	}

	public String getRegia() {
		return this.regia;

	}

	public String getDistributia() {
		return this.distributia;

	}

	public String getData() {
		return this.data;
	}

	public int getNrbilete() {
		return this.nrbilete;
	}

	public int setNrbilete(int nr) {
		return this.nrbilete = this.nrbilete - nr;
	}

	public String toString() {
		return ("Titlu:" + this.titlu + "; Regia: " + this.regia + "; Distributia: " + this.distributia + "; Data:"
				+ this.data + "; Nrbilete: " + this.nrbilete);
	}
}
