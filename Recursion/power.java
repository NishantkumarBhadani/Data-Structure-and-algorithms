public class power {

    public static int pow(int p,int q){

        //Ist approch O(q)
        // if(q==0){  //Base Case
        //     return 1;
        // }
        // return pow(p,q-1)*p;

        if(q==0){
            return 1;
        }
        if(q%2==0){
            int smallest=pow(p,q/2);
            return smallest*smallest;
        }
        else{
            int smallest=pow(p,q/2);
            return smallest*smallest*p;
        }

    }
    public static void main(String[] args) {
        int p=5;
        int q=5;
        System.out.println(pow(p, q));
    }
}
