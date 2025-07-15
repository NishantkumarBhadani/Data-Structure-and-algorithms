public class reverseString {

    public static String reverse(String str){
        int start=0;
        int end=str.length()-1;
        StringBuilder sb=new StringBuilder(str);

        while(start<end){
            // char temp=str.charAt(start);
            sb.setCharAt(start, str.charAt(end));
            sb.setCharAt(end, str.charAt(start));
            start++;
            end--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="Hello mr nishant";
        System.out.println(reverse(str));
    }
}
