package streams.caesar;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * https://codereview.stackexchange.com/questions/36884/critique-of-filterinputstream-and-filteroutputstream-classes
 */
public class EncryptionDecryptionTest {

    public static void main(String[] args) throws IOException {

        String testStr = "Vicky is the best! <3";

        int key = 123;

        String encryptedText = encrypt(testStr, key);
        System.out.println("Enrypted Text: " + encryptedText);

        String decryptedText = decrypt(encryptedText, key);
        System.out.println("Decrypted Text: " + decryptedText);

    }

    private static String encrypt(String textToEncrypt, int key) throws IOException {

        InputStream in = new ByteArrayInputStream(textToEncrypt.getBytes(StandardCharsets.UTF_8));
        OutputStream out = new ByteArrayOutputStream();
        ShiftCipherOutputStream encryptOut = new ShiftCipherOutputStream(out);

        encryptOut.setKey(key);

        int b;
        while ((b = in.read()) != -1) {
            encryptOut.write(b);
        }

        String encrypted = out.toString();

        in.close();
        encryptOut.close();

        return encrypted;
    }

    private static String decrypt(String textToDecrypt, int key) throws IOException {
        InputStream in = new ByteArrayInputStream(textToDecrypt.getBytes(StandardCharsets.UTF_8));
        ShiftCipherInputStream decryptIn = new ShiftCipherInputStream(in);
        decryptIn.setKey(key);

        OutputStream out = new ByteArrayOutputStream();

        int b;
        while ((b = decryptIn.read()) != -1) {
            out.write(b);
        }

        String decryptedText = out.toString();

        decryptIn.close();
        out.close();

        return decryptedText;
    }
}
