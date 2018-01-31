/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.edu.blackburn.cs.cs355sp18.levan.security;

/**
 *
 * acquired from https://stackoverflow.com/questions/12289717/rc4-encryption-java
 * credit to user: Maarten Bodewes
 */
public class RC4 {
    private final byte[] S = new byte[256];
    private final byte[] T = new byte[256];
    private final int keylen;

    //Intialization using KSA
    public RC4(final byte[] key) {
        if (key.length < 1 || key.length > 256) {
            throw new IllegalArgumentException(
                    "Key must be between 1 and 256 bytes");
        } else {
            keylen = key.length;
            for (int i = 0; i < 256; i++) {
                S[i] = (byte) i;
                T[i] = key[i % keylen];
            }
            int j = 0;
            byte tmp;
            for (int i = 0; i < 256; i++) {
                j = (j + S[i] + T[i]) & 0xFF;
                tmp = S[j];
                S[j] = S[i];
                S[i] = tmp;
            }
        }
    }
    //Encryption using PRGA
    public byte[] encrypt(final byte[] plaintext) {
        final byte[] ciphertext = new byte[plaintext.length];
        int i = 0;
        int j = 0;
        int k = 0;
        int t = 0;
        byte tmp;
        for (int counter = 0; counter < plaintext.length; counter++) {
            i = (i + 1) & 0xFF;
            j = (j + S[i]) & 0xFF;
            tmp = S[j];
            S[j] = S[i];
            S[i] = tmp;
            t = (S[i] + S[j]) & 0xFF;
            k = S[t];
            ciphertext[counter] = (byte) (plaintext[counter] ^ k);
        }

        return ciphertext;
    }
    //Decryption
    public byte[] decrypt(final byte[] ciphertext) {
        return encrypt(ciphertext);
    }
}
    
