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
    
    public int digitalRoot(int n){
        // create an integer that stores the sum of the digits that
        int sumOfDigits = digitalSum(n);
        // if digitalSum is a single digit return that digit
        if (sumOfDigits >= 0 && sumOfDigits <= 9) {
            // return the digitalSum
            return sumOfDigits;
        } 
        // if the digitalSum is not a single digit
        // create a mod and divide integer to go through all the digits in the digitalSum
        int mod2 = sumOfDigits % 10;
        int divide = sumOfDigits / 10;
        // add the digits in the digitalSum together
        int ans = mod2 + digitalRoot(divide);
        // return the root
        return ans;
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
    }
}
