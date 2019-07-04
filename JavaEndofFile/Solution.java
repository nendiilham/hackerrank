/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaEndofFile;

/**
 *
 * @author Ingat Sholat
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
                /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int i = 1;
        while (sc.hasNext()){
            String input = sc.nextLine();
            System.out.println( i +" "+input);
            i++;
        }

    }
}
