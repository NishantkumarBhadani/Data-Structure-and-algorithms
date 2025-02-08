public class multiplePrinting {
    public static void printMultiple(int n,int k){
        if(k==1){
            System.out.println(n);
            return;
        }
        printMultiple(n, k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        int n=5;
        int k=4;
        printMultiple(n, k);
    }
}
