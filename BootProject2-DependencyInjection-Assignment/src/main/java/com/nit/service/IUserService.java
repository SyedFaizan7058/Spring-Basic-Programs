package com.nit.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public interface IUserService {

	public List<User> fetchByUserName() throws SQLException;

}
