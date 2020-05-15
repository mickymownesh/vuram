/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuram_problems;


import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class P4 {

    public static void main(String[] args) throws FileNotFoundException{
        
        String empName,DOB,DOJ,salary,experience;       
        int c,sno = 0;
        Scanner in = new Scanner(System.in);
        File db = new File("EmployeeFile.txt");
        FileOutputStream db_out = new FileOutputStream(db);
        FileInputStream db_in = new FileInputStream(db);
              
        System.out.println("1. Add data \n2. Retrive data");
        c = in.nextInt();
        switch(c){
            case 1:
            {
                //input data in same line with , as a seperator
                System.out.println("Enter the name,dob,doj,salary,experience");
                in.nextLine();
                String st = in.nextLine();
                StringTokenizer input = new StringTokenizer(st,",");
                st = "sno : "+sno+" Name : "+input.nextToken()+" dob : "+input.nextToken()+" Doj : "+input.nextToken()
                        +" salary : "+input.nextToken()+" Exp : "+input.nextToken();
                
                sno++;
                byte[] bt;
                bt = st.getBytes();
                System.out.println(bt);
            try {
                db_out.write(bt);
            } 
            catch (IOException ex) {
               
            }
            }
            
            case 2:
            {
            try {
                System.out.println(db_in.read());
            } catch (IOException ex) {
                System.out.println("No data found");
            }
            
            }
        
        
        
        }
        
        
        
    }
    
    
}
