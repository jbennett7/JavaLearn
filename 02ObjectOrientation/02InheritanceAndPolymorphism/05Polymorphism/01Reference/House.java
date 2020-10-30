public class House {
	public static void main(String [] args) {
		Tutor t = new Tutor();
		House h = t;
		System.out.println(t.type());
	}
	String type() {
		return "House";
	}
}
class Tutor extends House {}
