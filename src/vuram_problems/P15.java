/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuram_problems;

import java.util.Scanner;


abstract class EmployeeDetails{
    
public String name,adress;
Scanner s=new Scanner(System.in);

}

class PartTime extends EmployeeDetails{

    int hr,ph;
    
    PartTime(int nohr,int sal){
    this.hr=nohr;
    this.ph=sal;

    }
    
public void display(){
    
System.out.println("Part time employee:\nenter name and address");
name=s.nextLine();
adress=s.nextLine();
double salary=this.hr*this.ph;
System.out.println("name: "+name+" address: "+adress+" salary: "+salary);

}
}


class FullTime extends EmployeeDetails{
    int sal;
    String dept;
        FullTime(String dept,int sal){
        this.sal=sal;
        this.dept=dept;
        }

        public void display(){

            System.out.println("Full time employee:\nenter name and address");
            name=s.nextLine();
            adress=s.nextLine();
            System.out.println("name: "+name+" address: "+adress+" salary: "+this.sal+" department: "+this.dept);

        }

}

public class P15 {
    
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int i;
String b;
int x,y,a;
System.out.println("no of obj for parttime & fulltime");
int pn=s.nextInt();
int fn=s.nextInt();

PartTime pobj[]=new PartTime[pn];
for(i=0;i<pn;i++){
System.out.println("enter no of hours & wage p/h");
x=s.nextInt();
y=s.nextInt();
pobj[i]=new PartTime(x, y);
pobj[i].display();
}
FullTime fobj[]=new FullTime[fn];
for(i=0;i<fn;i++){
System.out.println("enter salary & dept");
a=s.nextInt();
b=s.next();
fobj[i]=new FullTime(b,a);
fobj[i].display();
}

}
}
