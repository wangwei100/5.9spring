package spring_homework.java.com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import spring_homework.java.com.dao.UserDao;
import spring_homework.java.com.po.User;

public class UserDaoImpl implements UserDao {

	public void insert(User user) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/homework", "root", null);
			Statement statement = connection.createStatement();
			String sql = "insert into user (username, password, email) values ('" + user.getUsername() + "', '"
					+ user.getPassword() + "', '" + user.getEmail() + "')";
			statement.executeUpdate(sql);
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
