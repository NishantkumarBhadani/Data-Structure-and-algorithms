import java.util.Scanner;

public class LargestElement {
    public static void findLargest(int arr[]){
        int max=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]<max)
                continue;
            else
                max=arr[i];    
        }
        System.out.println("Maximum number:"+max);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        findLargest(arr);

    }
}
