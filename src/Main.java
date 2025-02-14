import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] arr={64,25,12,22,11,9,54};
        int n=arr.length;

        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;

            while (j>=0 &&arr[j]>key){
                arr[j+1]=arr[j];
                j--;


            }
            arr[j+1]=key;
            for(int p:arr){
                System.out.print(p+" ");
            }
            System.out.println();
        }
        // something is wrong sure...
        System.out.println("aba k??");
        System.out.println("feri???");





    }
}