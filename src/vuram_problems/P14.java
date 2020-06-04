/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuram_problems;

import java.util.Scanner;

public class P14 {

private String name,des,id;
private double sal;
public P14(String ename,String des,String id,double sal){
this.name=ename;
this.id=id;
this.des=des;
this.sal=sal;

}
public void calc(){
//System.out.println("des  "+this.des);
if(this.des.equalsIgnoreCase("manager")){
double inc=this.sal*20/100;
this.sal+=inc;
}
else if(this.des.equalsIgnoreCase("clerk"))
this.des="analyst";
}


public void display(){
System.out.println("name: "+this.name+"  id: "+this.id+"  designation: "+this.des+"  salary: "+this.sal);
}


public static void main(String[] args) {
    
    
P14 person_1 = new P14("aaa","manager","14bm005",40000);
P14 person_2 = new P14("bbb","clerk","17bcl105",4000);
P14 person_3 = new P14("ccc","gm","15bgm004",45000);
P14 person_4 = new P14("aaa","manager","13bm004",44000);
Scanner s=new Scanner(System.in);
System.out.println("enter name, designation ,id ,salary");
String enam=s.nextLine();
String edes=s.nextLine();
String eid=s.nextLine();
double salary=s.nextDouble();
P14 obj5=new P14(enam,edes,eid,salary);


person_1.calc();
person_2.calc();
person_3.calc();
person_4.calc();
obj5.calc();
person_1.display();
person_2.display();
person_3.display();
person_4.display();
obj5.display();
}

}
