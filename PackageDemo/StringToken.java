import java.util.*;
class StringToken{
    public static void main(String args[]){
        String s1 = "Have a good day";
        StringTokenizer st = new StringTokenizer(s1);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
