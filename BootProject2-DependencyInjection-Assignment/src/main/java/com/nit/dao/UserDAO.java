package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO implements IUser {
	
	public static final String GET_QUERY = "SELECT USER_NAME,PASS_WORD,MID,PHNO from usertab";

	@Autowired
	DataSource data;

	List<User> list;

	public List<User> getByUserName() throws SQLException {
		
		System.out.println("UserDAO.getByUserName()");
		
		list = new ArrayList<>();
		
		Connection con = data.getConnection();
		PreparedStatement ps = con.prepareStatement(GET_QUERY);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			User user = new User();
			user.setName(rs.getString(1));
			user.setPassword(rs.getString(2));
			
			list.add(user);
		}

		return list;
	}

}
