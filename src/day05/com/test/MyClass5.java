package day05.com.test;

import java.util.HashMap;
import java.util.Map;

class Employee {
	private int empNo;
	private String empName;
	private int age;
	private String address;
	public Employee(int empNo, String empName, int age, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.address = address;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
public class MyClass5 {
	public static void main(String[] args) {
		Employee emp = 
				new Employee(1111, "이순신", 20, "Seoul");
		Employee emp2 = 
				new Employee(2222, "홍길동", 23, "Incheon");
		Map<Integer, Employee> maps
			= new HashMap<Integer, Employee>();
		maps.put(1111, emp);
		maps.put(2222, emp2);
		for(Map.Entry m: maps.entrySet()) {
//			System.out.println(m.getKey());
			Employee e = (Employee)m.getValue();
			System.out.println(e.getEmpNo() + ", " +
					e.getAddress());
		}
	}
}





