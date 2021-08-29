/* Relational Operators (cont'd page 231)
 * Equality for enums
 *
 * Once you've declared an enum, it's not expandable. At runtime, there's no way to
 * make additional enum constants. Of course, you can have as many variables as you'd
 * like, refer to a given enum constant, so it's important to be able to compare two enum
 * reference variables to see if they're "equal"--that is, do they refer to the same enum
 * constant. You can use either the == operator or the equals() method to determine
 * whether two variables are referring to the same enum constant:
 */

class EnumEqual {
    enum Color {RED, BLUE}       // ; is optional
    public static void main(String[] args) {
        Color c1 = Color.RED; Color c2 = Color.RED;
        if (c1 == c2) { System.out.println("=="); }
        if(c1.equals(c2)) { System.out.println("dot equals"); }
    }
}
