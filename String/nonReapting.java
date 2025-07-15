import java.util.HashMap;
import java.util.Map;
public class nonReapting {

    //first non reapting charcters
    public static Character nonReapt(String str){
        Map<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                freq.put(ch, freq.getOrDefault(ch, 0)+1);
            }  
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch)&&freq.get(ch)==1){
                return ch;
            }
        }
        return null;
    } 
// all non reapating
    public static char[] allNonReating(String str){
        Map<Character,Integer> freq=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                freq.put(ch, freq.getOrDefault(ch, 0)+1);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch)&&freq.get(ch)==1){
                sb.append(ch);
            }
        }
        return sb.toString().toCharArray();
    }
    public static void main(String[] args) {
        String str="google yahooo";
        //First non-reapting
        Character result = nonReapt(str);

        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        char[] res=allNonReating(str);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
