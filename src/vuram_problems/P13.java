/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuram_problems;

import java.io.*;
public class P13 {
    
public static void main(String[] args) throws IOException{
    
File FP = new File("E:/sample.txt");

FileReader FileReader=new FileReader(FP);

int count=(int)FP.length();
char input[]=new char[count];
FileReader.read(input);
        for(char C:input){
            
        System.out.print(C);
        
        }     

File f=new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Vuram_problems\\src\\samp1.txt");

FileWriter fw=new FileWriter(f);
fw.write(input);
fw.flush();  

}

}
