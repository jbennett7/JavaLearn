class Ball {
	private int integer;
	private Ball(int i) {
		integer = i;
	}
	public int getInteger() { return integer; }
	public static void main(String [] args) {
		int i = 1;
		if(args.length > 0) {
			i = Integer.parseInt(args[0]);
		}
		Ball b = new Ball(i);
		System.out.println(b.getInteger());
	}
}

