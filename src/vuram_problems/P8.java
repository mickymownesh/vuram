/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuram_problems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class P8 implements ActionListener{
JButton b1;
JTextField t1,t2;
JLabel l1,l2;
public void create(){
JFrame frame=new JFrame("factorial");
b1=new JButton("calculate");
t1=new JTextField(10);
t2=new JTextField(10);

l1=new JLabel("enter number");

l2=new JLabel("answer");
frame.add(l1);
frame.add(t1);
frame.add(l2);
frame.add(t2);

frame.add(b1);
b1.addActionListener(this);
frame.setLayout(new GridLayout(3,1));
frame.setVisible(true);
frame.setSize(300,150);

}

@Override
public void actionPerformed(ActionEvent e) {
int num=Integer.parseInt(t1.getText());
int fact=1,i;
if(e.getSource()==b1){
if(num==0 || num==1){
fact=1;
t2.setText(String.valueOf(fact));
}
else{
for(i=1;i<=num;i++){
fact*=i;
}
t2.setText(String.valueOf(fact));
}
}
}
public static void main(String[] args) {
P8 s=new P8();
s.create();
}   
}
