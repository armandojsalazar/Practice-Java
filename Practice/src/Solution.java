import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        public static int getN(int ){
            System.out.println("Enter a number: ");
            int userInput = Integer.parseInt(scanner.nextLine());

            if (userInput  1) {
                System.out.print("Weird");
            } else if (N % 2 && N >= 2 || N <= 5) {
                System.out.print("Not Weird");
            } else if (N % 2 && N >= 6 || N <= 20) {
                System.out.print("Weird");
            } else {
                System.out.print("Not Weird");
            }
            scanner.close();
        }
    }
}