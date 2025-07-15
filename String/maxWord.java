public class maxWord {

    public static String max(String s){
        int max_start=0;
        int i=0,j=0;
        int len=s.length();
        int max_length=0;
        String maxWord="";

        while(j<=len){
            if(j<len && s.charAt(j)!=' '){
                j++;
            }
            else{
                int curr_length=j-i;
                if(curr_length>max_length){
                    max_length=curr_length;
                    max_start=i;
                }
                j++;
                i=j;
            }
            
        }
        maxWord=s.substring(max_start,max_start+max_length);
        return maxWord;
    }
    public static void main(String[] args) {
        String str="Hello my baby i am yorrrrrr";
        System.out.println(max(str));
    }
}
