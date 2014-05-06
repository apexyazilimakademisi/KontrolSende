package Pojo;

public class Mesaj {

	private int idMesaj;
	Hasta h = new Hasta();
	private String aciklama;
	private int gonderen;
	private String tarih;
	private int okundu;

	public int getIdMesaj() {
		return idMesaj;
	}

	public void setIdMesaj(int idMesaj) {
		this.idMesaj = idMesaj;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public int getGonderen() {
		return gonderen;
	}

	public void setGonderen(int gonderen) {
		this.gonderen = gonderen;
	}

	public String getTarih() {
		return tarih;
	}

	public void setTarih(String tarih) {
		this.tarih = tarih;
	}

	public int getOkundu() {
		return okundu;
	}

	public void setOkundu(int okundu) {
		this.okundu = okundu;
	}

	public Hasta getH() {
		return h;
	}

	public void setH(Hasta h) {
		this.h = h;
	}

}
