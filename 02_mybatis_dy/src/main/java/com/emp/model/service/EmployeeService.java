package com.emp.model.service;

import static com.emp.common.SessionTemplate.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.emp.model.dao.EmployeeDao;
import com.emp.model.dto.Employee;

public class EmployeeService {
	
	EmployeeDao dao=new EmployeeDao();
	
	public List<Employee> selectAllEmp(int cPage, int numPerpage){
		SqlSession session=getSession();
		List<Employee> list=dao.selectAllEmp(session,cPage,numPerpage);
		session.close();
		return list;
	}
	
	public int selectEmployeeCount() {
		SqlSession session=getSession();
		int result=dao.selectEmployeeCount(session);
		session.close();
		return result;
	}

}
