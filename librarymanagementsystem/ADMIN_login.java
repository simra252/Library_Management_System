/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 import javax.swing.event.*;
import java.io.*;  

public class ADMIN_login implements ActionListener{
    
    Container c;
    JFrame frame;
    JLabel label1, label2;
    JTextField user;
    JPasswordField pass;
    JButton btn;
    JButton btn2;
    
     ADMIN_login(){
         
         frame= new JFrame();
         
        frame.setTitle("Admin Login");
        
        frame.setSize(400,300);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        c=frame.getContentPane();
        c.setLayout(null);
        
        label1= new JLabel("Admin ID: ");
        label2= new JLabel("password: ");
        
        label1.setBounds(10,50,100,20);
        label2.setBounds(10,100,100,20);
        
        c.add(label1);
        c.add(label2);
        
        user=new JTextField();
        user.setBounds(120,50,120,20);
        c.add(user);
        
        pass= new JPasswordField();
        pass.setBounds(120,100,120,20);
        c.add(pass);
        
        btn=new JButton("Login");
        btn2=new JButton("Back");
        
        btn.setBounds(100,150,70,20);
        btn2.setBounds(180,150,70,20);
        
        c.add(btn);
        c.add(btn2);
        
        btn.addActionListener(this);
        btn2.addActionListener(this);
        
        frame.setVisible(true);
        
        
       
     }

    @Override
    public void actionPerformed(ActionEvent e) {
         String str=e.getActionCommand();
         
         if(str.equals("Login")){
        String s=user.getText();
        String p = new String(pass.getPassword());
        
        if(s.equals("simra") && p.equals("simra123")){
            frame.dispose();
              Admin_Success ad=new Admin_Success();
          
         }
         }
         
          if(str.equals("Back")){
              frame.dispose();
              LibraryManagementSystem lm=new LibraryManagementSystem();
          }
        
    }
    
}
