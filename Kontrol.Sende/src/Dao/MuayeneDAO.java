package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Pojo.Muayene;

public class MuayeneDAO {

	SQLConnect connect = new SQLConnect();
	Connection dbConnection = connect.getDBConnection();
	PreparedStatement ps = null;
	Statement st = null;
	HastaDAO hdao = new HastaDAO();

	public void ekleMuayene(Muayene muayene) {

		String sorgu = "INSERT INTO muayene "
				+ "(kilo, tsh, tiroit, kansekeri, insulin, ogtt, totalkolestrol, "
				+ "trigliserid, ldl, hdl, urikasit, sgot, sgpt, ggt, alkalenfosfataz, "
				+ "kortizol, acth, ferritin, fsh, lh, testosteron, prolaktin, homosistein, crp, intolerans, Hasta_idHasta, tarih) "
				+ "VALUES"
				+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			ps = dbConnection.prepareStatement(sorgu);

			ps.setInt(1, muayene.getKilo());
			ps.setDouble(2, muayene.getTsh());
			ps.setDouble(3, muayene.getTiroit());
			ps.setDouble(4, muayene.getKansekeri());
			ps.setDouble(5, muayene.getInsulin());
			ps.setDouble(6, muayene.getOgtt());
			ps.setDouble(7, muayene.getTotalkolestrol());
			ps.setDouble(8, muayene.getTrigliserid());
			ps.setDouble(9, muayene.getLdl());
			ps.setDouble(10, muayene.getHdl());
			ps.setDouble(11, muayene.getUrikasit());
			ps.setDouble(12, muayene.getSgot());
			ps.setDouble(13, muayene.getSgpt());
			ps.setDouble(14, muayene.getGgt());
			ps.setDouble(15, muayene.getAlkalenfosfataz());
			ps.setDouble(16, muayene.getKortizol());
			ps.setDouble(17, muayene.getActh());
			ps.setDouble(18, muayene.getFerritin());
			ps.setDouble(19, muayene.getFsh());
			ps.setDouble(20, muayene.getLh());
			ps.setDouble(21, muayene.getTestosteron());
			ps.setDouble(22, muayene.getProlaktin());
			ps.setDouble(23, muayene.getHomosistein());
			ps.setDouble(24, muayene.getCrp());
			ps.setDouble(25, muayene.getIntolerans());
			ps.setInt(26, muayene.getH().getIdHasta());
			ps.setString(27, muayene.getTarih());

			ps.executeUpdate();

			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void guncelleMuayene(Muayene muayene) {

		String sorgu = "UPDATE Muayene SET kilo=?, tsh=?, tiroit=?, kansekeri=?, insulin=?, ogtt=?, totalkolestrol=?, "
				+ "trigliserid=?, ldl=?, hdl=?, urikasit=?, sgot=?, sgpt=?, ggt=?, alkalenfosfataz=?, "
				+ "kortizol=?, acth=?, ferritin=?, fsh=?, lh=?, testosteron=?, prolaktin=?, homosistein=?, "
				+ "crp=?, intolerans=?, Hasta_idHasta=?, tarih=? WHERE idMuayene = ?";

		try {
			ps = dbConnection.prepareStatement(sorgu);

			ps.setInt(1, muayene.getKilo());
			ps.setDouble(2, muayene.getTsh());
			ps.setDouble(3, muayene.getTiroit());
			ps.setDouble(4, muayene.getKansekeri());
			ps.setDouble(5, muayene.getInsulin());
			ps.setDouble(6, muayene.getOgtt());
			ps.setDouble(7, muayene.getTotalkolestrol());
			ps.setDouble(8, muayene.getTrigliserid());
			ps.setDouble(9, muayene.getLdl());
			ps.setDouble(10, muayene.getHdl());
			ps.setDouble(11, muayene.getUrikasit());
			ps.setDouble(12, muayene.getSgot());
			ps.setDouble(13, muayene.getSgpt());
			ps.setDouble(14, muayene.getGgt());
			ps.setDouble(15, muayene.getAlkalenfosfataz());
			ps.setDouble(16, muayene.getKortizol());
			ps.setDouble(17, muayene.getActh());
			ps.setDouble(18, muayene.getFerritin());
			ps.setDouble(19, muayene.getFsh());
			ps.setDouble(20, muayene.getLh());
			ps.setDouble(21, muayene.getTestosteron());
			ps.setDouble(22, muayene.getProlaktin());
			ps.setDouble(23, muayene.getHomosistein());
			ps.setDouble(24, muayene.getCrp());
			ps.setDouble(25, muayene.getIntolerans());
			ps.setInt(26, muayene.getH().getIdHasta());
			ps.setString(27, muayene.getTarih());
			ps.setInt(28, muayene.getIdMuayene());

			ps.executeUpdate();

			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void silMuayene(int idMuayene) {

		String sorgu = "DELETE FROM Muayene WHERE idMuayene = " + idMuayene;

		try {
			st = connect.baglantiAc();

			st.execute(sorgu);

			st.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Muayene getMuayene(int idMuayene) {
		Muayene muayene = new Muayene();
		String sorgu = "SELECT * FROM Muayene WHERE idMuayene=" + idMuayene;
		ResultSet rs;
		try {
			st = connect.baglantiAc();
			rs = st.executeQuery(sorgu);

			rs.next();

			muayene.setIdMuayene(rs.getInt("idMuayene"));
			muayene.setKilo(rs.getInt("kilo"));
			muayene.setTsh(rs.getDouble("tsh"));
			muayene.setTiroit(rs.getDouble("tiroit"));
			muayene.setKansekeri(rs.getDouble("kansekeri"));
			muayene.setInsulin(rs.getDouble("insulin"));
			muayene.setOgtt(rs.getDouble("ogtt"));
			muayene.setTotalkolestrol(rs.getDouble("totalkolestrol"));
			muayene.setTrigliserid(rs.getDouble("trigliserid"));
			muayene.setLdl(rs.getDouble("ldl"));
			muayene.setHdl(rs.getDouble("hdl"));
			muayene.setUrikasit(rs.getDouble("urikasit"));
			muayene.setSgot(rs.getDouble("sgot"));
			muayene.setSgpt(rs.getDouble("sgpt"));
			muayene.setGgt(rs.getDouble("ggt"));
			muayene.setAlkalenfosfataz(rs.getDouble("alkalenfosfataz"));
			muayene.setKortizol(rs.getDouble("kortizol"));
			muayene.setActh(rs.getDouble("acth"));
			muayene.setFerritin(rs.getDouble("ferritin"));
			muayene.setFsh(rs.getDouble("fsh"));
			muayene.setLh(rs.getDouble("lh"));
			muayene.setTestosteron(rs.getDouble("testosteron"));
			muayene.setProlaktin(rs.getDouble("prolaktin"));
			muayene.setHomosistein(rs.getDouble("homosistein"));
			muayene.setCrp(rs.getDouble("intolerans"));
			muayene.setIntolerans(rs.getDouble("intolerans"));
			muayene.setH(hdao.getHasta(rs.getInt("Hasta_idHasta")));
			muayene.setTarih(rs.getString("tarih"));

			st.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return muayene;
	}

	public List<Muayene> getAll() {
		List<Muayene> list = new ArrayList();
		String sorgu = "SELECT * FROM Muayene ORDER BY tarih";
		ResultSet rs;
		try {
			st = connect.baglantiAc();
			rs = st.executeQuery(sorgu);

			while (rs.next()) {

				Muayene muayene = new Muayene();

				muayene.setIdMuayene(rs.getInt("idMuayene"));
				muayene.setKilo(rs.getInt("kilo"));
				muayene.setTsh(rs.getDouble("tsh"));
				muayene.setTiroit(rs.getDouble("tiroit"));
				muayene.setKansekeri(rs.getDouble("kansekeri"));
				muayene.setInsulin(rs.getDouble("insulin"));
				muayene.setOgtt(rs.getDouble("ogtt"));
				muayene.setTotalkolestrol(rs.getDouble("totalkolestrol"));
				muayene.setTrigliserid(rs.getDouble("trigliserid"));
				muayene.setLdl(rs.getDouble("ldl"));
				muayene.setHdl(rs.getDouble("hdl"));
				muayene.setUrikasit(rs.getDouble("urikasit"));
				muayene.setSgot(rs.getDouble("sgot"));
				muayene.setSgpt(rs.getDouble("sgpt"));
				muayene.setGgt(rs.getDouble("ggt"));
				muayene.setAlkalenfosfataz(rs.getDouble("alkalenfosfataz"));
				muayene.setKortizol(rs.getDouble("kortizol"));
				muayene.setActh(rs.getDouble("acth"));
				muayene.setFerritin(rs.getDouble("ferritin"));
				muayene.setFsh(rs.getDouble("fsh"));
				muayene.setLh(rs.getDouble("lh"));
				muayene.setTestosteron(rs.getDouble("testosteron"));
				muayene.setProlaktin(rs.getDouble("prolaktin"));
				muayene.setHomosistein(rs.getDouble("homosistein"));
				muayene.setCrp(rs.getDouble("intolerans"));
				muayene.setIntolerans(rs.getDouble("intolerans"));
				muayene.setH(hdao.getHasta(rs.getInt("Hasta_idHasta")));
				muayene.setTarih(rs.getString("tarih"));

				list.add(muayene);
			}

			st.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public List<Muayene> getHastaAll(Muayene m) {
		List<Muayene> list = new ArrayList();
		String sorgu = "SELECT * FROM Muayene ORDER BY tarih WHERE Hasta_idHasta="
				+ m.getH().getIdHasta();
		ResultSet rs;
		try {
			st = connect.baglantiAc();
			rs = st.executeQuery(sorgu);

			while (rs.next()) {

				Muayene muayene = new Muayene();

				muayene.setIdMuayene(rs.getInt("idMuayene"));
				muayene.setKilo(rs.getInt("kilo"));
				muayene.setTsh(rs.getDouble("tsh"));
				muayene.setTiroit(rs.getDouble("tiroit"));
				muayene.setKansekeri(rs.getDouble("kansekeri"));
				muayene.setInsulin(rs.getDouble("insulin"));
				muayene.setOgtt(rs.getDouble("ogtt"));
				muayene.setTotalkolestrol(rs.getDouble("totalkolestrol"));
				muayene.setTrigliserid(rs.getDouble("trigliserid"));
				muayene.setLdl(rs.getDouble("ldl"));
				muayene.setHdl(rs.getDouble("hdl"));
				muayene.setUrikasit(rs.getDouble("urikasit"));
				muayene.setSgot(rs.getDouble("sgot"));
				muayene.setSgpt(rs.getDouble("sgpt"));
				muayene.setGgt(rs.getDouble("ggt"));
				muayene.setAlkalenfosfataz(rs.getDouble("alkalenfosfataz"));
				muayene.setKortizol(rs.getDouble("kortizol"));
				muayene.setActh(rs.getDouble("acth"));
				muayene.setFerritin(rs.getDouble("ferritin"));
				muayene.setFsh(rs.getDouble("fsh"));
				muayene.setLh(rs.getDouble("lh"));
				muayene.setTestosteron(rs.getDouble("testosteron"));
				muayene.setProlaktin(rs.getDouble("prolaktin"));
				muayene.setHomosistein(rs.getDouble("homosistein"));
				muayene.setCrp(rs.getDouble("intolerans"));
				muayene.setIntolerans(rs.getDouble("intolerans"));
				muayene.setH(hdao.getHasta(rs.getInt("Hasta_idHasta")));
				muayene.setTarih(rs.getString("tarih"));

				list.add(muayene);
			}

			st.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}
