public class addStringDigit {

    public static int sum(String str){
        String tempSum="0";
        int sum=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                tempSum+=ch;
            }
            else{
                sum+=Integer.parseInt(tempSum);
                tempSum="0";
            }
        }
        return sum+Integer.parseInt(tempSum);//Because in else condition if char is find then only we are adding this handles if atlast only digits are present
    }
    public static void main(String[] args) {
        String str="12ab268";
        System.out.println(sum(str));

    }
}
