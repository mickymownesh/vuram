/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuram_problems;

import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class P9 extends Applet implements ActionListener{
Label l1,l2,l3;
Button b1,b2;
TextField t1,t2,t3;


public void init(){
    
setLayout(new GridLayout(4, 1));
l1=new Label("enter string");
l2=new Label("resultant string");
l3=new Label("action performed");
t1=new TextField();
t2=new TextField();
t3=new TextField();
b1=new Button("reverse");
b2=new Button("display");
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b1);
add(b2);

b1.addActionListener(this);
b2.addActionListener(this);

}

@Override
public void actionPerformed(ActionEvent e) {
String str=t1.getText();
if(e.getSource()==b1){
StringBuffer st=new StringBuffer(str);
str=st.reverse().toString();
t2.setText(str);
t3.setText("reverse button clicked");
}
else if(e.getSource()==b2){
t2.setText(str);
t3.setText("display button clicked");
}

}

}
