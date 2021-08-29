/* Relational Operators (cont'd page 229)
 *
 * After running this code, both variable a and variable b will refer to the same
 * object (a JButton with the label Exit). Reference variables can be tested to see if
 * they refer to the same object by using the == operator. Remember, the -- operator is
 * looking at the bits in the variable, so for reference variables, this means that if the
 * bits in both reference variables are identical, then both refer to the same object.
 * Look at the following code:
 */

import javax.swing.JButton;
class CompareReference {
	public static void main(String[] args) {
		JButton a = new JButton("Exit");
		JButton b = new JButton("Exit");
		JButton c = a;
		System.out.println("Is reference a == b? " + (a == b));
		System.out.println("Is reference a == c? " + (a == c));
	}
}
