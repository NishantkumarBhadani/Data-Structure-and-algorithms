public class countWords {

    public static int countWord(String s){
        int count=0;
        s=s.trim();
        int len=s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        return  count+1;

    }
    public static void main(String[] args) {
        String str="Hello world you ";
        System.out.println(countWord(str));
    }
}
