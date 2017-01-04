/**
 * Created by ahmedzouari on 1/3/17.
 */


public class Problem12 {
    public static void main (String [] args) {
        int tNumber = 0;
        int count = 0;
        int limit = 0;
        outerloop:
        for (int i = 1 ; i < Integer.MAX_VALUE ; i ++) {
            tNumber +=i;
            count = 0;



            limit = (int) Math.sqrt(tNumber);
            if (limit*limit == tNumber) {
                count--;
            }
            for (int j = 1 ; j <= limit ; j++) {

                if (tNumber%j==0) {
                    count +=2;
                }

                if (count == 500) {
                    System.out.println(tNumber + " " + count);
                    break outerloop;
                }




            }







        }


    }
}
