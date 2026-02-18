package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.service.EmployeePojo;

public class Employee_Dao {

	public void fetchAllRecord(EmployeePojo p) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		PreparedStatement ps = c.prepareStatement("select * from employee");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "   " + rs.getString(2) + "     " + rs.getString(3) + "   "
					+ rs.getString(4) + "   " + rs.getLong(5) + "   " + rs.getLong(6) + "   " + rs.getString(7) + "   "
					+ rs.getString(8) + "   " + rs.getString(9) + "   " + rs.getDouble(10));
		}
		c.close();
	}

	public void insertData(EmployeePojo p) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		PreparedStatement ps = c.prepareStatement(
				"insert into employee(id,name,lastname,city,number,aadharNo,emailAddress ,branch,pancard,salary)values(?,?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, p.getId());
		ps.setString(2, p.getName());
		ps.setString(3, p.getLastname());
		ps.setString(4, p.getCity());
		ps.setLong(5, p.getNumber());
		ps.setLong(6, p.getAadharNo());
		ps.setString(7, p.getEmailAddress());
		ps.setString(8, p.getBranch());
		ps.setString(9, p.getPancard());
		ps.setDouble(10, p.getSalary());

		int check = ps.executeUpdate();

		if (check > 0) {
			System.out.println("Data is Inserted.. !");
		} else {
			System.out.println("Data is Not Inserted.. !");
		}
		c.close();
	}

	public void updateData(EmployeePojo p) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		PreparedStatement ps = c.prepareStatement("update employee set name = ?, city = ? where id = ?");
		ps.setString(1, p.getName());
		ps.setString(2, p.getCity());
		ps.setInt(3, p.getId());

		int check = ps.executeUpdate();
		if (check > 0) {
			System.out.println("Data is updated.. !");
		} else {
			System.out.println("Data is Not updated.. !");
		}
		c.close();
	}

	public void deleteData(EmployeePojo p) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");

		PreparedStatement ps = c.prepareStatement("delete from employee where id =?");
		ps.setInt(1, p.getId());
		int check = ps.executeUpdate();
		if (check > 0) {
			System.out.println("Data is deleted.. !");
		} else {
			System.out.println("Data is Not deleted.. !");
		}
		c.close();
	}
}
