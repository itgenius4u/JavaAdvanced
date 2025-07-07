package com.test4;

public class MyApp {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.breath();
		Dog dog = new Dog();
		dog.breath();
		dog.bark();
		Cat cat = new Cat();
		cat.breath();
		cat.meow();
		
		Animal animal2 = dog; 
		animal2.breath();
		Dog dog2 = (Dog)animal2;
		dog2.breath();
		dog2.bark();
		
		Animal animal3 = new Dog();
		animal3.breath();
		Dog dog3 = (Dog)animal3;
		dog3.breath();
		dog3.bark();
		
		Animal animal4 = new Cat();
		animal4.breath();
		Cat cat2 = (Cat)animal4;
		cat2.breath();
		cat2.meow();
		
		Animal animal5 = new Dog();
		animal5.breath();
		Animal animal6 = new Cat();
		animal5.breath();
		
//		오류 1
//		Animal animal7 = new Animal();
//		Dog dog4 = (Dog)animal7;
		
//      오류 2		
//		Dog dog5 = new Dog();
//		Animal animal7 = dog5;
//		Cat cat4 = (Cat)animal7;
		
		
		
		
		
		
	}

}
