
import java.util.HashMap;
import java.util.Map;

public class countFrequency {

    public static void count(String str){
        int[] freq= new int[256];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                freq[ch]++;
            }
        }
        for(int i=0;i<256;i++){
           if(freq[i]==1){
             System.out.println((char)i+":"+freq[i]);
           }
        }
    }

    //using map

    public static Map<Character,Integer> getFreq(String str){
        Map<Character,Integer> freqMap=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
            }
        }
        return freqMap;

    }
    public static void main(String[] args){
        String str="Hello I am 1224 Nishant";
        count(str);
        //Map k liye
        Map<Character,Integer> result=getFreq(str);

       for(Map.Entry<Character,Integer> entry:result.entrySet()){
        System.out.println(entry.getKey()+":"+entry.getValue());
       }
       System.out.println("Printing non reapating:");
       for(Map.Entry<Character,Integer> entry:result.entrySet()){
        if(entry.getValue()==1){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
       }
     }
}
