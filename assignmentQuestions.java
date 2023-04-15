import java.util.*;

public class assignmentQuestions {
    public static void main(String[] args) {

        /*
         * Write a program to add 8 to the number x and then divide it by 3. Now, the
         * modulus of the quotient
         * is taken with 5 and then multiply the resultant value by 5. Display the final
         * result.
         */
        Scanner sc = new Scanner(System.in);
        
          int z = sc.nextInt();
          
          int result;
          result = ((((z + 8) / 3) % 5) * 5);
          System.out.println(result);
        
        /*
         * 2345
         * 20
         */

        /* Swap two numbers without the use of third variable. */

        int a = 5, b = 10;

        a = a + b; // 15
        b = a - b;// 15-10 = 5
        a = a - b; // 15 -5 = 10

        System.out.println("a : " + a + "  b: " + b);

        /* Write a program to calculate the sum of the digits of a 3-digit number. */

        int num = 132;

        int sum = 0;
        while (num > 0) {
            sum += (num % 10);
            num /= 10;

        }
        System.out.println(sum);

        /*
         * Assign values of variables 'a' and 'b' as 55 and 70 respectively and then
         * check if:
         * i) both the conditions 'a < 50' and 'a < b' are true.
         * ii) at least one of the conditions 'a < 50' or 'a < b' is true.
         */

        int a1 = 55, b1 = 70;
        System.out.println((a1 < 50) && (a1 < b1));

        /* Find the total number of bits needed to be flipped to convert x to y. */

        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = x ^ y;
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.print(count);

        /* 2 */
    }

}