package com.nit.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.nit.dao.IUser;

@Service
public class UserService implements IUserService {

	@Autowired
	IUser user;

	@Override
	public List<User> fetchByUserName() throws SQLException {

		System.out.println("UserService.fetchByUserName()");

		List<User> list = user.getByUserName();
		return list;
	}

}
