public class ReverseStringByWords {
    public static void main(String [] args){
        String str ="i.like.this.program.very.much";

        String[] arr = str.split("\\.");
        String ans = "";

        for(int i = arr.length-1;i>=0;i--){
            if(i == 0){
                ans+=arr[i];
            }
            else{
                String b = arr[i]+".";
                ans+= b;
            }
        }

        System.out.println(ans);
    }
}
