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

public class LibrarianSucces implements ActionListener{
    
      JFrame frame;
    JButton addbtn = new JButton("Issue Books");
     JButton viewbtn = new JButton("View Books");
     JButton rbtn = new JButton("Return Book");
      JButton logout = new JButton("Logout");
      JButton back = new JButton("Back");
     
     LibrarianSucces(){
         
       frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,500,500);
        
         frame.setTitle("Librarian Success");
        
        
        Container container = frame.getContentPane();
        container.setLayout(null);
         frame.setVisible(true);
         
          JLabel asection = new JLabel("Librarian Section");
		asection.setFont(new Font("Tahoma", Font.PLAIN, 22));
		asection.setForeground(Color.GRAY);
                asection.setBounds(135, 10, 300, 80);
                container.add(asection);
       
        
        addbtn.setBounds(120,90,200,40);
        viewbtn.setBounds(120,170,200,40);
        rbtn.setBounds(120,250,200,40);
        back.setBounds(120,330,90,40);
        logout.setBounds(240,330,90,40);

 
        container.add(addbtn);
        container.add(viewbtn);
         container.add(rbtn);
          container.add(logout);
          container.add(back);
        
        addbtn.addActionListener(this);
        viewbtn.addActionListener(this);
        rbtn.addActionListener(this);
        logout.addActionListener(this);
        back.addActionListener(this);
        
      
        
       
    }
    
 

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String str=e.getActionCommand();
        
       if(str.equals("Issue Books")){
           frame.dispose();
           savebook b=new savebook();
           b.save(true);
           
    }
       if(str.equals("View Books")){
           frame.dispose();
           View_books view= new View_books();
    }
       if(str.equals("Return Book")){
           frame.dispose();
           Return_Books r=new Return_Books();
           
    }
        if(str.equals("Logout")){
            frame.dispose();
              LibraryManagementSystem st=new LibraryManagementSystem();
    }
          if(str.equals("Back")){
            frame.dispose();
              LIBRARIAN_login st=new LIBRARIAN_login();
    }
    }
}
