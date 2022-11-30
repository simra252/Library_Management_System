/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
import java.io.*;  


public class Delete_Librarian implements ActionListener{
    
   Container c;
    JFrame frame;
    JLabel label1,label5;
    JTextField user;
    JButton btn;
    JButton btn2;
    
    Delete_Librarian(){
           frame= new JFrame();
         
        frame.setTitle("Delete Librarian");
        
        frame.setSize(300,300);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        c=frame.getContentPane();
        c.setLayout(null);
        
        label1= new JLabel("ID: ");
        label1.setBounds(22,50,100,20);
        c.add(label1);

      
        
        user=new JTextField();
        user.setBounds(90,50,120,20);
        c.add(user);
        
        
        btn=new JButton("Delete");
        btn2=new JButton("Back");
        
        btn.setBounds(70,150,70,20);
        btn2.setBounds(150,150,70,20);
        
        c.add(btn);
        c.add(btn2);
        
        btn.addActionListener(this);
        btn2.addActionListener(this);
        
        frame.setVisible(true);
        
        try{
            
            File f = new File("AddLibrarian.txt");
          f.delete();
              
          
            
           
            
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
        
         if(str.equals("Delete")){
              try{
            
            File f = new File("AddLibrarian.txt");
          f.delete();
              
          
            
           
            
        }catch(Exception ke){
            
            System.out.println(ke);
        }
              frame.dispose();
               Admin_Success lm=new Admin_Success();
              
          }
         
         
         
         
        
    }
    public static void main(String[] args){
        Delete_Librarian n= new Delete_Librarian();
        
    }

}
