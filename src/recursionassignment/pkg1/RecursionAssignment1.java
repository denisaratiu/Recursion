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
public class RecursionAssignment1 {

    public int digitalSum(int n) {
        // if the number is a single digit return that digit
        if (n >= 0 && n <= 9) {
            // return the single digit
            return n;
            // if the number is not a single digit 
        } 
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       RecursionAssignment1 test = new RecursionAssignment1();
       int answer = test.digitalSum(24);
        System.out.println("The sum of the integers in the number 24 is " + answer);
    }
}
