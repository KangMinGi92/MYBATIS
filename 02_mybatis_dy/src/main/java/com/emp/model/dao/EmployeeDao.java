package com.emp.model.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.emp.model.dto.Employee;

public class EmployeeDao {
	
	public List<Employee> selectAllEmp(SqlSession session, int cPage, int numPerpage){
		RowBounds rb=new RowBounds((cPage-1)*numPerpage,numPerpage);
		return session.selectList("employee.SelectEmployeeAll",null,rb);
	}

	
	public int selectEmployeeCount(SqlSession session) {
		return session.selectOne("employee.selectEmployeeCount");
	}

}
