import java.util.*;

/* 

Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:
Input: nums = [1, 2, 3, 3]
Output: true

Example 2:
Input: nums = [1, 2, 3, 4]
Output: false

*/

class DuplicateInteger {

    public static boolean hasDuplicate(int num[]){
        Arrays.sort(num);
        for(int i = 1 ; i<num.length ; i++){
            if(num[i]== num[i-1]){
                return true ;
            }
        }
        return false;
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int num [] = new int [5];
        for(int i = 0 ; i<5 ; i++){
            System.out.print("Enter the value "+(i+1)+" : ");
            num[i]= sc.nextInt();
        }
        System.out.println( "Is it duplicate : "+hasDuplicate(num));
    }
    
}
