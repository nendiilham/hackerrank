/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaStringIntrodution;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int aLeng = A.length();
        int bLeng = B.length();
        int i = A.compareTo(B);
        String greater;
        if(i>0){
             greater = "Yes";
        } else{
             greater = "No";
        }
        String aTemp = A.substring(0, 1).toUpperCase() + A.substring(1);
        String bTemp = B.substring(0, 1).toUpperCase() + B.substring(1);


        System.out.println(A.length() + B.length());
        System.out.println(greater);
        System.out.println(aTemp + " " + bTemp);
        
    }
}
