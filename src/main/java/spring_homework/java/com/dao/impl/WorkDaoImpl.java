package spring_homework.java.com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import spring_homework.java.com.dao.WorkDao;
import spring_homework.java.com.po.Work;

public class WorkDaoImpl implements WorkDao {
	public void insert(Work work) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", null);
			Statement statement = connection.createStatement();
			String sql = "insert into work (id, title, price) values ('" + work.getId() + "', '" + work.getTitle()
					+ "','" + work.getPrice() + "' )";
			statement.executeUpdate(sql);
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
