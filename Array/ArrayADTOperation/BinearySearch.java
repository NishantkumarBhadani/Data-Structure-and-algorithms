import java.util.Scanner;

public class BinearySearch {

    public static int FindByBinearySearch(int arr[],int target){
        int low=0;
        int high=arr.length-1;
      
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else if(target<arr[mid]){
                high=mid-1;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to find:");
        int target=sc.nextInt();
        int result=FindByBinearySearch(arr,target);
        if(result==-1){
            System.out.println("Element is not present in the array.");
        }
        else{
            System.out.println("Element is found at index number:"+(result+1));
        }

    }
}
