public class TestAnimal {
	public static void main (String [] args) {
		Animal a = new Dog2();
		Dog2 b = new Dog2();
		Animal c = new Animal();
		c.eat();
		b.eat();
  		a.eat();
	}
}
class Animal {
	public void eat() throws Exception {
		System.out.println("Generic Animal Eating Generically");
	}
}
class Dog2 extends Animal {
	public void eat() {
		System.out.println("Dog2 eats.");
	}
}
