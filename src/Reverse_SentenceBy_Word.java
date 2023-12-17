import java.util.Collections;
import java.util.Vector;

public class Reverse_SentenceBy_Word {
    public static void main(String[] args){

        String str="I am student at DYPIT college.";

        Vector<String> str2 = new Vector<String>();

        String ans="";

        for(int i=0;i<str.length();i++){

            if(str.charAt(i) == ' '){
                ans = ans + str.charAt(i);
                str2.add(ans);
                ans="";

            }
            else{
                ans = ans + str.charAt(i);
            }
        }

        Collections.reverse(str2);

        for(String s:str2){
            System.out.print(s);
        }

    }

}
