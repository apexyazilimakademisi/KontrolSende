package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Pojo.Hasta;

public class HastaDAO {

	SQLConnect connect = new SQLConnect();
	Statement st;
	PreparedStatement ps = null;
	Connection dbConnection = null;

	public HastaDAO() {
		dbConnection = connect.getDBConnection();
	}

	public int sonEklenen() throws Exception {
		String sorgu = "SELECT * FROM hasta ORDER BY idHasta DESC";
		ResultSet hastaRs;
		st = connect.baglantiAc();

		hastaRs = st.executeQuery(sorgu);
		hastaRs.next();

		return hastaRs.getInt("idHasta");
	}

	public Hasta getHasta(int idHasta) throws Exception {

		Hasta hasta = new Hasta();
		String sorgu = "SELECT * FROM Hasta WHERE idHasta=" + idHasta;
		ResultSet hastaRs;
		st = connect.baglantiAc();

		try {

			hastaRs = st.executeQuery(sorgu);
			hastaRs.next();

			hasta.setIdHasta(hastaRs.getInt("idHasta"));
			hasta.setAd(hastaRs.getString("ad"));
			hasta.setSoyad(hastaRs.getString("soyad"));
			hasta.setD_tarihi(hastaRs.getString("d_tarihi"));
			hasta.setCinsiyet(hastaRs.getString("cinsiyet"));
			hasta.setBoy(hastaRs.getString("boy"));
			hasta.setKronik(hastaRs.getString("kronik"));
			hasta.setTc(hastaRs.getString("tc"));
			hasta.setTelefon(hastaRs.getString("telefon"));
			hasta.setAdres(hastaRs.getString("adres"));
			hasta.setEmail(hastaRs.getString("email"));
			hasta.setK_adi(hastaRs.getString("k_adi"));
			hasta.setK_sifre(hastaRs.getString("k_sifre"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		st.close();
		return hasta;
	}

	public void silHasta(Hasta hasta) throws Exception {

		String sorgu = "DELETE FROM Hasta WHERE idHasta=" + hasta.getIdHasta();

		st = connect.baglantiAc();

		try {
			st.execute(sorgu);

		} catch (Exception e) {
			e.printStackTrace();
		}
		st.close();

	}

	public void ekleHasta(Hasta hasta) {
		String sorgu = "INSERT INTO hasta (ad,soyad,d_tarihi,cinsiyet,boy,kronik,tc,telefon,adres,email,k_adi,k_sifre) "
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
		try {

			st = connect.baglantiAc();

			ps = dbConnection.prepareStatement(sorgu);

			ps.setString(1, hasta.getAd());
			ps.setString(2, hasta.getSoyad());
			ps.setString(3, hasta.getD_tarihi());
			ps.setString(4, hasta.getCinsiyet());
			ps.setString(5, hasta.getBoy());
			ps.setString(6, hasta.getKronik());
			ps.setString(7, hasta.getTc());
			ps.setString(8, hasta.getTelefon());
			ps.setString(9, hasta.getAdres());
			ps.setString(10, hasta.getEmail());
			ps.setString(11, hasta.getK_adi());
			ps.setString(12, hasta.getK_sifre());

			ps.executeUpdate();

			st.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void guncelleHasta(Hasta hasta, int idHasta) {
		String sorgu = "UPDATE Hasta SET ad=?, soyad=?, d_tarihi=?, cinsiyet=?, boy=?, kronik=?, tc=?, telefon=?, adres=?, email=?, k_adi=?, k_sifre=?"
				+ " WHERE idHasta=" + idHasta;
		// Hastanýn kiþisel bilgileri güncelleniyor.
		try {
			ps = dbConnection.prepareStatement(sorgu);

			ps.setString(1, hasta.getAd());
			ps.setString(2, hasta.getSoyad());
			ps.setString(3, hasta.getD_tarihi());
			ps.setString(4, hasta.getCinsiyet());
			ps.setString(5, hasta.getBoy());
			ps.setString(6, hasta.getKronik());
			ps.setString(7, hasta.getTc());
			ps.setString(8, hasta.getTelefon());
			ps.setString(9, hasta.getAdres());
			ps.setString(10, hasta.getEmail());
			ps.setString(11, hasta.getK_adi());
			ps.setString(12, hasta.getK_sifre());

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * public List<Hasta> getAll() { xltTableModel( new Object[][] {}, new
	 * String[] {})); // *******************
	 * 
	 * DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
	 * model.setColumnIdentifiers(kolon);
	 * 
	 * Hasta[] b = new Hasta[list.size()]; System.out.println(b.length); int
	 * size = 0; while (size < b.length) { Object[] o = new
	 * Object[kolon.length];
	 * 
	 * o[0] = list.get(size).getIdHasta(); o[1] = list.get(size).getAd(); o[2] =
	 * list.get(size).getSoyad(); o[3] = list.get(size).getD_tarihi(); o[4] =
	 * list.get(size).getCinsiyet(); o[5] = list.get(size).getBoy(); o[6] =
	 * list.get(size).getTc(); o[7] = list.get(size).getTelefon(); o[8] =
	 * list.get(size).getAdres(); o[9] = list.get(size).getEmail();
	 * 
	 * model.addRow(o); size++; }
	 * 
	 * jTable1.setModel(model);
	 * 
	 * } catch (Exception ex) { ex.printStackTrace(); } }
	 */

}
