import java.math.BigInteger;

/**
 * Created by ahmedzouari on 1/8/17.
 */
public class Problem16 {
    public static void main (String [] args) {
        BigInteger c = new BigInteger("2");
        String cStr = c.pow(1000).toString();
        int sum = 0;

        for (int i = 0 ; i < cStr.length() ; i++) {
           sum += Integer.valueOf(String.valueOf(cStr.charAt(i)));
        }

        System.out.println(sum);
    }
}
