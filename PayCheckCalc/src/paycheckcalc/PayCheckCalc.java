/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paycheckcalc;

/**
 *
 * @author caatk_000
 */
public class PayCheckCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int hours = 60;
    int payrate = 9;
    int ot = 2 * payrate* (hours-40);
    int overtimehours = hours - 40;
    int result = (hours - overtimehours)*9 +ot;
    
    if (hours <= 40){ 
        System.out.println("You worked "+ hours+" hours with no overtime hours.");
        System.out.println("Your pay rate is $"+ payrate + " an hour.");
        System.out.println("Your pay is $"+ result);

    }
    else { 
        System.out.println("You worked " + hours+ " hours with "+ overtimehours +" overtime hours.");
        System.out.println("Your pay rate is $" + payrate + " an hour.");
        System.out.println("Your overtime pay is double rates. Which is $"+ payrate*2+ " an hour.");
        System.out.println("Your pay is $"+ result); 
    }
    //System.out.println("Pay with overtime is "+ hours * payrate + ot*9*(hours-40));
    //System.out.println("You worked "+ hours +" hours.");
    //System.out.println("You worked " + (hours-40)+ " overtime hours");
    //System.out.println("Your pay rate is $"+ payrate + " an hour.");
    //System.out.println("Your overtime pay is double rates. Which is $"+ payrate*2+ " an hour.");
    //System.out.println("Your pay is $"+ result);
   
    
    }
}
