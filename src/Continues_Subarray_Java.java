/*
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Continues_Subarray_Java {
    public static void main(String[] args){

        Scanner st = new Scanner(System.in);
        int n = st.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter target sum:");
        int ast = st.nextInt();

        for(int i=0;i<n;i++){
            Scanner sc = new Scanner(System.in);

            arr[i] = sc.nextInt();
        }



        int sum = 0;
        int s = 0;
        int ptr = 0;



        while(ptr < n){

            if(ast == 0){
                System.out.println("No subarray is found.");
                break;
            }

            if(sum == ast){
                System.out.println(s+ " " + ptr);
            }
            else if(sum>ast){
                sum = sum-arr[s];
                s++;
                if(sum == ast){
                    ptr=ptr-1;
                    break;
                }
            }
            else{
                sum = sum + arr[ptr];
                ptr++;
            }
        }

        System.out.println(s+" "+ ptr);
    }
}

 */

/*
import java.util.*;
import java.util.HashMap;
import java.util.Vector;

public class Continues_Subarray_Java{
    public static void main(String[] args){

        String str = "omkar jadhav govind suryawanshi omkar ajinkya jadhav govind ajinkya pavan";

        HashMap<String,Integer> map = new HashMap<>();

        Vector<String> vt = new Vector<String>();


        String str2="";

        for(int i=0;i<str.length();i++){

            if(str.charAt(i) == ' '){
                vt.add(str2);
                str2="";
                continue;
            }

            if(i == str.length()-1){
                str2 = str2 + Character.toString(str.charAt(i));
                vt.add(str2);
                str2="";
            }

            String a = Character.toString(str.charAt(i));
            str2 = str2 + a;

        }


        System.out.println(vt);

        for(String m:vt){

            if(map.containsKey(m)){
                map.put(m,(map.get(m)+1));

            }
            else{
                map.put(m,1);
            }
        }
        System.out.println(map);
    }
}

 */

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

//----reverse the sentence by word.

/*
public class Continues_Subarray_Java{
    public static void main(String[] args){

        String str = "I am student of DYPIT";

        Vector<String> str2 = new Vector<String>();
        String str1="";
        for(int i=0;i<str.length();i++){

            if(str.charAt(i) ==' ' || i == str.length()-1){
                str1 = str1 + Character.toString(str.charAt(i));
                str2.add(str1);
                str1="";
            }

            str1 = str1 + Character.toString(str.charAt(i));
        }

        for(String a:str2){
            System.out.print(a);
        }
        System.out.println();

        System.out.println("After Reverse the string.");

        Collections.reverse(str2);

        for(String a:str2){
            System.out.print(a);
        }
    }
}
 */

//---- Check whether two arrays are rotate by 2 place.

public class Continues_Subarray_Java{

    static boolean Rotate_String(String str1,String str2){

        if(str1.length() != str2.length()){
            return false;
        }
        else if(str1.length() == 2 || str2.length() == 2){
            if(str1.equals(str2)){
                return true;
            }
            else{
                return false;
            }
        }

        String ans = "";
        String ans2 = "";

        //Clock-wise

        for(int i=2;i<str1.length();i++){
            ans = ans + Character.toString(str1.charAt(i));
        }
        for(int i=0;i<2;i++){
            ans = ans + Character.toString(str1.charAt(i));
        }

        //Anti-Clock-wise

        for(int i=str1.length()-2;i<str1.length();i++){
            ans2 = ans2 + Character.toString(str1.charAt(i));
        }
        for(int i=0;i<str1.length()-2;i++){
            ans2 = ans2 + Character.toString(str1.charAt(i));
        }

        if(ans.equals(str2) || ans2.equals(str2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(Rotate_String(str1,str2));

    }
}
