package Recursion_On_Array;

import java.util.ArrayList;

public class findAllIndices {

    public static ArrayList<Integer> findAllIndicesOfElement(int arr[],int idx,int n,int target){
        if (idx>=n) {
            return new ArrayList<>();
        }

        ArrayList<Integer> ans=new ArrayList<>();
        if(arr[idx]==target){
            ans.add(idx);
        }

        ArrayList<Integer>smallans=findAllIndicesOfElement(arr, idx+1, n, target);
        ans.addAll(smallans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,4,7,8,7, 5 , 8 ,7 , 2};
        int idx=0;
        int target=7;
        int n=arr.length;
        
        ArrayList<Integer> ans=findAllIndicesOfElement(arr, idx, n, target);
        System.out.println(ans);
    }
}
