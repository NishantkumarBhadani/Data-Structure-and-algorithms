package Recursion_On_Array;

import java.util.ArrayList;

public class subsequences {

    public static void printAllSubsequences(int arr[],ArrayList<Integer> list,int n,int i){
        if(i==n){
            System.out.println(list);
            return;
        }
        list.add(arr[i]);
        printAllSubsequences(arr, list, n, i+1);
        list.remove(list.size()-1); //correctly remove the last added element 
        printAllSubsequences(arr, list, n, i+1);
    }
    public static void main(String[] args) {
        int arr[]={4,5,6};
        int i=0;
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        printAllSubsequences(arr, list, n, i);
    }
}
