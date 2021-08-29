/* Relational Operators (From page 226)
 * The exam covers siz relational operators (<. <=, >, >=, --, and !=).
 * Relational operators always reslut in a boolean (true or false) value. This boolean value is most often used in an if test, as follows:
 *     int x = 8;
 *     if (x < 9) {
 *       // do something
 *     }
 *
 *     But the resulting value can also be assigned directly to a boolean primitive
 */

class CompareTest {
  public static void main(String [] args) {
    boolean b = 100 > 99;
    System.out.println("The value of b is " + b);
  }
}
