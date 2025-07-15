
import java.util.stream.Stream;

public class maxOccurence {

    public static char maxOccur(String s){
        char ans='a';
        int maxCount=0;
        int count[]=new int[256];
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            count[ch]++;
            if(count[ch]>maxCount){
                maxCount=count[ch];
                ans=s.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String [] args){
        String str="hellllllllooo";
        System.out.println(maxOccur(str));
    }
}
