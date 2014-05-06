package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Pojo.Besin;

public class BesinDAO {

	SQLConnect connect = new SQLConnect();
	Statement st = null;
	PreparedStatement ps = null;
	Connection dbConnection = null;

	public BesinDAO() {
		dbConnection = connect.getDBConnection();
	}

	public void ekleBesin(Besin besin) {
		String sorgu = "INSERT INTO Besin (isim,khidrat,protein,yag,kolestrol,sodyum,potasyum,kalsiyum,vita,vitc,demir) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		try {

			ps = dbConnection.prepareStatement(sorgu);

			ps.setString(1, besin.getIsim());
			ps.setInt(2, besin.getKhidrat());
			ps.setInt(3, besin.getProtein());
			ps.setInt(4, besin.getYag());
			ps.setInt(5, besin.getKolestrol());
			ps.setInt(6, besin.getSodyum());
			ps.setInt(7, besin.getPotasyum());
			ps.setInt(8, besin.getKalsiyum());
			ps.setInt(9, besin.getVita());
			ps.setInt(10, besin.getVitc());
			ps.setInt(11, besin.getDemir());

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void silBesin(Besin besin) {
		String sorgu = "DELETE FROM Besin WHERE idBesin = "
				+ besin.getIdBesin();

		try {
			st = connect.baglantiAc();
			st.execute(sorgu);
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Besin getBesinwId(int idBesin) {
		Besin besin = new Besin();
		String sorgu = "SELECT * FROM besin WHERE idBesin=" + idBesin;
		ResultSet besinRs;
		try {
			st = connect.baglantiAc();
			besinRs = st.executeQuery(sorgu);
			besinRs.next();

			besin.setIdBesin(besinRs.getInt("idBesin"));
			besin.setIsim(besinRs.getString("isim"));
			besin.setKhidrat(besinRs.getInt("khidrat"));
			besin.setProtein(besinRs.getInt("protein"));
			besin.setYag(besinRs.getInt("yag"));
			besin.setKolestrol(besinRs.getInt("kolestrol"));
			besin.setSodyum(besinRs.getInt("sodyum"));
			besin.setPotasyum(besinRs.getInt("potasyum"));
			besin.setKalsiyum(besinRs.getInt("kalsiyum"));
			besin.setVita(besinRs.getInt("vita"));
			besin.setVitc(besinRs.getInt("vitc"));
			besin.setDemir(besinRs.getInt("demir"));

			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return besin;
	}

	public Besin getBesinwIsim(String isim) {
		Besin besin = new Besin();
		String sorgu = "SELECT * FROM besin WHERE isim='" + isim + "'";
		ResultSet besinRs;
		try {
			st = connect.baglantiAc();
			besinRs = st.executeQuery(sorgu);
			besinRs.next();

			besin.setIdBesin(besinRs.getInt("idBesin"));
			besin.setIsim(besinRs.getString("isim"));
			besin.setKhidrat(besinRs.getInt("khidrat"));
			besin.setProtein(besinRs.getInt("protein"));
			besin.setYag(besinRs.getInt("yag"));
			besin.setKolestrol(besinRs.getInt("kolestrol"));
			besin.setSodyum(besinRs.getInt("sodyum"));
			besin.setPotasyum(besinRs.getInt("potasyum"));
			besin.setKalsiyum(besinRs.getInt("kalsiyum"));
			besin.setVita(besinRs.getInt("vita"));
			besin.setVitc(besinRs.getInt("vitc"));
			besin.setDemir(besinRs.getInt("demir"));

			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return besin;
	}

	public List<Besin> getAll() {
		List<Besin> liste = new ArrayList();
		String sorgu = "SELECT * FROM Besin";
		ResultSet besinRs;
		try {
			st = connect.baglantiAc();
			besinRs = st.executeQuery(sorgu);

			while (besinRs.next()) {
				Besin besin = new Besin();

				besin.setIdBesin(besinRs.getInt("idBesin"));
				besin.setIsim(besinRs.getString("isim"));
				besin.setKhidrat(besinRs.getInt("khidrat"));
				besin.setProtein(besinRs.getInt("protein"));
				besin.setYag(besinRs.getInt("yag"));
				besin.setKolestrol(besinRs.getInt("kolestrol"));
				besin.setSodyum(besinRs.getInt("sodyum"));
				besin.setPotasyum(besinRs.getInt("potasyum"));
				besin.setKalsiyum(besinRs.getInt("kalsiyum"));
				besin.setVita(besinRs.getInt("vita"));
				besin.setVitc(besinRs.getInt("vitc"));
				besin.setDemir(besinRs.getInt("demir"));

				liste.add(besin);
			}

			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return liste;
	}

}
