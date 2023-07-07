package com.emp.model.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
	private String empId;
	private String empName;
	private String empNo;
	private String email;
	private String phone;
//	private String deptCode; DB입장에서 설계했지만, java입장에서는 필요없는 값이라 Department를 클래스로 선언해준다.
	private Department dept;
	private String jobCode;
	private String salLevel;
	private int salary;
	private double bonus;
	private String managerId;
	private Date hireDate;
	private Date entDate;
	private String entYn;
	private String gender;

	//처음에 내가 했던 방식 
//	private String deptId;
//	private String deptTitle;
//	private String locationId;
//	private String jobName;
}
