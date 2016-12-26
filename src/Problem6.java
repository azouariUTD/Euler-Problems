/**
 * Created by ahmedzouari on 12/25/16.
 */
public class Problem6 {
    public static void main (String [] args) {

        long sumOfSqr = 0;
        long sumSqr = 0;
        for (long i =1 ; i < 101 ; i++) {
            sumOfSqr += Math.pow(i,2);
            sumSqr += i;
            }

            System.out.println(sumSqr*sumSqr - sumOfSqr);
    }
}
