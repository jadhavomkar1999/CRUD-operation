public class j_03_PrecedenceAndAssociativity {
    public static void main(String[]args){

        // Precedence = It is the priority for the different types of operators with their operands.

        int a = 6*5-34/2;
        /*

        Highest precedence goes to * and /. They are then evaluated on the basis of
        lest to right associativity.

        =30-34/2
        =30-17
        =13
         */

        /*
        Associativity = Associativity tells the direction of execution of operators.
                      It can either be left to right or right to left.

                      * / --> L to R
                      + - --> L to R
                      ++ = --> R to L

         */

        int b = 60/5-34*2;
        /*
        = 12-34*2
        = 12-68
        = -56
         */

        System.out.println(a);
        System.out.println(b);
    }
}