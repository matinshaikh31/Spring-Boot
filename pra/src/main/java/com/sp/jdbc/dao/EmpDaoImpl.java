package com.sp.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sp.jdbc.entities.Employee;

public class EmpDaoImpl {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Employee employee) {
		// TODO Auto-generated method stub
		
		String q = "insert into emp_data(eid,ename,dname) values(?,?,?)";
	
        int r=this.jdbcTemplate.update(q,employee.getEid(),employee.getEname(),employee.getDname());
        return r;
	}
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		
		String q = "update Employee set Ename=? where Eid=?";
	
        int r=this.jdbcTemplate.update(q,employee.getEid(),employee.getEname());
        return r;
	}
	public int delete(Employee employee) {
		// TODO Auto-generated method stub
		
		String q = "delete from Employee where Eid=?";
	
        int r=this.jdbcTemplate.update(q,employee.getEid());
        return r;
	}
	
	public Employee getEmployee(int Eid) {
		String res="select * from Employee where Eid =?";
		RowMapper<Employee> rm = new RawMapperImp();
		Employee employee = this.jdbcTemplate.queryForObject(res,rm,Eid);
		
		return employee;
	}
	
	public List<Employee> getAllEmployee(){
		String a = "select * from customer";
		List<Employee> employee  = this.jdbcTemplate.query(a,new RawMapperImp());
		
		return employee;

	}
}
