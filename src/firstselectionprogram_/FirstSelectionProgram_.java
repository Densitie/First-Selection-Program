/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstselectionprogram_;
import java.util.Scanner;

/**
 *
 * @author ajayk
 */
public class FirstSelectionProgram_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner initialInput = new Scanner (System.in);
        
        double initial;
        double newinitial;
        double priceoff;
        final double FIRST_OFF = 0.90;
        final double SECOND_OFF = 0.80;
        final double THIRD_OFF = 0.70;
        final double FOURTH_OFF = 0.60;
        
//      If statements and variable declaration area  
        System.out.println("How much have you spent today?");
        initial = initialInput.nextDouble();
        
        if (initial >= 0.01 && initial <= 40.00){
            priceoff = initial * 0.10;
            priceoff = Math.round(priceoff * 100.00) / 100.00;
            System.out.println("You are saving 10%.");
            System.out.println("Deduction: " + priceoff + "$");
            
            
            newinitial = initial * FIRST_OFF; 
            newinitial = Math.round(newinitial * 100.00) / 100.00; 
            System.out.println("Your total is " + newinitial + "$");
            
        }else if (initial >= 40.01 && initial <= 80.00){
            priceoff = initial * 0.20;
            priceoff = Math.round(priceoff * 100.00) / 100.00;
            System.out.println("You are saving 20%.");
            System.out.println("Deduction: " + priceoff + "$");
                
            newinitial = initial * SECOND_OFF;
            newinitial = Math.round(newinitial * 100.00) / 100.00;
            System.out.println("Your total is " + newinitial + "$");
            
        }else if (initial >= 80.01 && initial <= 120.00){
            priceoff = initial * 0.30;
            priceoff = Math.round(priceoff * 100.00) / 100.00;
            System.out.println("You are saving 30%.");
            System.out.println("Deduction: " + priceoff + "$");
            
            newinitial = initial * THIRD_OFF;
            newinitial = Math.round(newinitial * 100.00) / 100.00;
            System.out.println("Your total is " + newinitial + "$");
            
        }else if (initial >= 120.00){
            priceoff = initial * 0.40;
            priceoff = Math.round(priceoff * 100.00) / 100.00;
            System.out.println("You are saving 40%.");
            System.out.println("Deduction: " + priceoff + "$");
            
            newinitial = initial * FOURTH_OFF;
            newinitial = Math.round(newinitial * 100.00) /100.0;
            System.out.println("Your total is " + newinitial + "$");
    }
    
}

}