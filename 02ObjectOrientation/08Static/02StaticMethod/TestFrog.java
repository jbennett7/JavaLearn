class Frog {
	private static int frogCount = 0;
	
	public static int getFrogCount() {
		return frogCount;
	}
	public Frog() {
		frogCount += 1;
	}
}

class TestFrog {
	public static void main (String [] args) {
		new Frog();
		new Frog();
		new Frog();
		System.out.println("Frog count is now " + Frog.getFrogCount());
	}
}
