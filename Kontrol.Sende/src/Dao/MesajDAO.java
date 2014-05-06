package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import Pojo.Mesaj;

public class MesajDAO {

	SQLConnect connect = new SQLConnect();
	Statement st;
	PreparedStatement ps = null;
	Connection dbConnection = null;

	public MesajDAO() {
		dbConnection = connect.getDBConnection();
	}

	public void mesajGonder(Mesaj mesaj, int gonderen) {
		String sorgu = "INSERT INTO Mesaj (idHasta, aciklama, gonderen, tarih, okundu) VALUES (?,?,?,?,?)";

		try {
			ps = dbConnection.prepareStatement(sorgu);

			ps.setInt(1, mesaj.getH().getIdHasta());
			ps.setString(2, mesaj.getAciklama());
			ps.setInt(3, gonderen);
			ps.setString(4, mesaj.getTarih());
			ps.setInt(5, 0);

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void okunduIsaretle(Mesaj mesaj) {
		String sorgu = "UPDATE FROM Mesaj SET okundu=?";

		try {
			ps = dbConnection.prepareStatement(sorgu);
			ps.setInt(1, 1);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
