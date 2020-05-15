/*
Impleneting the class using the runnable interface for achiving multithreading

*/
package vuram_problems;

import java.util.Scanner;

class Insurance {

    public static int policy = 0;
    public static int amt;
    public static String name;
    public static String id;
    
    public Scanner in = new Scanner(System.in);
    
}

class PolicyCreation extends Insurance implements Runnable{
    
    @Override
    public void run(){
        Create();
    }
    
    public void Create(){
        try{
        System.out.println("Enter the name of the policy holder to create");
        name = in.nextLine();
        System.out.println("Enter any identity number");
        id = in.nextLine();
        System.out.println("policy created");
        policy = 1;
        }catch(Exception e){
            System.out.println(e);
        }
    }
            
}


class PremiumPayment extends PolicyCreation implements Runnable{

    @Override
    public void run(){
    
        Pay();
    }
    
    public void Pay(){
        System.out.println("Enter the amout to pay");
        amt = in.nextInt();
        System.out.println("Payment sucessfull !!!");    
    }

}

class PolicyStatus extends PremiumPayment implements Runnable{
    
    @Override
    public void run(){
        Status();
    }
    
    public void Status(){
    
        if(policy == 0){
            System.out.println("Policy does not exist");
        }
        else
            System.out.println("Policy exists ");
    }

}



public class P3 {

    public static void main(String[] args){
    
        Scanner in = new Scanner(System.in);
        int c;
        
        
    PolicyCreation p = new PolicyCreation();
    PremiumPayment pay = new PremiumPayment();
    PolicyStatus ps = new PolicyStatus();
    
    Thread t1 = new Thread(p);
    Thread t2 = new Thread(pay);
    Thread t3 = new Thread(ps);
    
    t2.setPriority(Thread.MAX_PRIORITY);
    t3.setPriority(Thread.MAX_PRIORITY);
    
    while(true)
    {
    System.out.println("\n ----------------------------------------------------");
    System.out.println("Enter the choice of action  \n 1. Policy creation \n 2. premium payment \n 3. policy status \n 4. Exit");
    System.out.println("\n ----------------------------------------------------");
    c = in.nextInt();
    
    switch(c){
    
        case 1:{
            
            t1.start();
            try {
                t1.join();
                
            
            }catch(Exception e){
                
                System.out.println("Thread overflow");
            
            }
            finally {
                
                if(t1.isAlive()){
                    System.out.println("Policy creation still active");
                }
                else
                    System.out.println("Policy creation thread terminated");
            
            }
            break;      
        
        }
        case 2:{
            
            try{
                t2.start();
                t2.join();
            
            }catch(Exception e){
                System.out.println("Exception caught in premium payment");
            }
                
            break;
        }
        case 3:{
        
            try{
                t3.start();
                t3.join();
            
            }catch(Exception e){
            
                System.out.println("Exception caught in policy status block");
            }
            
        break;
        
        }
        
        case 4:{
            System.exit(c);
        }
    
    }
    
    }
    
    
    }
   
}
