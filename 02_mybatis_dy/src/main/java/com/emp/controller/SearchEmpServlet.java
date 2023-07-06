package com.emp.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.model.dto.Employee;
import com.emp.model.service.EmpService;
import com.emp.model.service.EmpServiceImpl;

/**
 * Servlet implementation class SearchEmpServlet
 */
@WebServlet("/searchEmp.do")
public class SearchEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		private EmpService service;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String type=request.getParameter("type");
		String keyword=request.getParameter("keyword");
		String gender=request.getParameter("gender");
		String salFlag=request.getParameter("salFlag");
		Map<String,Object> param=new HashMap<>();
		param.put("type", type);
		param.put("keyword",keyword);
		param.put("gender", gender);
		param.put("salary", Integer.parseInt(request.getParameter("salary").equals("")?"0":request.getParameter("salary")));
		param.put("salFlag", salFlag);
		param.put("deptCodes",request.getParameterValues("deptCode"));
		param.put("jobCodes", request.getParameterValues("jobCode"));
		param.put("hireDate", request.getParameter("hireDate"));
		param.put("hireFlag",request.getParameter("hireFlag"));
		//Map.of("type",type,"keyword",keyword);
		service=new EmpServiceImpl();
		List<Employee> employees=service.searchEmp(param);
		
		request.setAttribute("employees",employees);
		request.getRequestDispatcher("/views/employeeList.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
