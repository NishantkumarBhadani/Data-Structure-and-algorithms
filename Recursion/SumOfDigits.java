public class SumOfDigits {

    public static int SumOfN_Digit(int n) {
        if(n>=0 && n<=9){
            return n;
        }

        return SumOfN_Digit(n/10) + n%10;
    }
    public static void main(String[] args) {
        System.out.println(SumOfN_Digit(125));
    }
}
