/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;
import java.io.*;
import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 import javax.swing.event.*;
import java.io.*; 


public class View_Librarian implements ActionListener{
    
    Container c;
    JFrame frame;
    JLabel label1, label2,label3,label4,label5,label6,label7,label8;
    JButton btn2;
    
    
    View_Librarian(){
        
   frame= new JFrame();
         
        frame.setTitle("View Librarian");
        
        frame.setSize(400,400);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        c=frame.getContentPane();
        c.setLayout(null);
        
        label1= new JLabel("ID ");
        label2= new JLabel("Name ");
        
        label1.setBounds(50,50,100,20);
        label2.setBounds(110,50,100,20);
        
        c.add(label1);
        c.add(label2);
        
        label3= new JLabel("Password ");
        label4= new JLabel("Contact ");
        
        label3.setBounds(200,50,100,20);
        label4.setBounds(290,50,100,20);
        
        c.add(label3);
        c.add(label4);
        
        
        btn2=new JButton("Back");
        btn2.setBounds(150,220,80,30);
        c.add(btn2);
        
        btn2.addActionListener(this);
        
        try{
            
            FileInputStream in = new FileInputStream("AddLibrarian.txt");
            DataInputStream data= new DataInputStream(in);
            
            label5= new JLabel(data.readUTF());
        label6= new JLabel(data.readUTF());
        
        label5.setBounds(50,100,100,20);
        label6.setBounds(110,100,100,20);
        
        c.add(label5);
        c.add(label6);
        
        label7= new JLabel(data.readUTF());
        label8= new JLabel(data.readUTF());
        
        label7.setBounds(200,100,100,20);
        label8.setBounds(290,100,100,20);
        
        c.add(label7);
        c.add(label8);
        
        in.close();
        data.close();
            
        }catch(Exception e){
            
            System.out.println(e);
        }
        
        frame.setVisible(true);
        
        
       
     }
    
   

    @Override
    public void actionPerformed(ActionEvent e) {
         String str=e.getActionCommand();
         if(str.equals("Back")){
              frame.dispose();
              Admin_Success lm=new Admin_Success();
          }
        
         
         
         
        
    }
   
   
}