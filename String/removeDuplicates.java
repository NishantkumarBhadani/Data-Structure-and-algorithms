public class removeDuplicates {

    public static String duplicate(String str){
        String ans="";
        boolean map[]=new boolean[26];
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           if(ch>='a'&& ch<='z'){
             if(map[ch-'a']==false){
                ans+=ch;
                map[ch-'a']=true;
            } 
           } 
        }
        return ans;
    }

    public static void printDuplicates(String str){
        String ans="";
        boolean map[]=new boolean[26];
        str=str.toLowerCase();
        for(int i =0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){
                if(map[ch-'a']==true){
                    ans+=ch;
                }
                else{
                    map[ch-'a']=true;
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String str="Hrllo broooo";
        System.out.println(duplicate(str));
        // printDuplicates(str);
        
    }
}
