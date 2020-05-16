/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuram_problems;

import java.lang.Thread;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


class Account extends Thread{
    
    private String AccountNumber,AccountName;
    private int balance=0;
    public Thread main ;
    boolean back;
    
    private Scanner in = new Scanner(System.in);    
    private String ThreadName;
    Thread create = null,depo ,withd ,disp ;
        
    
    //Thread class constructor 
    
    Account(String name){
        
        ThreadName = name;
        
    
    }
    
    //overrideing the run method 
    
    @Override
    public void run(){
        int n;
        
        System.out.println("Thread : "+ThreadName + " running");
        
        System.out.println("Enter the choice\n1.create\t2.deposit\n3.withdraw\t4.display");
        
        n = in.nextInt();
        
    
        switch(n){
            case 1:
            {
            try {
                System.out.println("Starting new thread");
                create = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        AccountCreate();
                    }
                });
                
                create.setPriority(MAX_PRIORITY);
                create.join();
                create.start();
               
               
            } catch (InterruptedException ex) {
                
                System.out.println("Account creation thread interupted");
            }
            break;
            }
            
            case 2:
            {
                System.out.println("Starting deposit thread");
                depo = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        
                        try {
                        if(create.isAlive()){
                            throw new Exception();
                        }
                        else{
                        AccountDeposit();
                        }
                        }catch(Exception e){
                            
                            System.out.println("Either account is not created or the create thread is still alive");
                            Back();
                        
                        }
                    }
                });
            try {
                depo.join();
            } catch (Exception ex) {
               
            }
                depo.start();
                break;
            }
            
            case 3:
            {
                
                System.out.println("Starting the withdraw thread");
                
                withd = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        
                        try{
                        
                            if(create.isAlive()){
                                throw new Exception();
                            }
                            else{
                                AccountWithdraw();
                            }
                        }catch(Exception e){
                        
                            System.out.println("Either account is not created or the create thread is still alive");
                            Back();
                        }
                        
                    }
                });
            try {
                withd.join();
            } catch (Exception e) {
                
            }
                withd.start();
                
            break;
            }
            case 4:
            {
                System.out.println("Starting the display thread");
                
                disp = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        
                        try{
                            if(create.isAlive()){
                                throw new Exception();
                            }
                            else {
                                AccountDisplay();
                            }
                        
                        }catch(Exception e){
                        
                            System.out.println("Either account is not created or the create thread is still alive");
                            Back();
                        }
                    
                    }
                });
            try {
                disp.join();
            } catch (Exception e) {
                
            }
                
            disp.start();
             
            }
        
        }
        
      
              try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
               System.out.println("Either account is not created or the create thread is still alive");
               Back();
            }
          
    
        
}
    
    @Override
    public void start(){
        
        int n;
        System.out.println("Starting the thread");
        main = new Thread(this, ThreadName);
        try {
            main.join();
        } catch (Exception e) {
            System.out.println("t1.join exception");
        }
        main.start();
        
        

            
    }
    
    public void Back(){
        this.back = false;
    }
    
    
    @Override
    public String toString(){
        return "Account holder name : "+AccountName+"\nAccount number :"+AccountNumber+"\nBalance :"+balance+"\n";
    }
    
    public void AccountCreate(){
    
        System.out.println("Enter the account holder name");
        in.nextLine();
        AccountName = in.nextLine();
        System.out.println("Enter the account number");
        AccountNumber = in.nextLine();
        System.out.println("Initial Deposit --> rs.500\n");
        balance = 500;
        System.out.println("************** Account Created **************\n");
        this.back = false;
        //System.out.println("thread status : "+this.MT());
    
    }
    
    public void AccountDeposit(){
        
        System.out.println("Enter the Ammount to be deposited");
        int amt = in.nextInt();
        balance = balance + amt;
        System.out.println("Final balance : "+balance);
        System.out.println("\n");
        this.back = false;
    }
    
    public void AccountWithdraw(){
    
        System.out.println("Enter the Ammount to be withdrawn");
        int amt = in.nextInt();
        try{
            if(balance - amt < 500){
                throw new Exception("Not sufficient fund available");
            }
            else{
                balance = balance - amt;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Final balance : "+balance+"\n");
        }
    this.back = false;
    }
    
    public void AccountDisplay(){
    
        System.out.println("Displaying Account details");
        System.out.print(this);
        this.back = false;
        
    }
    

}




public class P11 extends Thread {
    
    int n;
    
    @Override
    public void run(){
       
        
        Scanner in = new Scanner(System.in);
        Account b1 = new Account("Thread - 1");
        boolean flag = true;
        
        while(flag){
            b1.back = true;
            System.out.println("1.Proceed \t2.exit");
            n = in.nextInt();
        
            switch(n)
            {
                case 1:
                {
                    b1.start();
                    while(b1.back){
                    
                    }
                    break;
                }
                case 2:
                    flag = false;
                   break; 
            }
        }
        
        
        }
    
    
    
    @Override
    public void start(){
        Thread t1 = new Thread(this);
        t1.start();
    }

    public static void main(String[] args) throws InterruptedException{
    
       
        P11 obj = new P11();
        obj.start();
           
    
    }
    
}
