public class Fibonacci {

    public static int Fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int prev=Fibo(n-1);
        int prevprev=Fibo(n-2);
        return prev + prevprev;
    }
    public static void main(String[] args) {
        // System.out.println(Fibo(3));

        for(int i=0;i<=10;i++){
            System.out.println(Fibo(i));
        }
    }
}
