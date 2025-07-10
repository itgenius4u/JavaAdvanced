package day04.com.test;
abstract class Person{
	abstract void eat();
}
interface Animal {
	void eat();
}
public class MyClass11 {
	public static void main(String[] args) {
		Person p = new Person() {
			void eat() {
				System.out.println("식사하다.");
			};
		};
		p.eat();
		Animal animal = new Animal() {
			public void eat() {
				System.out.println("먹다.");
			}
		};
		animal.eat();
	}
	
}
