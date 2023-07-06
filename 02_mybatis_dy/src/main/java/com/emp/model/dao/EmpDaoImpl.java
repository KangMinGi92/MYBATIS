package com.emp.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.emp.model.dto.Employee;

public class EmpDaoImpl implements EmpDao {

	@Override
	public List<Employee> selectAllEmp(SqlSession session) {
		return session.selectList("employee.selectAllEmp");
	}

	@Override
	public List<Employee> searchEmp(SqlSession session, Map<String, Object> param) {
		return session.selectList("employee.searchEmp",param);
	}

}
