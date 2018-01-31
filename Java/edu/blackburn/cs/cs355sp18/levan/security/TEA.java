package Java.edu.blackburn.cs.cs355sp18.levan.security;

import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;

public class TEA {

    BigInteger[] key; //128 bit key
    private String merge;
    private final BigInteger delta = new BigInteger("9e3779b9", 16);
    private BigInteger sum = new BigInteger("0");

    public TEA(byte[] key) {
        if (key.length < 16) {
            int buff = 0;
            buff = Math.abs(key.length - 16);
            while (buff != 16) {
                System.out.println(buff);
                key[buff] = 0;
                buff++;

            }
        }
        /*
        * Key method taken from: https://alvinalexander.com/java/jwarehouse/jwebmail-0.7/src/net/wastl/webmail/misc/TEA.java.shtml
         */
        int[] ar = new int[4];
        int j, i;
        for (i = 0, j = 0; j < key.length; j += 4, i++) {
            ar[i] = (key[j] << 24) | (((key[j + 1]) & 0xff) << 16) | (((key[j + 2]) & 0xff) << 8) | ((key[j + 3]) & 0xff);
        }
        //Change new key to BigInteger
        this.key = Arrays.stream(ar).mapToObj(BigInteger::valueOf).toArray(BigInteger[]::new);
    }

    //Encryption
    public BigInteger encrypt(BigInteger plainText) {

        String pt = plainText.toString();
        BigInteger L = new BigInteger(pt.substring(0, pt.length() / 2));
        BigInteger R = new BigInteger(pt.substring(pt.length() / 2, pt.length()));

        for (int i = 0; i < 32; i++) {
            sum = sum.add(delta);
            L = L.add((R.shiftLeft(4).add(key[0])).xor(R.add(sum)).xor(R.shiftRight(5).add(key[1])));
            R = R.add((L.shiftLeft(4).add(key[2])).xor(L.add(sum)).xor(L.shiftRight(5).add(key[3])));
        }
        merge = L.toString() + R.toString();
        BigInteger cipherText = new BigInteger(merge);
        return cipherText;
    }

    //Decryption
    public byte[] decrypt(BigInteger cipherText) {

        String pt = cipherText.toString();
        BigInteger L = new BigInteger(pt.substring(0, pt.length() / 2));
        BigInteger R = new BigInteger(pt.substring(pt.length() / 2, pt.length()));
        sum = delta.shiftLeft(5);

        for (int i = 0; i < 32; i++) {
            R = R.subtract((L.shiftLeft(4).add(key[2])).xor(L.add(sum)).xor(L.shiftRight(5).add(key[3])));
            L = L.subtract((R.shiftLeft(4).add(key[0])).xor(R.add(sum)).xor(R.shiftRight(5).add(key[1])));
            sum = sum.subtract(delta);
        }
        merge = L.toString() + R.toString();
        BigInteger plainText = new BigInteger(merge);
        return plainText.toByteArray();
    }

}
