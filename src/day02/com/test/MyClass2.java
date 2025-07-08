package day02.com.test;
class Student { 
	public String name;
}
public class MyClass2 {
	public static void main(String[] args) {
		int[] myNum = new int[3];		
		int[] myNum2 = {10, 11, 12};
		int[] myNum3 = new int[] {1, 2, 3, 4};
		int[] myNum4 = null;
		myNum4 = new int[5];
		Student[] students = new Student[2];
		students[0].name = "세종대왕";
		students[1].name = "을지문덕";
//		Student stu1 = new Student();
//		stu1.name = "세종대왕";
//		students[0] = stu1;
//		Student stu2 = new Student();
//		stu2.name = "을지문덕";
//		students[1] = stu2;
		for(int inx = 0; inx < students.length; inx++) {
			System.out.println(students[inx].name);
		}
		for(Student s : students) {
			System.out.println(s.name);
		}
		
		String[] names = new String[] {"홍길동", "이순신"};
		String[] names2 = {"세종대왕", "을지문덕"};
		String[] names3 = null;
		names = new String[] {"홍길동", "이순신"};
	}
}


