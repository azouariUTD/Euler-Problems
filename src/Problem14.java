/**
 * Created by ahmedzouari on 1/4/17.
 */
public class Problem14 {

    public static void main(String [] args) {

        long result;
        int count = 0;
        int maxCount = 0;
        int maxNum = 0;


        for (int i = 2 ; i < 1000000 ; i++) {
            count=0;
            result = i;
        while (result!=1) {
            if (result%2==0) {
                result = result/2;
                count++;
            } else {
                result = 3 * result + 1;
                count++;
            }

        }

        if (count>maxCount) {
            maxCount = count;
            maxNum = i;
        }


        }

        System.out.println(maxNum + " " + count);
    }
}
