import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<String> str = new Vector<String>();

        for(int i=0;i<5;i++){
            Scanner sc = new Scanner(System.in);
            String ab = sc.next();
            str.add(ab);
        }
        System.out.println("enter string that you want to search in vector: ");
        Scanner am = new Scanner(System.in);
        String sd = am.next();
        boolean a = str.contains(sd);
        System.out.println(a);
        System.out.println(str);

        Vector<String> str2 = (Vector<String>)str.clone();

        System.out.println(str2);

        Collections.sort(str2);
        System.out.println(str2);
        System.out.println(str.isEmpty());
        System.out.println(str2.get(3));
        str.clear();
        System.out.println(str2.remove(3));
        System.out.println(str2.set(3,"shgdfvkd"));
        str2.indexOf("shgdfvkd");

        System.out.println(str2);
        System.out.println(str2.size());
    }
}
