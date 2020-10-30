class Ball {
	private int integer;
	Ball(int i) {
		integer = i;
	}
	public int getInteger() { return integer; }
}
class SoccerBall extends Ball {
	private SoccerBall() {
		super(1);
	}
	public static void main(String [] args) {
		int i = 1;
		if(args.length > 0) {
			i = Integer.parseInt(args[0]);
		}
		SoccerBall b = new SoccerBall();
//		Ball b = new Ball(i);
		System.out.println(b.getInteger());
	}
}

