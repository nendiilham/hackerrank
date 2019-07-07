/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaStringReverse;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A, reverse = ""; 
        A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length = A.length();
        for ( int i = length - 1; i >= 0; i-- )  
        reverse = reverse + A.charAt(i);  
        if (A.equals(reverse)) { 
            System.out.println("Yes");  
        } else{  
            System.out.println("No");   
        }
    }  
        
    
}