// package Recursion_On_Array;

// import java.util.Scanner;

// public class reverseArrray {

//     public static void swap(int arr[],int left,int right){
//         int temp;
//         temp=arr[left];
//         arr[left]=arr[right];
//         arr[right]=temp;
//     }

//     public static void reverseArrrayElement(int arr[],int left,int right){
//         if(left>=right){
//             return;
//         }
//         //self work
//         swap(arr, left, right);

//         //recursive work 
//         reverseArrrayElement(arr, left+1, right-1);

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter no. of elments:");
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         reverseArrrayElement(arr, 0, n-1);
//         for(int i=0;i<n;i++){
//             System.out.println(arr[i]);
//         }

//     }
// }


package Recursion_On_Array;

import java.util.Scanner;

public class ReverseArray {

    public static void swap(int arr[], int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static int[] reverseArrayElement(int arr[], int left, int right) {
        if (left >= right) {
            return arr; // Base case: Return the modified array
        }
        
        // Swap elements
        swap(arr, left, right);

        // Recursive call
        return reverseArrayElement(arr, left + 1, right - 1);
    }

    //using only one pointer
    public static int[] reverseArrayElementusingOnePointer(int arr[],int i){
        int n=arr.length;

        if(i>=n/2) return arr;

        swap(arr, i, n-i-1);

        return reverseArrayElementusingOnePointer(arr, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // // Reverse the array and store the result
        // arr = reverseArrayElement(arr, 0, n - 1);

        // // Print reversed array
        // System.out.println("Reversed array:");
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }

         // Reverse the array and store the result
         arr = reverseArrayElementusingOnePointer(arr, 0);

         // Print reversed array
         System.out.println("Reversed array:");
         for (int num : arr) {
             System.out.print(num + " ");
         }

        sc.close(); // Close scanner to avoid resource leak
    }
}

