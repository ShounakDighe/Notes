package ICS;
import java.util.*;
// filename: caesarCipher encrption and decrption

public class CaesarCipher {

    // Encrption
    public static String encrption(String p,String alphabets,int key){
        int letter;
        int codeLetter;  // replacement
        String ct =""; // Cipher text
        for (int i = 0; i < p.length(); i++) {
            if (alphabets.indexOf(p.substring(i,i+1))!=-1) {
                letter=alphabets.indexOf(p.substring(i,i+1));
                codeLetter=letter+key;
                codeLetter%=26; // highest 25 , low 0
                ct+=alphabets.substring(codeLetter, codeLetter+1);
            }
            else{
                ct+=p.substring(i, i+1);
            }
            
        }
        return ct;
    }

    // Decrption
    public static String decrption(String ct ,String alphabet , int key){
        int letter;
        int plaintext; //replacement
        String p=""; //plaintext
        for (int i = 0; i < ct.length(); i++) {
            if(alphabet.indexOf(ct.substring(i,i+1))!=-1){
                letter = alphabet.indexOf(ct.substring(i,i+1));
                plaintext = letter - key ;
                plaintext %= 26;
                p+=alphabet.substring(plaintext, plaintext+1);
            }
            else{
                p+=ct.substring(i, i+1);
            }
        }
        return p;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String p;  // Plaintext

        int key; // displacement
        String alphabets = "abcdefghijklmnopqrstuvwxyz";

        // Take message from the user
        System.out.print("Enter the Plain text : ");
        p = sc.next();

        // Take the key from user
        System.out.print("Enter the key text : ");
        key = sc.nextInt();

        // Take choice encrpt
        System.out.print("Do you want to encrpt y/n : ");
        char choice = sc.next().charAt(0);
        if (choice=='y'){
            System.out.println(encrption(p, alphabets,key));
        }

        // Take ch decrytp
        System.out.print("Do you want to decrpt y/n : ");
        char ch = sc.next().charAt(0);
        if (ch=='y'){
            System.out.println(decrption(encrption(p, alphabets,key),alphabets,key));
        }
        

    }
}
