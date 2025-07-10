package day04.com.test3;

class Employee {
	private int empNo;
	private String empName;	
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
	}
}
