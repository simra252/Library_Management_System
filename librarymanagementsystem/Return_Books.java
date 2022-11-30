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

public class Return_Books implements ActionListener{
    Container c;
    JFrame frame;
    JLabel label1, label2,label3;
    JTextField name,quantity;
    JTextField author;
    JButton btn;
    JButton btn2;
    
    Return_Books(){
        
        frame= new JFrame();
         
        frame.setTitle("Return Books");
        
        frame.setSize(400,400);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        c=frame.getContentPane();
        c.setLayout(null);
        
        label1= new JLabel("Name: ");
        label2= new JLabel("Author: ");
        
        label1.setBounds(10,50,100,20);
        label2.setBounds(10,100,100,20);
        
        c.add(label1);
        c.add(label2);
        
        label3= new JLabel("Quantity: ");
        
        
        label3.setBounds(10,150,100,20);
       
        
        c.add(label3);
       
        
        name=new JTextField();
        name.setBounds(120,50,120,20);
        c.add(name);
        

        
        quantity=new JTextField();
        quantity.setBounds(120,150,120,20);
        c.add(quantity);
        
        author= new JTextField();
        author.setBounds(120,100,120,20);
        c.add(author);
        
        btn=new JButton("Return");
        btn2=new JButton("Back");
        
        btn.setBounds(100,250,75,20);
        btn2.setBounds(190,250,70,20);
        
        c.add(btn);
        c.add(btn2);
        
        btn.addActionListener(this);
        btn2.addActionListener(this);
        
        frame.setVisible(true);
        
        
       
     }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
         String str=e.getActionCommand();
         if(str.equals("Back")){
              frame.dispose();
              LibrarianSucces lm=new LibrarianSucces();
          }
        
         if(str.equals("Return")){
              
              
          
         try{
            
            File f = new File("AddBooks.txt");
          f.delete();
              
          
            
           
            
        }catch(Exception ae){
            
            System.out.println(ae);
        }
         
         frame.dispose();
         LibrarianSucces lm=new LibrarianSucces();
         }
       
     }
         
        
    
    
    
    public static void main (String[]args){
        Return_Books ad=new  Return_Books();
        
    }
    
}

        
    

