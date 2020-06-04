/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuram_problems;


import java.util.Scanner;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class P4 {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        String empName,DOB,DOJ,salary,experience;       
        int c,sno = 0;
        Scanner in = new Scanner(System.in);
        FileInputStream Read = null;
        FileOutputStream Write = null;
        
       
        
        try{
            
            Read = new FileInputStream("employee.txt");
            Write = new FileOutputStream(Read.getFD());
            
            
        }catch(IOException e){
            File f = new File("employee.txt");
            Read = new FileInputStream(f.getName());
            Write = new FileOutputStream(f);
            System.out.println("Exception in opening the file");
        }
        
        System.out.println("1. Add data \n2. Retrive data");
        c = in.nextInt();
        switch(c){
            case 1:
            {
                //input data in same line with , as a seperator
                System.out.println("Enter the name,dob,doj,salary,experience");
                String st = in.nextLine();
                StringTokenizer input = new StringTokenizer(st,",");
                st = "sno : "+sno+" Name : "+input.nextToken()+" dob : "+input.nextToken()+" Doj : "+input.nextToken()
                        +" salary : "+input.nextToken()+" Exp : "+input.nextToken();
                
                sno++;
                byte[] bt;
                bt = st.getBytes();
                System.out.println(bt);
            
            try {
                Write.write(bt);
            } 
            catch (IOException ex) {
               System.out.println(ex);
            }
            
            }
            
            case 2:
            {
            try {
                
                System.out.println(Read.read());
                
            } catch (IOException ex) {
                System.out.println("No data found");
            }
            
            }
        
        
        
        }
        
        
        
    }
    
    
}
