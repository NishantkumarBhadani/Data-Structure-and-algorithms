
import java.util.*;

public class removeCommonString {

    public static String removeSub(String s1,String s2){
        StringBuilder sb= new StringBuilder();

        //brute force
        for (int i = 0; i < s1.length(); i++) {
            int flag=0;
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    flag=1;
                }
            } 
            if(flag==0){
                sb.append(s1.charAt(i));
            }      
        }
        return  sb.toString();
    }

    //optimal
    public static String removeUsingMap(String s1,String s2){
        StringBuilder sb=new StringBuilder();
        Map<Character,Integer> freq=new HashMap<>();

        for (int i = 0; i < s2.length(); i++) {
            char ch=s2.charAt(i);
            freq.put(ch,1);
        }
        for(int i=0;i<s1.length();i++){
            if(freq.get(s1.charAt(i))==null){
                sb.append(s1.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1="abcdefg";
        String s2="cde";
        // System.out.println(removeSub(s1, s2));
        System.out.println(removeUsingMap(s1, s2));

    }
}
