public class Palindrom {

    public static boolean checkPalin(String s,int i){

        int n=s.length();
        if(i>=n/2) return true;

        if(s.charAt(i)!=s.charAt(n-i-1)) return false;

        return checkPalin(s, i+1);
    }
    public static void main(String[] args) {
        String s ="madam";
        System.out.println(checkPalin(s, 0));
        
    }
}
