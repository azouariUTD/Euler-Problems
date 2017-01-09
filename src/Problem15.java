/**
 * Created by ahmedzouari on 1/5/17.
 */
public class Problem15 {

    public static void main (String [] args) {
        long result = 1;

        for (int i =1 ; i <=20 ; i++) {
            result = result * (20 +i)/i;
        }

        System.out.println(result);
    }
}
