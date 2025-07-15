
import java.util.ArrayList;
import java.util.TreeSet;

public class unionOfSortedArray {
    //Brut force
    public static void union(int arr1[],int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        TreeSet<Integer>temp=new TreeSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n1;i++){
            temp.add(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            temp.add(arr2[i]);
        }
        for(int val:temp){
            ans.add(val);
        }
        System.out.println("Union array:");
        for(int num:ans){
            System.out.println(num);
        }
    }
    public static ArrayList<Integer> optimal(int a1[],int a2[]){
        int i=0,j=0;
        int n1=a1.length;
        int n2=a2.length;
        ArrayList<Integer> ans=new ArrayList<>();
        while(i<n1 && j<n2){
            if(a1[i]<=a2[j]){
                if(ans.size()==0 || !ans.contains(a1[i])){
                    ans.add(a1[i]);
                }
                i++;
            }
            else{
                 if(ans.size()==0 || !ans.contains(a2[j])){
                    ans.add(a2[j]);
                }
                j++;
            }
        }
        while(i<n1){
             if(ans.size()==0 || !ans.contains(a1[i])){
                    ans.add(a1[i]);
                }
                i++;
        }
        while(j<n2){
             if(ans.size()==0 || !ans.contains(a2[j])){
                    ans.add(a2[j]);
                }
                j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,4,2};
        int arr2[]={2,2,4,5,6};
        // union(arr1, arr2);
        ArrayList<Integer> res=optimal(arr1, arr2);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }

    }
}
