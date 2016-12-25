import org.jetbrains.annotations.Contract;

/**
 * Created by ahmedzouari on 12/24/16.
 */
public class Problem3 {

    public static void main (String [] args) {
        long p = 600851475143L;
        int max = 0;
        for (int i = 100 ; i < Math.sqrt(p) ; i++) {
            if (isPrime(i) && (p%i==0)) {
                max = i;
            }
        }

        System.out.println(max);


    }

    @Contract(pure = true)
    public static boolean isPrime(int n) {
        if (n<=1) {
            return false;
        } else if (n<=3) {
            return true;
        } else if ((n%2)==0 || (n%3)==0) {
            return false;
        }

        int i = 5;
        while (i*i <=n) {
            if ((n%i==0) || (n%(i+2)==0)) {
                return false;
            }
            i += 6;
        }

        return true;



    }
}
