/**
 * Created by ahmedzouari on 12/29/16.
 */
public class Problem7 {

    public static void main (String [] args) {
        int counter = 0 , i = 1;
        boolean flag = true;
        while (flag) {
            if (Problem3.isPrime(i)) {
                counter++;
            }
            if (counter==10001) {
                System.out.println(i);
                flag = false;
            }
            i++;


        }
    }
}
