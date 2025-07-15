import java.util.Scanner;

public class SecondLargestElement {
    public static void findSecondLargest(int arr[]){
        int first=arr[0];
        int second=arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
        }
        System.out.println("Second largest is:"+second);
    }
    public static int secondSmalles(int arr[]){
        int small=arr[0];
        int second_small=arr[1];
        for (int i = 0 ;i < arr.length; i++){
            if(arr[i]<small){
                second_small=small;
                small=arr[i];
            }
            else if(arr[i]<second_small && arr[i]!=small){
                second_small=arr[i];
            }
        }
        return second_small;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        findSecondLargest(arr);
        System.out.println(secondSmalles(arr));

    }
}
