package Pojo;

public class GirilenBesin {

	private int idGb;
	Hasta h = new Hasta();
	private int ogun;
	Besin b = new Besin();
	private String tarih;

	public int getIdGb() {
		return idGb;
	}

	public void setIdGb(int idGb) {
		this.idGb = idGb;
	}

	public int getOgun() {
		return ogun;
	}

	public void setOgun(int ogun) {
		this.ogun = ogun;
	}

	public String getTarih() {
		return tarih;
	}

	public void setTarih(String tarih) {
		this.tarih = tarih;
	}

	public Hasta getH() {
		return h;
	}

	public void setH(Hasta h) {
		this.h = h;
	}

	public Besin getB() {
		return b;
	}

	public void setB(Besin b) {
		this.b = b;
	}

}
