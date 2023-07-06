package com.emp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.model.dto.Employee;
import com.emp.model.service.EmpService;
import com.emp.model.service.EmpServiceImpl;
import com.emp.model.service.EmployeeService;

/**
 * Servlet implementation class SelectEmployeeAllServlet
 */
@WebServlet("/emp/empAll.do")
public class SelectEmployeeAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmpService service;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectEmployeeAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cPage,numPerpage;
		try {
			cPage=Integer.parseInt(request.getParameter("cPage"));
		}catch(Exception e) {
			cPage=1;
		}
		try {
			numPerpage=Integer.parseInt(request.getParameter("numPerpage"));
		}catch(Exception e) {
			numPerpage=5;
		}
		//List<Employee> employees=new EmployeeService().selectAllEmp(cPage,numPerpage);
		//new EmployeeService를 직접 호출하지 않고, 서비스인터페이스를 생성해서 호출한다.
		//인터페이스를 생성해서 호출하는 이유는 서비스 및 dao를 추상화 하여 프로그램 유지보수시 편리함을 위해
		service=new EmpServiceImpl();
		List<Employee> employees=service.selectAllEmp();
		
		//System.out.println(employees);
		
		//list.stream().forEach(System.out::println);
		request.setAttribute("employees", employees);
//		
//		int totalData=new EmployeeService().selectEmployeeCount();
//		int totalPage=(int)Math.ceil((double)totalData/numPerpage);
//		int pageBarSize=5;
//		int pageNo=((cPage-1)/pageBarSize)*pageBarSize+1;
//		int pageEnd=pageNo+pageBarSize-1;
//		
//		String pageBar="<ul class='pagination justify-content pagination-sm'>";
//		
//		if(pageNo==1) {
//			pageBar+=
//					"""
//					<li class='page-item disabled'>
//						<a class='page-link' href='#'>이전</a>
//					</li>
//					""";
//		}else {
//				pageBar+="<li class='page-item'>";
//				pageBar+="<a class='page-link' href='"+request.getRequestURI()+"?cPage="+(pageNo-1)+"'>이전</a>";
//				pageBar+="</li>";
//		}
//		while(!(pageNo>pageEnd||pageNo>totalPage)) {
//			if(cPage==pageNo) {
//				pageBar+="<li class='page-item disabled'>";
//				pageBar+="<a class='page-link' href='#'>"+pageNo+"</a>";
//				pageBar+="</li>";
//			}else {
//				pageBar+="<li class='page-item'>";
//				pageBar+="<a class='page-link' href='"+request.getRequestURI()+"?cPage="+(pageNo)+"'>"+pageNo+"</a>";
//				pageBar+="</li>";
//			}
//			pageNo++;
//		}
//		
//		if(pageNo>totalPage) {
//			pageBar+="""
//					<li class='page-item disabled'>
//						<a class='page-link' href='#'>다음</a>
//					</li>
//					""";
//		}else {
//			pageBar+="<li class='page-item'>";
//			pageBar+="<a class='page-link' href='"+request.getRequestURI()+"?cPage="+(pageNo)+"'>다음</a>";
//			pageBar+="</li>";
//		}
//		pageBar+="</ul>";
//		request.setAttribute("pageBar", pageBar);
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
