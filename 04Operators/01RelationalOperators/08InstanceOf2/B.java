/* instanceof Comparison (cont'd page 232)
 * 
 * Even if the object being tested is not an actual instantiation of the class type on
 * the right side of the operator, instanceof will still return true if the object being
 * compared is assignment compatible with the type on the right.
 *
 * The following example demonstrates a common use for instanceof: testing an
 * object to see if it's an instance of one of its subtypes, before attempting a downcast:
 */

class A { }
class B extends A {
	public static void main (String [] args) {
		A myA = new B();
		m2(myA);

                /* In examples like this, the use of the instanceof operator protects
                 * the program from attempting an illegal downcast.
                 *
                 * You can test an object reference against its own class type or
                 * any of its superclasses. This means that any object reference
                 * will evaluate to true if you use the instanceof operator against
                 * type Object, as follows:
                 */
                B b = new B();
                if (b instanceof Object) {
                    System.out.println("b is definitely an Object");
                }
	}
	public static void m2(A a) {
		if (a instanceof B)
			((B)a).doBstuff();
	}
	public static void doBstuff() {
		System.out.println("'a' refers to a B");
	}
}
