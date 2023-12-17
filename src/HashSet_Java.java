import java.util.*;

import java.util.HashMap;
import java.util.Map;

public class HashSet_Java {
    public static void main(String[] args){

        HashMap<String,Integer> map = new HashMap<>();

        String[] str = new String[8];

        for(int i=0;i<8;i++){
            Scanner sc = new Scanner(System.in);
            String a = sc.next();

            str[i] = a;
        }

        for(int i=0;i<8;i++){
            if(map.containsKey(str[i])){
                map.put(str[i],map.get(str[i])+1);
            }
            else{
                map.put(str[i] , 1);
            }
        }

        for(Map.Entry<String, Integer> e :map.entrySet()){
            System.out.println(e.getKey()+" = "+e.getValue());
        }

    }
}
