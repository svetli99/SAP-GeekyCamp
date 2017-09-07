package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class MYSQLService {

	private static String url = "jdbc:mysql://localhost/SAP";

	public static void selectBy(String table, String id, String number) {
		Properties props = new Properties();
		props.setProperty("user", "root");
		Connection conn = null;
		PreparedStatement prepareStatement = null;
		try {
			conn = DriverManager.getConnection(url, props);
			String sql = "SELECT * FROM " + table + " WHERE " + id + " = ? ";
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, number);
			ResultSet rs = prepareStatement.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			int columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					System.out.print(rs.getString(i) + "|");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("invalid input");
		} finally {

			if (conn != null) {

				try {
					prepareStatement.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void selectAll(String table) {
		Properties props = new Properties();
		props.setProperty("user", "root");
		Connection conn = null;
		PreparedStatement prepareStatement = null;
		try {

			conn = DriverManager.getConnection(url, props);
			String sql = "SELECT * FROM " + table + "";
			prepareStatement = conn.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			int columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					System.out.print(rs.getString(i) + "|");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("invalid input");
		} finally {
			if (conn != null) {
				try {
					prepareStatement.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void delete(String table, String id, String number) {
		Properties props = new Properties();
		props.setProperty("user", "root");
		Connection conn = null;
		PreparedStatement prepareStatement = null;
		try {
			conn = DriverManager.getConnection(url, props);
			String sql = "DELETE FROM " + table + " WHERE " + id + " = ? ";
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, number);
			prepareStatement.executeUpdate();
			System.out.println("deleted");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("invalid input");
		} finally {
			if (conn != null) {

				try {
					prepareStatement.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public static void createStudent(String firstName,String lastName,String number){
		Properties props = new Properties();
		props.setProperty("user", "root");
		Connection conn=null;
		PreparedStatement prepareStatement=null;
		try{
			
			conn = DriverManager.getConnection(url, props);
			String sql = " INSERT INTO STUDENT VALUES("+number+",'"+firstName+"','"+lastName+"') ";
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.executeUpdate();
			System.out.println("created");
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("invalid input");
		} finally {
			if (conn != null) {

				try {
					prepareStatement.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public static void createDepartment(String name,String room,String phone){
		Properties props = new Properties();
		props.setProperty("user", "root");
		Connection conn=null;
		PreparedStatement prepareStatement=null;
		try{
			
			conn = DriverManager.getConnection(url, props);
			String sql = " INSERT INTO DEPARTMENTS VALUES(NOT NULL,"+name+",'"+room+"','"+phone+"') ";
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.executeUpdate();
			System.out.println("created");
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("invalid input");
		} finally {
			if (conn != null) {

				try {
					prepareStatement.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public static void createCourse(String name,String room,String credit){
		Properties props = new Properties();
		props.setProperty("user", "root");
		Connection conn=null;
		PreparedStatement prepareStatement=null;
		try{
			
			conn = DriverManager.getConnection(url, props);
			String sql = " INSERT INTO COURSES VALUES(NOT NULL,"+name+",'"+room+"','"+credit+"') ";
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.executeUpdate();
			System.out.println("created");
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("invalid input");
		} finally {
			if (conn != null) {

				try {
					prepareStatement.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
