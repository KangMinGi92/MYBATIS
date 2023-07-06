package com.emp.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.emp.model.dto.Employee;

public interface EmpDao {
	public List<Employee> selectAllEmp(SqlSession session);
	public List<Employee> searchEmp(SqlSession sessiuon, Map<String,Object> param);
}
