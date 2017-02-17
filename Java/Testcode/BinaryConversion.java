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

    public static int binaryToInt(StringBuilder input) {
        int j = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                j = j + (int) Math.pow(2, input.length() - 1 - i);

            }
        }
        return j;
    }

    public static StringBuilder intToBinary(int input) {
        StringBuilder s = new StringBuilder();
        int x = input;


        while (x > 0) {
            int r = x % 2;
            s.append(r);
            x = x / 2;
        }
        return s.reverse();
    }

    public static void main(String[] args) {
        String beta;
        Scanner input = new Scanner(System.in);
        int alpha = 432;
//        System.out.println(Integer.toBinaryString(10));
        System.out.println(intToBinary(10));
        System.out.println("The number is: " + binaryToInt(intToBinary(10)));
        System.out.println("The size? is: " + intToBinary(10).length());
//        System.out.println("Please enter a binary number");
//        beta = input.nextLine();
//        System.out.println("The Binary number you entered is: " + binaryToInt(beta));
//        System.out.println("Please enter a number or word");
//        beta = input.nextLine();
//        System.out.println("The number or word you entered is " + stringToBinary(beta) + " in Binary");

//        System.out.println(Integer.toBinaryString(61));
//        System.out.println(binaryToInt(gamma));
//        System.out.println(Integer.parseInt(beta, 2));
    }
}
