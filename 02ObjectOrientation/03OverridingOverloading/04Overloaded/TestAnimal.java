public class TestAnimal {
	public static void main (String [] args) {
		Animal a = new Animal();
		Dog2 b = new Dog2();
  		a.eat();
		b.eat();
		b.eat(1);
	}
}
class Animal {
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}
}
class Dog2 extends Animal {
	public void eat() {
		System.out.println("Dog2 eats.");
	}
	public void eat(int i) {
		System.out.println("Dog2 eats " + i + " dog biscuits.");
	}
}
