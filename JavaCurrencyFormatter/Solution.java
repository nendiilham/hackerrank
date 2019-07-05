/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCurrencyFormatter;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Solution {

    public static NumberFormat formatMoney(String location, String country){
        Locale locale = new Locale(location, country);
        NumberFormat current = NumberFormat.getCurrencyInstance(locale);
        return current;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = formatMoney("en","US").format(payment);
        String india = formatMoney("en","in").format(payment);
        String china = formatMoney("zh","CN").format(payment);
        String france = formatMoney("fr","FR").format(payment);

        //format done
        //get format sesuai locate return locate
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}


