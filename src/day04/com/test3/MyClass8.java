package day04.com.test3;

import java.util.ArrayList;
import java.util.List;

// Table: employees
// empNo     empName
// 11111     홍길동
// 22222     세종대왕
class Employee {
	private int empNo;
	private String empName;	
	
	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void getEmpInfo() {
		System.out.println(empNo + ", " + empName);
	}	
}
public class MyClass8 {
	public static void main(String[] args) {
//		Employee emp1 = new Employee(11111, "홍길동");
//		Employee emp2 = new Employee(11112, "세종대왕");
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee(11111, "홍길동"));
		emps.add(new Employee(11112, "세종대왕"));
		for(Employee e : emps) {
			System.out.println(e.getEmpNo() + ", "
					+ e.getEmpName())
		}
	}
}





