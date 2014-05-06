package Pojo;

public class DiyetListesiBesin {

	private int idDl;
	Hasta h = new Hasta();
	// hasta
	private int ogun;
	Besin b = new Besin();
	// besin
	private int aktiflik;
	private String miktar;

	public int getIdDl() {
		return idDl;
	}

	public void setIdDl(int idDl) {
		this.idDl = idDl;
	}

	public int getOgun() {
		return ogun;
	}

	public void setOgun(int ogun) {
		this.ogun = ogun;
	}

	public int getAktiflik() {
		return aktiflik;
	}

	public void setAktiflik(int aktiflik) {
		this.aktiflik = aktiflik;
	}

	public String getMiktar() {
		return miktar;
	}

	public void setMiktar(String miktar) {
		this.miktar = miktar;
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
