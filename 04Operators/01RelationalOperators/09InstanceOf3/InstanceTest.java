/* instanceOf Comparison (cont'd page 234)
 *
 * In addition,it is legal to test whether the null reference is an instance of a class.
 * This will always result in false, of course.
 */
class InstanceTest {
    public static void main(String [] args) {
        String a = null;
        boolean b = null instanceof String;
        boolean c = a instanceof String;
        System.out.println(b + " " + c);
    }
}
