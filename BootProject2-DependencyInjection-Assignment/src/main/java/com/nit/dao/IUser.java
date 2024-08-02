package com.nit.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public interface IUser {

	public List<User> getByUserName() throws SQLException;

}
