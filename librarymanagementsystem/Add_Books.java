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





public class Add_Books implements ActionListener{
    Container c;
    JFrame frame;
    JLabel label1, label2,label3,label4;
    JTextField name,quantity,contact;
    JTextField author;
    JButton btn;
    JButton btn2;
    
    Add_Books(){
        
    
    
frame= new JFrame();
         
        frame.setTitle("Add Books");
        
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
        label4= new JLabel("Contact: ");
        
        label3.setBounds(10,150,100,20);
        label4.setBounds(10,200,100,20);
        
        c.add(label3);
        c.add(label4);
        
        name=new JTextField();
        name.setBounds(120,50,120,20);
        c.add(name);
        
        contact=new JTextField();
        contact.setBounds(120,200,120,20);
        c.add(contact);
        
        quantity=new JTextField();
        quantity.setBounds(120,150,120,20);
        c.add(quantity);
        
        author= new JTextField();
        author.setBounds(120,100,120,20);
        c.add(author);
        
        btn=new JButton("Add");
        btn2=new JButton("Back");
        
        btn.setBounds(100,250,70,20);
        btn2.setBounds(180,250,70,20);
        
        c.add(btn);
        c.add(btn2);
        
        btn.addActionListener(this);
        btn2.addActionListener(this);
        
        frame.setVisible(true);
        
        
       
     }
    
    
    
         
        
   public void save(){
        try{
            FileOutputStream out =new FileOutputStream("AddBooks.txt");
            DataOutputStream data= new DataOutputStream(out);
            
            data.writeUTF(name.getText());
            data.writeUTF(author.getText());
            data.writeUTF(quantity.getText());
            
            data.writeUTF(contact.getText());
            
            out.close();
            data.close();
            
        }catch(Exception e){
          System.out.println(e);  
        }
   }
        @Override
        
    public void actionPerformed(ActionEvent e) {
         String str=e.getActionCommand();
         if(str.equals("Back")){
              frame.dispose();
              LibrarianSucces lm=new LibrarianSucces();
          }
        
         if(str.equals("Add")){
             save();
              frame.dispose();
               LibrarianSucces lm=new LibrarianSucces();
              
          }
    }  
        
    }
class savebook extends Add_Books{
    public void save(boolean s){
        
        if (s==true){
            save();
            
        }
     
    }
}


   
   


	