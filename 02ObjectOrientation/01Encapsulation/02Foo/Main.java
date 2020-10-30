class Foo {
	public int left = 9;
	public int right = 3;
	public void setLeft(int leftNum) {
		left = leftNum;
		right = leftNum/3;
	}
}
class Main {
	public static void main(String[] args) {
		Foo f = new Foo();
		System.out.println("Foo.right: " + f.right + ";");
		System.out.println("Foo.left: " + f.left + ";");
		System.out.print("Is the value of right always ");
		System.out.print("going to be one-third the value ");
		System.out.println("of left?");
	}
}
