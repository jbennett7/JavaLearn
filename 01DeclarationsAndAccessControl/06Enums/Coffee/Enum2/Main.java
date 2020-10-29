//enum CoffeeSize { BIG, HUGE, OVERWHELMING };
class CoffeeSize {
	public static final CoffeeSize BIG =
		new CoffeeSize("BIG", 0);
	public static final CoffeeSize HUGE =
		new CoffeeSize("HUGE", 1);
	public static final CoffeeSize OVERWHELMING =
		new CoffeeSize("OVERWHELMING", 2);

	CoffeeSize(String enumName, int index) {}
	public static void main(String[] args) {
		System.out.println(CoffeeSize.BIG);
	}
}
