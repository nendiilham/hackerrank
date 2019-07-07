/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSubstringComparisons;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String currStr = s.substring(0, k); 
        String smallest = currStr;
        String largest = currStr;

        for (int i = k; i<s.length(); i++){
            currStr = currStr.substring(1, k) + s.charAt(i); 
            if (smallest.compareTo(currStr) > 0)      
                 smallest = currStr; 
            if (largest.compareTo(currStr) < 0) 
                 largest = currStr; 
        }
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
