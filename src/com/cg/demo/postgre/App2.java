package com.cg.demo.postgre;

import java.sql.*;

public class App2 {

	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		Connection c = null;
		Statement stmt = null;
	
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dvdrental", "postgres", "Kasar@1998");
			
		
		stmt = c.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
		while (rs.next()) {
			int eid = rs.getInt("eid");
			String ename = rs.getString("ename");
			float salary = rs.getFloat("salary");
			System.out.println("EID = " + eid);
			System.out.println("ENAME = " + ename);
			System.out.println("SALARY = " + salary);
		}
	}
}