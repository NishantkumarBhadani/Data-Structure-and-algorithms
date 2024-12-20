import java.util.Scanner;

public class PascelTriandle {

    static void printMatrix(int [][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] pascel(int n){
        int matrix[][]=new int[n][];
        for(int i=0;i<n;i++){
            //for making jagged array
            matrix[i]=new int[i+1];
            //first and last element is 1
            matrix[i][0]=matrix[i][i]=1;

            for(int j=1;j<i;j++){
                matrix[i][j]=matrix[i-1][j-1]+matrix[i-1][j];
                
            }
            
            
        }
        return matrix;
        
    
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int n=sc.nextInt();
        int ans[][]=pascel(n);
        printMatrix(ans);
    }
}
