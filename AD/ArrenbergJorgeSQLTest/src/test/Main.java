package test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		Properties cfg = new Properties();
		try {
			cfg.load(new FileInputStream("mysqld.cnf"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String server = cfg.getProperty("server");
		String port = cfg.getProperty("port");
		String db = cfg.getProperty("nombrebd");

		String url = String.format("jdbc:mysql://%s:%s/%s", server, port, db);
		String user = cfg.getProperty("user");
		String pswd = cfg.getProperty("password");
		try (Connection con = DriverManager.getConnection(url, user, pswd);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM cliente")) {
			ResultSetMetaData rsmd = rs.getMetaData();

			System.out.println(rsmd.getColumnCount());
			try {
				while (rs.next()) {
					System.out.printf("codigo:%s\t", rs.getString("codigo"));
					System.out.printf("nombre:%s\t", rs.getString("nombre"));
					System.out.printf("email:%s\t", rs.getString("email"));
					System.out.printf("saldo:%s\t", rs.getString("saldo"));
					System.out.printf("fecha_alta:%s\t", rs.getString("fecha_alta"));
					System.out.printf("fecha_creacion:%s\t", rs.getString("fecha_creacion"));
					System.out.printf("fecha_actualizacion:%s\n", rs.getString("fecha_actualizacion"));
				}

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		try (Connection con = DriverManager.getConnection(url, user, pswd); Statement stmt = con.createStatement();) {
			int rs = stmt.executeUpdate("INSERT INTO cliente VALUES (null,'Eliana Villalobos', 'bollito@gmail.com', 0, '2022-10-15', '2025-09-20', '2025-09-26')");
			if(rs>0) {
				System.out.println("Se ha actualizado la BBDD");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}