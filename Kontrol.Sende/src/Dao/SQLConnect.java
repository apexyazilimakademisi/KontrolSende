package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnect {

	private Connection baglayici = null;
	private static String url = "jdbc:mysql://localhost:3306/mydb";
	private static String driver = "com.mysql.jdbc.Driver";
	private static String userName = "root";
	private static String password = "furkan11";

	public Statement baglantiAc() throws Exception {
		Class.forName(driver).newInstance();
		baglayici = DriverManager.getConnection(url, userName, password);
		return baglayici.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
	}

	public Statement baglantiAcPs(String sorgu) throws Exception {
		Class.forName(driver).newInstance();
		baglayici = DriverManager.getConnection(url, userName, password);
		return baglayici.prepareStatement(sorgu);
	}

	public Connection getDBConnection() {

		Connection dbConnection = null;

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			dbConnection = DriverManager.getConnection(url, userName, password);
			return dbConnection;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return dbConnection;

	}

}
