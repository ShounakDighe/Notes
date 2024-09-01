import java.util.*;

/*

Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:
Input: s = "racecar", t = "carrace"
Output: true

Example 2:
Input: s = "jar", t = "jam"
Output: false

 */

class IsAnagram {
    
    public static boolean isAnagram(String s ,String t){
        if(s.length()!=t.length()){
            return false;
        }

        char [] sArray = s.toCharArray();
        char [] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return (Arrays.equals(sArray, tArray));

    }

    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the String  s : ");
        String s = sc.next();

        System.out.print("Enter the String t : ");
        String t = sc.next();

        System.out.println(isAnagram(s,t));
    }
}
