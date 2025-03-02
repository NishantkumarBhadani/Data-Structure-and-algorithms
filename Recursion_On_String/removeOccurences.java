package Recursion_On_String;

import java.util.Scanner;

public class removeOccurences {

    public static String removeA(String str,int idx){

        //base case
        if(idx==str.length()){
            return " ";
        }

        //recusive work
        String smallAns=removeA(str, idx+1);

        char currChar=str.charAt(idx);
        if(currChar!='a'){
            return currChar+smallAns;
        }
        else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int idx=0;
        System.out.println(removeA(str,idx));
    }
}
