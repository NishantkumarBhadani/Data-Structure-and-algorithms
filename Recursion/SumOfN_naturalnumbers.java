public class SumOfN_naturalnumbers {


    //non parameterised
    public static int sumofNaturalNumbers(int n){
        if(n==0){
            return 0;
        }
        return sumofNaturalNumbers(n-1)+n;
    }

    //parameterised
    public static void sumofNaturalNumbers2(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        sumofNaturalNumbers2(n-1, sum+n);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumofNaturalNumbers(n));
        sumofNaturalNumbers2(5, 0);
    }
}
