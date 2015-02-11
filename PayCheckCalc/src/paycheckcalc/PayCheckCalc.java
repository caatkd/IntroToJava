/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paycheckcalc;

import java.util.Scanner;
import java.util.*;
import java.text.*;


/**
 *
 * @author caatk_000
 */
public class PayCheckCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    float hours;
    float payrate;
    float otrate;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your Hours: ");
    hours = in.nextFloat();
    
    System.out.println("Enter your payrate: ");
    payrate = in.nextFloat();
    
    
   // int hours = 60;
    //int payrate = 9;
    //float ot = 2 * payrate* (hours-40);
    //float overtimehours = hours - 40;
    //float result = (hours - overtimehours)*9 +ot;
    //int h;
    //System.out.println("Enter your hours worked this pay period: ");
    //h = in.nextInt();
    
    
    if (hours <= 40){ 
        float result = (hours *payrate);
        System.out.println("You worked "+ hours+" hours with no overtime hours.");
        System.out.println("Your pay rate is $"+ payrate + " an hour.");
        //System.out.println("Your pay is $"+ result);
        Locale mylocale = new Locale("en", "US");
        Currency mycurrency = Currency.getInstance(mylocale);
        NumberFormat nf = NumberFormat.getCurrencyInstance(mylocale);
        System.out.println("Your pay is "+ nf.format(result));
        
        

    }
    else { 
        System.out.println("Enter your overtime multiplier: ");
        otrate = in.nextFloat();
        float overtimehours = hours - 40;
        float ot = otrate * payrate* (hours-40);
        float result = (hours - overtimehours)*payrate +ot;
        System.out.println("You worked " + hours+ " hours with "+ overtimehours +" overtime hours.");
        System.out.println("Your pay rate is $" + payrate + " an hour.");
        System.out.println("Your overtime pay is: "+otrate+".Which is $"+ payrate*otrate+ " an hour.");
        //System.out.println("Your pay is $"+ result); 
        Locale mylocale = new Locale("en", "US");
        Currency mycurrency = Currency.getInstance(mylocale);
        NumberFormat nf = NumberFormat.getCurrencyInstance(mylocale);
        System.out.println("Your pay is "+ nf.format(result));
    }
    //System.out.println("Pay with overtime is "+ hours * payrate + ot*9*(hours-40));
    //System.out.println("You worked "+ hours +" hours.");
    //System.out.println("You worked " + (hours-40)+ " overtime hours");
    //System.out.println("Your pay rate is $"+ payrate + " an hour.");
    //System.out.println("Your overtime pay is double rates. Which is $"+ payrate*2+ " an hour.");
    //System.out.println("Your pay is $"+ result);
   
    
    }
}
