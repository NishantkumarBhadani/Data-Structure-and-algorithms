public class nextLexographical {

    public static String lexo(String s){
        StringBuilder sb=new StringBuilder();
        // s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if((ch>='a' && ch<='y')||(ch>='A' && ch<='Y')){
                sb.append((char)(ch+1));
                //sb.insert(i,(char)(ch+1));
            }
            else if(ch=='Z'){
                sb.append('A');
            }
            else if(ch=='z'){
                sb.append('a');
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="AVdfsez dfshfuesz";
        System.out.println(lexo(str));
    }
}
