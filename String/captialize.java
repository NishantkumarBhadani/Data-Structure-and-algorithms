public class captialize {

    public static String doCapital(String str){
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            if((i==0 || i==str.length()-1) && ((int) str.charAt(i)>=97) ){
                sb.setCharAt(i, (char)((int) str.charAt(i)-32));
            }else if(str.charAt(i)==' '){
                if(i-1>0){
                    char prev=str.charAt(i-1);
                    if(prev>='a' && prev<='z'){
                        sb.setCharAt(i-1, (char)(prev-32));
                    }
                }
                if(i+1<str.length()){
                    char next=str.charAt(i+1);
                    if(next>='a' && next<='z'){
                        sb.setCharAt(i+1, (char)(next-32));
                    }
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="Hyy I am nishant";
        System.out.println("String after capitalizing the first and last letter of each word:");
        System.out.println(doCapital(str));

    }
}
