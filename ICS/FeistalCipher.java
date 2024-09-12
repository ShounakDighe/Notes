package ICS;
import java.util.*;
// Feistal Cipher encrption and Decrption

public class FeistalCipher {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------Feistel Cipher-----------------");
        // Accept input from user
        System.out.print("Enter the plain text (16-bit binary string): ");
        String pt = sc.next();
        System.out.print("Enter the first key (8-bit binary string): ");
        String key1 = sc.next();
        System.out.print("Enter the second key (8-bit binary string): ");
        String key2 = sc.next();

        // Perform encryption and decryption
        String cipherText = encrypt(pt, key1, key2);
        System.out.println("Cipher Text = " + cipherText);
        String plainText = decrypt(cipherText, key1, key2);
        System.out.println("Plain Text = " + plainText);
        
        sc.close();
    }
    
    // Function to compute Feistel value
    public static String fiestel(String r, String key) {
        int rInt = Integer.parseInt(r, 2);
        int keyInt = Integer.parseInt(key, 2);
        int res = rInt ^ keyInt;
        String b = Integer.toBinaryString(res);
        while (b.length() < 8) {
            b = "0" + b; // Pad with leading zeros to make it 8 bits
        }
        return b;
    }
    
    // Function to compute right value
    public static String right(String f, String l) {
        int fInt = Integer.parseInt(f, 2);
        int lInt = Integer.parseInt(l, 2);
        int res = fInt ^ lInt;
        String b = Integer.toBinaryString(res);
        while (b.length() < 8) {
            b = "0" + b; // Pad with leading zeros to make it 8 bits
        }
        return b;
    }
    
    // Function to encrypt the plain text
    public static String encrypt(String pt, String key1, String key2) {
        String l0 = pt.substring(0, 8);
        String r0 = pt.substring(8, 16);
        String f1 = fiestel(r0, key1);
        String r1 = right(f1, l0);
        String l1 = r0;
        String f2 = fiestel(r1, key2);
        String r2 = right(f2, l1);
        String l2 = r1;
        return r2 + l2;
    }
    
    // Function to decrypt the cipher text
    public static String decrypt(String ct, String key1, String key2) {
        String l0 = ct.substring(0, 8);
        String r0 = ct.substring(8, 16);
        String f1 = fiestel(r0, key2);
        String r1 = right(f1, l0);
        String l1 = r0;
        String f2 = fiestel(r1, key1);
        String r2 = right(f2, l1);
        String l2 = r1;
        return r2 + l2;
    }
}
