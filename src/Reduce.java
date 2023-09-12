/**
 *     n = 100
 *     steps = 0
 *     while n != 0:
 *         if n % 2 == 0:  # if n is divisible by 2/ even
 *             n = n / 2
 *         else:
 *             n = n - 1
 *         steps += 1
 *     return steps
 *
 */
public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int steps = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n = n / 2;
            }
            else {
                n = n -1;
            }
            steps += 1;
        }
        System.out.print(steps);

    }
}
