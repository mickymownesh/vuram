package vuram_problems;


import java.util.Scanner;
import myPack.*;

public class AirVoice_P1 {

    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args){
        int c,cc;
        
        System.out.println("Pleace choose the type of service \n 1. prepaid \n 2. postpaid");
        c = in.nextInt();
        
        switch(c){
        
            case 1:
                {
                    prepaidPlan prepaid = new prepaidPlan();
                    System.out.println("please choose the mode of call \n 1. voice call \n 2. video call");
                        switch(in.nextInt()){
                            case 1:
                            {
                                System.out.println("Enter the no. of seconds for price");
                                System.out.println("cost for the call --> "+prepaid.voiceCall(in.nextInt()));
                                break;
                            }
                            case 2:
                            {
                                System.out.println("Enter the no. of seconds for price");
                                System.out.println("cost for the call --> "+prepaid.videoCall(in.nextInt()));
                                break;
                            }
                        }
                }
            
            case 2:
                {
                    postpaidPlan postpaid = new postpaidPlan();
                    System.out.println("please choose the mode of call \n 1. voice call \n 2. video call");
                        switch(in.nextInt()){
                            case 1:
                            {
                                System.out.println("Enter the number of seconds");
                                System.out.println("Cost of the call is --> "+postpaid.voiceCall(in.nextInt()));
                                break;
                            }
                            case 2:
                            {
                                System.out.println("Enter the number of seconds");
                                System.out.println("Cost of the call is --> "+postpaid.videoCall(in.nextInt()));
                                break;
                            }

                        }

                }

        }

    }

}
