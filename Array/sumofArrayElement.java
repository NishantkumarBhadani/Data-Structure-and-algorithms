
import java.util.stream.IntStream;

public class sumofArrayElement {
    public static void main(String[] args) {
        int arr[]={5,8,4,1,18};
        int sum=IntStream.of(arr).sum();
        System.out.println(sum);
    }
}
