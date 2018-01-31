package Java.edu.blackburn.cs.cs355sp18.levan.security;

import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;

public class TEA {
//"8916930267" "319480393" "0056929269" 2194642297"

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
        int[] ar = new int[4];
        int j, i;
        for (i = 0, j = 0; j < key.length; j += 4, i++) {
            ar[i] = (key[j] << 24) | (((key[j + 1]) & 0xff) << 16) | (((key[j + 2]) & 0xff) << 8) | ((key[j + 3]) & 0xff);
        }
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

    public static void main(String[] args) {
        TEA t;
        String s;
        BigInteger bi;
        BigInteger be;
        byte[] ar = new byte[16];

        Base64.Decoder dec = Base64.getDecoder();
        Base64.Encoder enc = Base64.getEncoder();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a key: ");
        s = input.nextLine();
        System.arraycopy(s.getBytes(), 0, ar, 0, s.getBytes().length);
        t = new TEA(ar);

        System.out.print("Enter a Plaintext: ");
        s = input.nextLine();
        ar = s.getBytes();
        bi = new BigInteger(ar);
        be = t.encrypt(bi);
        ar = be.toByteArray();
        System.out.println("The Ciphertext says: " + enc.encodeToString(ar));

        System.out.print("Enter the Ciphertext: ");
        s = input.nextLine();
        ar = dec.decode(s.getBytes());
        bi = new BigInteger(ar);
        s = new String(t.decrypt(bi));
        System.out.println("The Decrypted String says: " + s);

    }

}
