package com.sp.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sp.jdbc.entities.Employee;

public class RawMapperImp implements RowMapper {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
     Employee e1 = new Employee();
        e1.setEid(rs.getInt(1));
		e1.setEname(rs.getString("Jay"));
		e1.setDname(rs.getString("Tax"));
		
		return e1;
	}
   
}
