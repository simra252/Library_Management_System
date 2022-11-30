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


public class Admin_Success implements ActionListener{
    
     JFrame frame;
    JButton addbtn = new JButton("Add Librarian");
     JButton viewbtn = new JButton("View Librarian");
     JButton delbtn = new JButton("Delete Librarian");
      JButton logout = new JButton("Logout");
      JButton back = new JButton("Back");
     
     Admin_Success(){
         
       frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,500,500);
        
        frame.setTitle("Admin Success");
        
         
        
        Container container = frame.getContentPane();
        container.setLayout(null);
         frame.setVisible(true);
         
         JLabel asection = new JLabel("Admin Section");
		asection.setFont(new Font("Tahoma", Font.PLAIN, 22));
		asection.setForeground(Color.GRAY);
                asection.setBounds(150, 10, 300, 80);
                container.add(asection);
       
        
        addbtn.setBounds(120,90,200,40);
        viewbtn.setBounds(120,170,200,40);
        delbtn.setBounds(120,250,200,40);
        back.setBounds(120,330,90,40);
        logout.setBounds(240,330,90,40);

 
        container.add(addbtn);
        container.add(viewbtn);
         container.add(delbtn);
          container.add(logout);
          container.add(back);
        
        addbtn.addActionListener(this);
        viewbtn.addActionListener(this);
        delbtn.addActionListener(this);
        logout.addActionListener(this);
        back.addActionListener(this);
        
      
        
       
    }
    
 

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String str=e.getActionCommand();
        
       if(str.equals("Add Librarian")){
           frame.dispose();
           Add_Librarian add=new Add_Librarian();
    }
       if(str.equals("View Librarian")){
           frame.dispose();
           
           View_Librarian v=new View_Librarian();
           
    }
       if(str.equals("Delete Librarian")){
           frame.dispose();
           Delete_Librarian dd=new Delete_Librarian();
           
    }
        if(str.equals("Logout")){
            frame.dispose();
              LibraryManagementSystem st=new LibraryManagementSystem();
    }
          if(str.equals("Back")){
            frame.dispose();
              ADMIN_login st=new ADMIN_login();
    }
    }
    
   
}
