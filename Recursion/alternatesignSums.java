public class alternatesignSums {

    public static int alternatesignSumsfunc(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return alternatesignSumsfunc(n-1)-n;
        }
        else{
            return alternatesignSumsfunc(n-1)+n;
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(alternatesignSumsfunc(n));
    }
}
