package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Pojo.Besin;
import Pojo.DiyetListesiBesin;
import Pojo.GirilenBesin;
import Pojo.Hasta;

public class DiyetDAO {

	SQLConnect connect = new SQLConnect();
	Statement st;
	PreparedStatement ps = null;
	Connection dbConnection = null;
	BesinDAO bdao = new BesinDAO();
	HastaDAO hdao = new HastaDAO();
	Besin b;
	Hasta h;

	public DiyetDAO() {
		dbConnection = connect.getDBConnection();
	}

	// Diyet Besini doktor tarafýndan verilen besinler
	// Girilen Besin kullanýcý tarafýndan girilen besinler

	/*
	 * public void aktiflikDegistir(int idHasta) { String sorgu =
	 * "SELECT * FROM dl WHERE idHasta=" + idHasta; String sorgu2 =
	 * "UPDATE dl SET aktiflik=?";
	 * 
	 * ResultSet oncekiListe; try { st = connect.baglantiAc(); // Kullanýcýya
	 * önceden diyet listesi hazýrlanmýþ mý kontrol ediyor. oncekiListe =
	 * st.executeQuery(sorgu); if (oncekiListe.wasNull() == false) { while
	 * (oncekiListe.next()) { // Aktiflik durumlarýný 0 yapýyor. ps =
	 * dbConnection.prepareStatement(sorgu2); ps.setInt(1, 0);
	 * ps.executeUpdate(); ps.close(); } }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } }
	 */

	public void ekleBesin(DiyetListesiBesin dl) {
		// Tek besin giriþi DOKTOR TARAFINDAN
		String sorgu = "INSERT INTO dl (Hasta_idHasta, ogun, Besin_idBesin, aktiflik) VALUES (?,?,?,?)";

		try {
			// Besini öðüne ekliyor ve aktifliðini 1 yapýyor
			ps = dbConnection.prepareStatement(sorgu);

			ps.setInt(1, dl.getH().getIdHasta());
			ps.setInt(2, dl.getOgun());
			ps.setInt(3, dl.getB().getIdBesin());
			ps.setInt(4, 1);

			ps.executeUpdate();

			ps.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<DiyetListesiBesin> getHastaDL(int idHasta) {
		// Hastanýn diyet listesinin tümü

		List<DiyetListesiBesin> liste = new ArrayList();
		String sorgu = "SELECT Besin_idBesin, Hasta_idHasta, ogun, idDl FROM dl WHERE Hasta_idHasta="
				+ idHasta + " AND aktiflik=1";
		ResultSet dlRs;
		ResultSet besinRs;
		try {
			st = connect.baglantiAc();
			dlRs = st.executeQuery(sorgu);

			while (dlRs.next()) {
				b = bdao.getBesinwId(dlRs.getInt("Besin_idBesin"));
				if (h == null) {

					h = hdao.getHasta(dlRs.getInt("Hasta_idHasta"));

					System.out.println("besin_idbesin" + b.getIdBesin());
					System.out.println("hasta_idhasta" + h.getIdHasta());
				}
				DiyetListesiBesin db = new DiyetListesiBesin();

				db.setB(b);
				db.setH(h);
				db.setOgun(dlRs.getInt("ogun"));
				db.setIdDl(dlRs.getInt("idDl"));

				liste.add(db);
				System.out.println("girdi");
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return liste;
	}

	public List<GirilenBesin> hastaTuketilenwTarih(String basTarih,
			String bitTarih, Hasta hasta) {
		// Hastanýn seçilen tarih aralýðýnda tükettiði besinler
		List<GirilenBesin> liste = new ArrayList();
		String sorgu = "SELECT * FROM GListe WHERE tarih>" + basTarih
				+ " AND bitTarih<" + bitTarih + " AND idHasta="
				+ hasta.getIdHasta();
		// TEKRAR DÜZENLE
		ResultSet GbRs;

		try {
			st = connect.baglantiAc();
			GbRs = st.executeQuery(sorgu);
			b = bdao.getBesinwId(GbRs.getInt("Besin_idBesin"));
			h = hdao.getHasta(GbRs.getInt("Hasta_idHasta"));
			while (GbRs.next()) {
				GirilenBesin gb = new GirilenBesin();

				gb.setIdGb(GbRs.getInt("idGb"));
				gb.setB(b);
				gb.setH(h);
				gb.setOgun(GbRs.getInt("ogun"));
				gb.setTarih(GbRs.getString("tarih"));

				liste.add(gb);
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return liste;
	}

	public void diyetListesiTablo(JTable jTable1, String[] kolon,
			List<DiyetListesiBesin> list) throws Exception {

		try {
			// ****************
			// Model olusturulumu
			jTable1.setModel(new javax.swing.table.DefaultTableModel(
					new Object[][] {}, new String[] {}));
			// *******************

			DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
			model.setColumnIdentifiers(kolon);

			DiyetListesiBesin[] b = new DiyetListesiBesin[list.size()];
			System.out.println(b.length);
			int size = 0;
			while (size < b.length) {
				Object[] o = new Object[kolon.length];

				o[0] = list.get(size).getIdDl();
				o[1] = list.get(size).getB().getIsim();

				model.addRow(o);
				size++;
			}

			jTable1.setModel(model);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
