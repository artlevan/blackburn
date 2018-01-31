/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.edu.blackburn.cs.cs355sp18.levan.security;

import java.math.BigInteger;
import java.util.Base64;
import java.util.Scanner;

/**
 *
 * @author Arthur Levan
 */
public class Interface {

    private Scanner input = new Scanner(System.in);
    public String choice;
    public String algorithm;
    public String decode;
    public byte[] arr;
    private RC4 rc = null;
    private TEA tea;
    BigInteger bi;
    BigInteger be;
    private byte[] tArr = new byte[16];
    private Base64.Decoder dec = Base64.getDecoder();
    private Base64.Encoder enc = Base64.getEncoder();

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public byte[] getArr() {
        return arr;
    }

    public void setArr(byte[] arr) {
        this.arr = arr;
    }

    public void setup() {
        this.choice = input.nextLine();
        this.arr = this.choice.getBytes();
    }

    public void run(String select) {
        if (select.equalsIgnoreCase("T")) {
            runTEA();
        } else {
            runRC4();
        }
    }

    public void runRC4() {
        //Key Setup
        rc4Key();

        //Encryption
        System.out.print("Enter the Plaintext: ");
        setup();
        setArr(rc.encrypt(getChoice().getBytes()));
        System.out.println("The Ciphertext is: " + enc.encodeToString(getArr()));

        //Re-Enter Key
        rc4Key();

        //Decryption
        System.out.print("Enter the Ciphertext: ");
        setup();
        setArr(dec.decode(getChoice().getBytes()));
        decode = new String(rc.decrypt(getArr()));
        System.out.println("The Plaintext is: " + decode);
    }

    private void rc4Key() {
        System.out.println("");
        System.out.print("Enter a key: ");
        setup();
        rc = new RC4(getArr());
    }

    public void runTEA() {
        //Setup
        System.out.println("");
        System.out.print("Enter a key: ");
        setup();
        if (this.arr.length > 16) {
            throw new RuntimeException("Invalid key: Length was larger than 16 bytes");
        }
        System.arraycopy(choice.getBytes(), 0, tArr, 0, choice.getBytes().length);
        tea = new TEA(tArr);
        
        //Encryption
        System.out.print("Enter the Plaintext: ");
        setup();
        bi = new BigInteger(arr);
        be = tea.encrypt(bi);
        arr = be.toByteArray();
        System.out.println("The Ciphertext is: " + enc.encodeToString(arr));
        
        //Decryption
        System.out.println("");
        System.out.print("Enter the Ciphertext: ");
        setup();
        bi = new BigInteger(dec.decode(arr));
        choice = new String(tea.decrypt(bi));
        System.out.println("The Decrypted text is: " + choice);

    }

}
