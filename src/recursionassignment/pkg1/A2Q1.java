/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionassignment.pkg1;

import java.util.Scanner;

/**
 *
 * @author ratid6445
 */
public class A2Q1 {

    public int digitalSum(int n) {
        // if the number is a single digit return that digit since you don't need to add any digits together
        if (n >= 0 && n <= 9) {
            // return the single digit
            return n;
        }
        // if the number is not a single digit 
        // create a mod integer to yield the rightmost digit
        int mod = n % 10;
        // create a divide integer to remove the rightmost digit
        int divide = n / 10;
        // create a sum integer that goes through mod and divide 
        // recursively happen until all the digits are added together
        int sum = mod + digitalSum(divide);
        // return the sum 
        return sum;
    }

    public int digitalRoot(int n) {
        // create an integer that stores the sum of the digits that
        n = digitalSum(n);
        // if digitalSum is a single digit return that digit
        if (n >= 0 && n <= 9) {
            // return the digitalSum
            return n;
        }
        // if the digitalSum is not a single digit
        // create a mod and divide integer to go through all the digits in the digitalSum
        int mod = n % 10;
        int divide = n / 10;
        // add the digits in the digitalSum together
        int ans = mod + digitalRoot(divide);
        // return the root
        return ans;
    }

    public int triangle(int n) {
        // if n is 0 or 1 than return that digit
        if (n == 0 || n == 1) {
            // return 0 or 1
            return n;
        }
        // if n is not 0 or 1
        // start at n and subtract one each time until it gets to 1
        int ans = n + triangle(n - 1);
        // return the answer of the triangle
        return ans;
    }

    public void hailstone(int n) {
        // output the next number in the sequence each time
        System.out.println(n);
        // if the number is 1, stop the sequence
        if (n == 1) {
            // stop the sequence
            return;
        }
        // if n can be divided by 2 evenly
        if (n % 2 == 0) {
            // if n is an even number than divide by 2
            hailstone(n / 2);
        } // if its not an even number
        else {
            // equation for odd number to get the next number in the sequence
            hailstone(3 * n + 1);
        }
    }

    public String binaryConvert(int n) {
        // create a string to hold the binary number
        String binary = new String();
        // if n can be divided by 2 evenly the quotient would be 0
        if (n % 2 == 0) {
            // output the remainder of 0
            binary = ("0");
        } // if it cannot be divided evenly into 2
        else {
            // return 1 as the remainder for odd numbers
            binary = ("1");
        }
        // if the number is 1, stop the sequence
        if (n == 1) {
            // stop the sequence
            return binary;
        }
        // scan in inputted number, first divide by 2 
        // then show whether there is a remainder or not
        String answer = binaryConvert(n / 2) + binary;
        // output the binary each time
        return answer;
    }

    public void convert(int n, int b){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A2Q1 test = new A2Q1();
        int answer = test.digitalSum(1234567);
        System.out.println(answer);
        int ans2 = test.digitalRoot(1234567);
        System.out.println(ans2);
        int ans3 = test.triangle(3);
        System.out.println(ans3);
        test.hailstone(5);
        String ans = test.binaryConvert(156);
        System.out.println(ans);

    }
}
