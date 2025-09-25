
package loops;
import java.util.*;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int sum = 0;

        int den = 1;

        while (den <= num / 2) {  // Check up to num/2
            if (num % den == 0) {
                sum += den;
            }
            den++;
        }

        if (num == sum) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }

        sc.close();
    }
}
