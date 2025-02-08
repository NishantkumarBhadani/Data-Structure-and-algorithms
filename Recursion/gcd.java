import java.util.Scanner;

public class gcd {
    public static int calculateGcd(int x,int y){
        if(y==0){
            return x;
        }
        return calculateGcd(y, x%y);
    }
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println(calculateGcd(x,y));
    }
}
