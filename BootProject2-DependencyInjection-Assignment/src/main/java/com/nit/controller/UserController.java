package com.nit.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;

import com.nit.service.IUserService;

@Controller
public class UserController {

	@Autowired
	IUserService service;

	public List<User> showAllUsers() throws SQLException {
		
		System.out.println("UserController.showAllUsers()");

		List<User> list = service.fetchByUserName();

		return list;
	}

}
