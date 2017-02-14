/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testcode;

/**
 *
 * @author arthur.levan
 */
import java.math.BigInteger;
import java.util.*;

public class BinaryConversion {

    public static int binaryToInt(String input) {
        double j = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                j = j + Math.pow(2, input.length() - 1 - i);
            }
        }
        return (int) j;
    }

    public static String stringToBinary(String input) {
        BigInteger process = new BigInteger(input, 16);
        return process.toString(2);
       
    }

    public static void main(String[] args) {
        String beta;
        Scanner input = new Scanner(System.in);
        int alpha = 432;
        System.out.println("Please enter a binary number");
        beta = input.nextLine();
        System.out.println("The Binary number you entered is: " + binaryToInt(beta));
        System.out.println("Please enter a number or word");
        beta = input.nextLine();
        System.out.println("The number or word you entered is " + stringToBinary(beta) + " in Binary");

//        System.out.println(Integer.toBinaryString(61));
//        System.out.println(binaryToInt(gamma));

//        System.out.println(Integer.parseInt(beta, 2));

    }
}
