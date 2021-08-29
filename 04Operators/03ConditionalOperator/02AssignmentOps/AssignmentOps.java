/* Conditional operators (cont'd page 241)
 * A conditional operator starts with a boolean operation, followed by two possible
 * values for the variable to the left of the assignment (=) operator. The first value (the
 * one to the left of the colon) is assigned if the conditional (boolean) test is true,
 * and the second value is assigned if the conditional test is false. You can even nest
 * conditional operators into one statement
 */

class AssignmentOps {
    public static void main(String [] args) {
        int sizeOfYard = 10;
        int numOfPets = 3;
        String status = (numOfPets<4)? "Pet count OK"
            : (sizeOfYard > 8)? "Pet limit on the edge"
               : "too many pets";
        System.out.println("Pet status is " + status);
    }
}
