/* Conditional Operator (page 241)
 * The conditional operator is a ternary operator (it has three operands) and is used to
 * evaluate boolean expressions, much like an if statement, except instead of
 * executing a block of code if the test is true, a conditional operator will assign a
 * value to a variable. In other words, the goal of the conditional operator is to decide
 * which of two values to assign to a variable. This operator is constructed using a ?
 * (question mark) and a : (colon).
 */

class Salary {
    public static void main(String [] args) {
        int numOfPets = 3;
        String status = (numOfPets<4) ? "Pet limit not exceeded"
            : "too many pets";
        System.out.println("This pet status is " + status);
    }
}
