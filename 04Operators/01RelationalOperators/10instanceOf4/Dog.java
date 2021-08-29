/* instanceof Comparison (cont'd page 234)
 * You can't use the instanceof operator to test across two different class hierarchies.
 * For instance, the following will NOT compile:
 */
class Cat { }
class Dog {
    public static void main(String [] args) {
        Dog d = new Dog();
        System.out.println(d instanceof Cat);
    }
}
