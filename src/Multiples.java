/** We're looking for non-negative multiples of 3 or 5. The first four are 3, 5, 6, and 9, so there are
 four below 10. How many are below 1000?
 count = 0

 for i in range(1, 1000):
 if i % 3 == 0 or i % 5 == 0:
 count += 1

 print(f"The number of multiples of 3 and 5 under 1000 is: {count}")

 */
public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                count = count + 1;
            }
        }
        System.out.print(count);
    }

}
