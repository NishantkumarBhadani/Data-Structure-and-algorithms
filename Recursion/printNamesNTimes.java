public class printNamesNTimes {

    public static void printNames(int i,int n){
        if(i>n) return;

        System.out.println("Nishant");

        printNames(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int i=1;
        printNames(i, 10);
    }
}
