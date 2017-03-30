package it.polito.tdp.lab04.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	static private final String jdbcUrl = "jdbc:mysql://localhost/iscritticorsi?user=root";
	static private Connection connection = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		try {
			if (connection == null) {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(jdbcUrl);
				//connection =DriverManager.getConnection(jdbcUrl, "root", "");
			}
			return connection;

		} catch (SQLException e) {

			//e.printStackTrace();
			e.getMessage();
			throw new RuntimeException("Cannot get a connection " + jdbcUrl, e);
		}
	}

}
