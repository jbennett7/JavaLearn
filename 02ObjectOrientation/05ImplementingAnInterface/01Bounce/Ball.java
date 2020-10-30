interface Bounceable {
	public void bounce();
	public void setBounceFactor(int bf);
}
interface Barstool {}
public class Ball implements Bounceable {
	public void bounce() { }
	public void setBounceFactor(int bf) { }
	public static void main(String [] args) {
		if (args.length > 0) {
			System.out.println("Input: " + args[0]);
		} else {
			System.out.println("No input");
		}
	}
}
class Foo implements Barstool {}
