/* instanceof Comparison (page 232)
 * The instanceof operator is used for object reference variables only, and you can
 * use it to check whether an object is of a particular type. By "type," we mean class or
 * interface type--in other words, whether the object referred to by the variable on the
 * left side of the operator passes the IS-A test for the class or interface type on the
 * right side. (Chapter 2 covered IS-A relationships in detail.) The following simple
 * example,
 */

class InstanceOf {
	public static void main(String[] args) {
		String s = new String("foo");
		if (s instanceof String) {
			System.out.println("s is a String");
		}
	}
}
