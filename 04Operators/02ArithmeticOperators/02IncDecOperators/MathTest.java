/* Increment and Decrement Operators (page 238)
 * Java has two operators that will increment or decrement a variable by exactly one.
 * These operators are either two plus signs (++) or two minus signs (--):
 */

class MathTest {
    static int players = 0;
    public static void main (String [] args) {
        System.out.println("players online: " + players++);
        System.out.println("The value of players is "
                + players);
        System.out.println("The value of players is now "
                + ++players);
    }
}
