public class GarbageTruck {
	public static void main(String [] args) {
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		// The StringBuffer object is not eligible for collection.
		sb = null;
		// The StringBuffer object is eligible for collection.
	}
}
