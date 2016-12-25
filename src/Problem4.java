/**
 * Created by ahmedzouari on 12/25/16.
 */
public class Problem4 {
    public static void main(String[] args) {
        int product;
        int maxPalindrome = 0;


        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                product = i * j;


                if ((new StringBuffer(String.valueOf(product)).reverse().toString()).compareTo(String.valueOf(product)) == 0) {
                    if (product > maxPalindrome) {
                        maxPalindrome = product;
                    }


                }
            }

        }
        System.out.println(maxPalindrome);
    }
}
