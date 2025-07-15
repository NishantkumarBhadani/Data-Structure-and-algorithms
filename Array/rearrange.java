
import java.util.Arrays;

//Rearrange the array element in increainng and decreasing order half-half

public class rearrange {
    public static void  rearrangeElement(int arr[],int n){
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++){
            System.out.println(arr[i]);
        }
        for(int i=n-1;i>=n/2;i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,7,7,85,1,8,15,2};
        int n=arr.length;
        rearrangeElement(arr, n);
    }    
}
