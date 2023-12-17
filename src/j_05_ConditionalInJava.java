import java.util.Scanner;
public class j_05_ConditionalInJava {
    public static void main(String[] args){
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        /*
        boolean cond = (age>18);

        if(cond){
            System.out.println("Yes, You can drive!");
        }
        else{
            System.out.println("NO, You can't drive!");
        }

         */

        if(age > 56){
            System.out.println("You are experienced!");
        }
        else if( age >= 46){
            System.out.println("you are semi-experienced!");
        }
        else if ( age >= 36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced!");
        }

        if(age < 5){
            System.out.println("You are baby!");
        }
    }
}
