class SportsCar {
	public String goFast() {
		return "SportsCar goes Fast...";
	}

	void doStuff() {
		System.out.println(goFast());
	}
}
class Convertible extends SportsCar {
	void doThings() {
		SportsCar sc = new SportsCar();
		System.out.println(sc.goFast());
	}
	public String goFast() {
		return "Convertible goes Fast...";
	}
	void doMore() {
		System.out.println(goFast());
	}
}
class Main {
	public static void main(String[] args) {
		Convertible c = new Convertible();
		c.doThings();
		c.doMore();
	}
}
