class Ball {
	private int integer;
	static int global;
	static { global = 0; }
	static { System.out.println("Ball static initialization."); }
	{ integer = 5; }
	Ball() {
		global += 1;
	}
	public int getInteger() { return integer; }
	public void setInteger(int i) { integer = i; }
	public int getGlobal() { return global; }
}
class SoccerBall extends Ball {
	private SoccerBall() { }
	{ System.out.println("SoccerBall 1."); }
	static { System.out.println("SoccerBall static initialization."); }
	{ System.out.println("SoccerBall 2."); }
	public static void main(String [] args) {
		int i = 1;
		if(args.length > 0) {
			i = Integer.parseInt(args[0]);
		}
		SoccerBall b = new SoccerBall();
		SoccerBall c = new SoccerBall();
		Ball ball = new Ball();
		System.out.println(b.getGlobal());

	}
}

