package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.beans.Employee;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {

	public static final String GET_EMPS_QUERY = "SELECT Empno,ename,job,sal,deptno FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";

	@Autowired
	DataSource data;

	@Override
	public List<Employee> getEmployeeByDesg(String des1, String des2, String des3) throws Exception {

		List<Employee> list = null;

		Connection con = data.getConnection();
		try (con) {

			PreparedStatement ps = con.prepareStatement(GET_EMPS_QUERY);
			list = new ArrayList<>();
			ps.setString(1, des1);
			ps.setString(2, des2);
			ps.setString(3, des3);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee e = new Employee();
				e.setEno(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setJob(rs.getString(3));
				e.setSalary(rs.getDouble(4));
				e.setDepno(rs.getInt(5));

				list.add(e);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

}
