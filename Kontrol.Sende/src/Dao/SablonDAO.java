package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Pojo.Sablon;

public class SablonDAO {
	SQLConnect connect = new SQLConnect();
	Statement st;
	PreparedStatement ps = null;
	Connection dbConnection = null;
	BesinDAO bdao = new BesinDAO();

	public SablonDAO() {
		dbConnection = connect.getDBConnection();
	}

	public void ekleSablon(Sablon sablon) {
		String sorgu = "INSERT INTO Sablon (ogun, idBesin, isim) VALUES (?,?,?)";
		try {

			ps = dbConnection.prepareStatement(sorgu);

			ps.setInt(1, sablon.getOgun());
			ps.setInt(2, sablon.getB().getIdBesin());
			ps.setString(3, sablon.getIsim());

			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void silSablon(String isim) {
		String sorgu = "DELETE FROM Sablon WHERE isim='" + isim + "'";

		try {
			st = connect.baglantiAc();
			st.execute(sorgu);
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void guncelleSablonBesin(Sablon sablon, int idSablon) {
		// Sablondaki besini deðiþtirir
		String sorgu = "UPDATE FROM Sablon SET ogun=?, idBesin=? WHERE idSablon="
				+ idSablon;
		try {
			ps = dbConnection.prepareStatement(sorgu);
			ps.setInt(1, sablon.getOgun());
			ps.setInt(2, sablon.getB().getIdBesin());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void guncelleIsim(String isim, int idSablon) {
		// Sablonun ismini deðiþtirir.
		String sorgu = "UPDATE FROM Sablon SET isim=? WHERE idSablon="
				+ idSablon;
		try {
			ps = dbConnection.prepareStatement(sorgu);
			ps.setString(1, isim);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<String> getSablonIsim() {
		List<String> liste = new ArrayList();
		String sorgu = "SELECT isim FROM Sablon";
		ResultSet isimRs;
		try {
			st = connect.baglantiAc();
			isimRs = st.executeQuery(sorgu);
			while (isimRs.next()) {
				liste.add(isimRs.getString("isim"));
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return liste;
	}

	public List<Sablon> getSablon(String isim) {
		// Þablonu getirir.
		List<Sablon> liste = new ArrayList();
		String sorgu = "SELECT * FROM Sablon WHERE isim='" + isim + "'";
		ResultSet sablonRs;
		try {
			st = connect.baglantiAc();
			sablonRs = st.executeQuery(sorgu);
			while (sablonRs.next()) {
				Sablon s = new Sablon();

				s.setB(bdao.getBesinwId(sablonRs.getInt("idBesin")));
				s.setIsim(sablonRs.getString("isim"));
				s.setOgun(sablonRs.getInt("ogun"));

				liste.add(s);
			}

			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return liste;
	}
}
