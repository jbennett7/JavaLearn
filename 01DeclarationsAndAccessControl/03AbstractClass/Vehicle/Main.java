abstract class Vehicle {
	private String type;
	public abstract String goUpHill();
	public String getType() {
		return type;
	}
	public void setType(String s) {
		type = s;
	}
}
abstract class Car extends Vehicle {
	private boolean engine = false;
	public abstract String goUpHill();
	public abstract String turn(int whichWay);
	public String doCarThings() {
		return "I am a Car.";
	}
	public void startEngine() {
		engine = true;
	}
	public boolean isRunning() {
		return engine;
	}
}
class Mini extends Car {
	public String goUpHill() {
		return "Driving up Hill.";
	}
	public String turn(int whichWay) {
		if (whichWay == 1){
			return "Turning Left";
		}
		if (whichWay == 0){
			return "Turning Right";
		} else {
			return "CRASH";
		}
	}
}
public class Main {
	public static void main(String[] args) {
		Mini m = new Mini();
		System.out.println(m.goUpHill());
		System.out.println(m.doCarThings());
		m.setType("Mini");
		System.out.println(m.getType());
		System.out.println(m.isRunning());
		m.startEngine();
		System.out.println(m.isRunning());
		System.out.println(m.turn(1));
	}
}
