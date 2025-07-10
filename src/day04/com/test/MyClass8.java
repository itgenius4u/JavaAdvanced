package day04.com.test;
// Custom Exception
class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);
	}
}
public class MyClass8 {
	static void validate(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("18세이하 입니다.");
		}
	}
	public static void main(String[] args) {
		try {
			validate(12);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}




