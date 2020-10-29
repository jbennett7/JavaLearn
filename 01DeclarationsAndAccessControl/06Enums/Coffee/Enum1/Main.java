//enum CoffeeSize { BIG, HUGE, OVERWHELMING };
class Coffee {
	enum CoffeeSize { BIG, HUGE, OVERWHELMING };
	CoffeeSize size;
}
public class Main {
	public static void main(String[] args){
		Coffee drink = new Coffee();
		drink.size = Coffee.CoffeeSize.BIG;
		System.out.println("Coffee Size: " + drink.size);
	}
}
