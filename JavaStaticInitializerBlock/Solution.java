/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaStaticInitializerBlock;

/**
 *
 * @author Ingat Sholat
 */
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static Scanner input = new Scanner (System.in);
    static int B = input.nextInt();
    static int H = input.nextInt();
    static boolean flag = B >= 1 && H >= 1;

    static {
        if (!flag) 
        System.out.println("java.lang.Exception: Breadth and height must be positive");

    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
