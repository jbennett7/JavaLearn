class LeadRope {}
class Animal {}
public class Horse extends Animal {
	private Halter myHalter;
	Horse() {
		myHalter = new Halter();
	}
	public void tie(LeadRope rope) {
		System.out.println(myHalter.tie(rope));
	}
	public static void main(String [] args) {
		Horse h = new Horse();
		LeadRope r = new LeadRope();
		h.tie(r);
	}
}
class Halter {
	public String tie(LeadRope aRope) {
		return "Rope Tied.";
	}
}
