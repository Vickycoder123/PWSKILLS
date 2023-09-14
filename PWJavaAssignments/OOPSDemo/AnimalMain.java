package test;
class Animal{
	public void makeSound() {
		System.out.println("Animal sound !");
	}
}

class Dog extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Dog Barks..");
	}
}
class Cat extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Cat meows..");
	}
}
class Cow extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Cow sound..");
	}
}
public class AnimalMain {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.makeSound();
		
		Animal dog = new Dog();
		dog.makeSound();
		
		Animal cat = new Cat();
		cat.makeSound();
		
		Animal cow = new Cow();
		cow.makeSound();
	}
}
