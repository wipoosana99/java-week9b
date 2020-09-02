package week9b;

public class Cat {
	String breed;
	String size;
	String color;
	int age;
	
	void data() {
		System.out.println("breed: " + breed);
		System.out.println("Size: " + size);
		System.out.println("Color: " + color);
		System.out.println("Age: " + age);
	}
	
	void eat() {
		System.out.println("=============");
		System.out.println("Cat eat fish");
	}
	void run() {
		System.out.println("=============");
		System.out.println("Cat of run kill rat");
	}
	void sleep() {
		System.out.println("=============");
		System.out.println("Cat of sleep");
	}
	void looking() {
		System.out.println("=============");
		System.out.println("Cat like looking owner");
	}
	public static void main(String[]args) {
		Cat Luca = new Cat();
		Luca.breed = "Norwegian";
		Luca.size = "Large";
		Luca.color = "light Gray";
		Luca.age = 5;
		
		Luca.data();
		Luca.eat();
		Luca.run();
		Luca.sleep();
		Luca.looking();
	}
	
}
