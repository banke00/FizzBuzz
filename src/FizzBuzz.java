/**
 * Solve the FizzBuzz challenge.
 * Notes of things that stand out:
 * - {} these being around everything
 * - writing out boolean in words,
 * - calling on system
 * no ':' after if
 *
 *
 *     i = 1
 *     while i < 100:
 *         if i % 3 == 0 and i % 5 == 0:
 *             print('Fizz Buzz')
 *         elif i % 3 == 0:
 *             print('Fizz')
 *         elif i % 5 == 0:
 *             print('Buzz')
 *         else:
 *             print(i)
 *         i += 1
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 1;

        while (i < 100) { // always put stuff in brackets after while and for loops

            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {
            System.out.println("Fizz Buzz");
        } else if (divisibleBy3) {
            System.out.println("Fizz");
        } else if (divisibleBy5) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }

        i = i + 1; // increment statement
        return i;
    }
}
