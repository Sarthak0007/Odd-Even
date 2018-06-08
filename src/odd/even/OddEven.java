/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd.even;

import java.util.Scanner;


public class OddEven {

    
    public static void main(String[] args) {
        
        int a ;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        a =scn.nextInt();
        
        if(a%2 == 0)
        {
            System.out.println("it is a even number.");
            
        }
        else
        {
            System.out.println("It is a odd number.");
        }
    }
    
}
