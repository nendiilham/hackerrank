/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDatatypes;

import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++) //loop t than t
        {

            try
            {
                long x=sc.nextLong();   //input x for check in long
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte"); 
                //-128 to 127
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
                    System.out.println("* short");
                //-32,768 to 32,767  
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
                    System.out.println("* int");
                //-2,147,483,648 to 2,147,483,647
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)                                                  
                    System.out.println("* long");
                //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
                       
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}




