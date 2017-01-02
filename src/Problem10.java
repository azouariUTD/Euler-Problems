/**
 * Created by ahmedzouari on 1/1/17.
 */
public class Problem10 {
    public static void main (String [] args) {
        long sum =0;
        for (int i = 0 ; i < 2000000 ; i++) {
            if (Problem3.isPrime(i)) {
                sum +=i;
            }
        }

        System.out.println(sum);
    }
}
