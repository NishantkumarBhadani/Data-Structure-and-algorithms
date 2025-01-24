package STACK;

import java.util.Scanner;

public class removeExtraBracked {
    public static int removeBracket(String str){
        int open=0,close=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='('){
                open++;
            }
            else{//")"
                if(open>0){
                    open--;
                }
                else{
                    close++;
                }
            }
        }
        return open+close;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("No. of brackets need to remove="+removeBracket(str));
    }
}
