import java.util.*;
public class AddTwoMatrix {

    public static void printArray(int sum[][],int r1,int c1){
        System.out.println("So the resultant matrix after addition:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void AddMatrix(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("For addition row and columns of each matrix must be same");
            return;
        }
        int sum[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        printArray(sum, r1, c1);       
    }

    public static void MultiplyTwoMatrix(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2){
        if(c1!=r2){
            System.out.println("Invalid matrix size");
            return;
        }

        int mul[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    mul[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("So the reultant matrix is:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
               System.out.print(mul[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and column of matrix 1:");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int arr1[][]=new int[r1][c1];
        System.out.println("Enter the element of matrix1:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                 arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter number of rows and column of matrix 2:");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];
        System.out.println("Enter the element of matrix1:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                 arr2[i][j]=sc.nextInt();
            }
        }
        // AddMatrix(arr1, r1, c1, arr2, r2, c2);
        MultiplyTwoMatrix(arr1, r1, c1, arr2, r2, c2);

    }
}
