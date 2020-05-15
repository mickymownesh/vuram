/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuram_problems;

import java.util.Scanner;

class InitialDepositException extends Exception{

    public InitialDepositException() {
        
        super("Initial Deposit must be greater than 3000 rupees");
                
    }
}

public class P2 {
    
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        
        int amt;
        System.out.println("Enter the amount for initial deposit");
        
        try{
            amt = in.nextInt();
            if(amt < 3000){
                throw new InitialDepositException();
            }
            else{
                System.out.println("Susccessfuly deposited");
            }
                    
        }
        catch(InitialDepositException e){
        
            System.out.println("Exception caught");
            System.out.println(e.getMessage());
        
        }
        finally{
        
            System.out.println("Thank you for using the service");
        }
        
    
    }
    
}
