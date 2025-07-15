public class vowelConsonant {

    public static void solve(String s){
        int vowel=0;
        int consonant=0;
        int whitespace=0;

        s=s.toLowerCase();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }else  if(ch>='a' && ch<='z'){
                consonant++;
            }else if(ch==' '){
                whitespace++;
            }
        }
        System.out.println("vowles="+vowel);
        System.out.println("vowles="+consonant);
        System.out.println("vowles="+whitespace);
    }
    public static void main(String[] args) {
        String str=" Nishant";
        solve(str);
    }
}
