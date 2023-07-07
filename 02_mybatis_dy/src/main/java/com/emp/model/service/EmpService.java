package com.emp.model.service;

import java.util.List;
import java.util.Map;

import com.emp.model.dto.Department;
import com.emp.model.dto.Employee;

public interface EmpService {

	List<Employee> selectAllEmp();
	List<Employee> searchEmp(Map<String,Object> param);
	public List<Department> selectAllDept();
}
