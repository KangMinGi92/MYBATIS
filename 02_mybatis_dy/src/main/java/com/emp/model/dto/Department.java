package com.emp.model.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//dto 에 employee에서 department를 호출하고 department에서 employees를 호출해서 stackoverflow 에러가 뜨는걸 
//방지하기 위해서 싱글톤 패턴으로 만들어주던가 아니면 롬북에 ToString을 제외시켜줄수 있다.
@ToString(exclude= {"employees"})
public class Department {
	private String deptId;
	private String deptTitle;
	private String locationId;
	//1:다 관계일때 설정해줘야하는 값
	private List<Employee> employees;
}
