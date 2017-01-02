/**
 * Created by ahmedzouari on 1/1/17.
 */
public class Problem9 {
    public static void main (String [] args) {
        outerloop:
        for (int i = 1 ; i < 1000 ; i++) {
            for (int j = 2 ; j < 1000; j++) {
                for (int k = 3 ; k < 1000; k++) {
                    if (((i*i + j*j)) == k*k && ((i+j+k)==1000)) {
                        System.out.println( i + " + "  + j + " + " + k + " = " + "1000");
                        System.out.println(i*j*k);
                        break outerloop;
                    }
                }
            }
        }
    }
}



