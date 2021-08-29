/* Relational Operators (cont'd page 231)
 * The equals() Method in Class String
 *
 * The equals() method in class String has been overridden. When the equals() method is used to compare two
 * strings, it will return true if the strings have the same value, and it will return false if th strings
 * have different values. For String's equals() method, values ARE case sensitive.
 */

class Budgie {
    public static void main(String[] args) {
        Budgie b1 = new Budgie();
        Budgie b2 = new Budgie();
        Budgie b3 = b1;

        String s1 = "Bob";
        String s2 = "Bob";
        String s3 = "bob";

        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));
//        System.out.print("For strings .equals() is overriden ");
//        System.out.println("so if the two are the same value it returns true.");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
