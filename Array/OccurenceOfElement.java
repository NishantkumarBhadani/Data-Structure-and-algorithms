import java.util.Scanner;

public class OccurenceOfElement {

    public static void Occurence(int arr[],int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                count++;
            else
                continue;    
        }
        System.out.println("Occurence of target element:" + count);
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int target=sc.nextInt();
        Occurence(arr,target);

    }
}
