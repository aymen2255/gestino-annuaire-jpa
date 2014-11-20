package fr.treeptik.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionUtils {
	private static Connection connection;

	public static Connection getConnection() throws ClassNotFoundException,
			SQLException {
		if (connection == null || connection.isClosed()) {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/gestion_annuaire";
			connection = DriverManager.getConnection(url, "root", "root");
			connection.setAutoCommit(false);
		}
		return connection;
	}

	public static void commitTX(){
		try {
			getConnection().commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
