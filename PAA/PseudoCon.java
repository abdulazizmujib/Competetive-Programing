/**
 * PseudoCon
 */
import java.util.*;
public class PseudoCon {

    public static void main(String[] args) {
        //ganjil
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i%2==1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}