class Box {
	private int size;
	public int getSize() {
		return size;
	}
	public void setSize(int newSize) {
		size = newSize;
	}
}
class Main {
	public static void main(String[] args) {
		Box b = new Box();
		b.setSize(1);
		System.out.println(b.getSize());
	}
}
