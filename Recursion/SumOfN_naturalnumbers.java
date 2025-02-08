public class SumOfN_naturalnumbers {

    public static int sumofNaturalNumbers(int n){
        if(n==0){
            return 0;
        }
        return sumofNaturalNumbers(n-1)+n;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumofNaturalNumbers(n));
    }
}
