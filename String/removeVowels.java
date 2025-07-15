import java.util.*;
public class removeVowels {
    public static String solve(String s){
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'|| ch=='o'||ch=='i'||ch=='u'){
                s=s.substring(0, i)+s.substring(i+1);
                i--;
            }
        }
        return s;
    }
    //Here substring method is called each tym inside the loop leads O(n2) complexity
    //So use StringBuilder to to reduce the time complexity

    public static String vowelsremovel(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=Character.toLowerCase(s.charAt(i));
            if(ch!='a' && ch!='e' && ch!='i'  && ch!='o' && ch!='u'){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

       public static String whitespaces(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String keepAlphabetOnly(String str){
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i++){
            int ascii=(int) str.charAt(i);
            if((ascii>=65 && ascii<=90)||(ascii>=97 && ascii<=122)){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String removeBrackets(String str){
        StringBuffer sb= new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=')' && str.charAt(i)!='('){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        // System.out.println(solve(str));
        // System.out.println(vowelsremovel(str));
        // System.out.println(whitespaces(str));
        // System.out.println(keepAlphabetOnly(str));
        System.out.println(removeBrackets(str));
        sc.close();
    }
}