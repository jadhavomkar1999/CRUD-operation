import java.util.Scanner;
public class j_10_StringJava {
    public static void main(String[] args){
        //String name = new String("Omkar");
        //System.out.println(name);

        //String name = "Omkar";
        //System.out.print("The name is: ");
        //System.out.println(name);

        Scanner st = new Scanner(System.in);
        //String str = st.next();        // take only first word of the sentence.
        String str = st.nextLine();      // take whole sentences as input.

        System.out.println(str);
    }
}
