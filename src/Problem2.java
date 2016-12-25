/**
 * Created by ahmedzouari on 12/24/16.
 */
public class Problem2 {
    public static void main (String[] args) {

        int a[] = new int[100];
        int limit = 4000000;
        a[0] = 0;
        a[1] = 1;
        int sum = 0;
        for (int i = 2 ; a[i] < 20 ; i++) {
            a[i] = a[i-2] + a[i-1];
            if (a[i]%2==0 && a[i] < limit) {
                sum += a[i];
            }
            if (a[i] > limit) {
                System.out.println(sum);
                break;
            }

        }

    }
}
