import java.util.Scanner;


public class j_07_JavaMethods {
    static int addition(int x, int y){
        int ans;

        if(x>y){
            ans = (x + y)*3;
        }
        else{
            ans = (x + y)*5;
        }

        return ans;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = addition(a,b);

        System.out.println(c);

    }
}
