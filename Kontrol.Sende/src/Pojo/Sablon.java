package Pojo;

public class Sablon {

	private int idSablon;
	private int ogun;
	Besin b = new Besin();
	private String isim;

	public int getIdSablon() {
		return idSablon;
	}

	public void setIdSablon(int idSablon) {
		this.idSablon = idSablon;
	}

	public int getOgun() {
		return ogun;
	}

	public void setOgun(int ogun) {
		this.ogun = ogun;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Besin getB() {
		return b;
	}

	public void setB(Besin b) {
		this.b = b;
	}

}
