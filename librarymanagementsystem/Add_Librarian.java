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

abstract class SaveLibrarian{
    abstract void save();
}

public class Add_Librarian extends SaveLibrarian implements ActionListener {
    
	 Container c;
    JFrame frame;
    JLabel label1, label2,label3,label4;
    JTextField user,id,contact;
    JPasswordField pass;
    JButton btn;
    JButton btn2;
    
    Add_Librarian(){
    frame= new JFrame();
         
        frame.setTitle("Add Librarian");
        
        frame.setSize(400,400);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        c=frame.getContentPane();
        c.setLayout(null);
        
        label1= new JLabel("Name: ");
        label2= new JLabel("Password: ");
        
        label1.setBounds(10,50,100,20);
        label2.setBounds(10,100,100,20);
        
        c.add(label1);
        c.add(label2);
        
        label3= new JLabel("ID: ");
        label4= new JLabel("Contact: ");
        
        label3.setBounds(10,150,100,20);
        label4.setBounds(10,200,100,20);
        
        c.add(label3);
        c.add(label4);
        
        user=new JTextField();
        user.setBounds(120,50,120,20);
        c.add(user);
        
        contact=new JTextField();
        contact.setBounds(120,200,120,20);
        c.add(contact);
        
        id=new JTextField();
        id.setBounds(120,150,120,20);
        c.add(id);
        
        pass= new JPasswordField();
        pass.setBounds(120,100,120,20);
        c.add(pass);
        
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
    
     void save(){
        try{
            FileOutputStream out =new FileOutputStream("AddLibrarian.txt");
            DataOutputStream data= new DataOutputStream(out);
            
            data.writeUTF(id.getText());
            data.writeUTF(user.getText());
            data.writeUTF(pass.getText());
            
            data.writeUTF(contact.getText());
            
            
            out.close();
            data.close();
            
        }catch(Exception e){
          System.out.println(e);  
        }
        
    }
     
      void save(boolean s){
          
          
        try{
            FileOutputStream out =new FileOutputStream("AddLibrarian.txt");
            DataOutputStream data= new DataOutputStream(out);
            
            if (s==true){
            data.writeUTF(id.getText());
            data.writeUTF(user.getText());
            data.writeUTF(pass.getText());
            
            data.writeUTF(contact.getText());
            }
            
            else{
                data.writeUTF("cant save");
            }
            
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
              Admin_Success lm=new Admin_Success();
          }
        
         if(str.equals("Add")){
              frame.dispose();
              
              save();
              Admin_Success mm=new Admin_Success();
              
          }
         
         
        
    }
    
   
}


	