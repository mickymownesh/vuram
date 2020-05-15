
package vuram_problems;

import EntertainmentSystem.DvdPlayer;
import EntertainmentSystem.MusicSystem;
import java.util.Scanner;

public class P10 {
    
    public static void main(String[] args){
    
        Scanner in = new Scanner(System.in);
        int n;
        
        DvdPlayer dvd = new DvdPlayer();
        MusicSystem MS = new MusicSystem();
        
        System.out.println("Enter the choice \n1.DVD player \n2.Music system");
        n = in.nextInt();
        
        switch(n){
            case 1:{
            
                System.out.println("Enter the choice of operation \n1.on \t2.off \n3.play \t4.pause");
                n = in.nextInt();
                switch(n){
                    case 1:
                    {
                        dvd.On();
                        break;
                    }
                    case 2:
                    {
                        dvd.Off();;
                        break;
                    }
                    case 3:
                    {
                        dvd.Play();
                        break;
                    }
                    case 4:
                    {
                        dvd.Pause();
                        break;
                    }
                
                
                }
                break;
            }
            
            case 2:
            {
                System.out.println("Enter the choice of operation \n1.on \t2.off \n3.play \t4.pause");
                n = in.nextInt();
                switch(n){
                    case 1:
                    {
                        MS.On();
                        break;
                    }
                    case 2:
                    {
                        MS.Off();;
                        break;
                    }
                    case 3:
                    {
                        MS.Play();
                        break;
                    }
                    case 4:
                    {
                        MS.Pause();
                        break;
                    }
            
            }
           break;
        }
       
    }
    }
}
