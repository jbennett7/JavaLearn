class InstanceOf {
	public static void main(String[] args) {
		String s = new String("foo");
		if (s instanceof String) {
			System.out.println("s is a String");
		}
	}
}
