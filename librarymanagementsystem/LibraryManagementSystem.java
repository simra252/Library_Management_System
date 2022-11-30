
package librarymanagementsystem;

import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 import javax.swing.ImageIcon;
 import javax.swing.event.*;
import java.io.*;  

class LibraryManagementSystem implements ActionListener{

    JFrame frame;
    JButton admin = new JButton("Admin");
     JButton librarian = new JButton("Librarian");
    
    LibraryManagementSystem(){
        
        
        JLabel lblLibraryManagement = new JLabel("Library Management System");
		lblLibraryManagement.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLibraryManagement.setForeground(Color.BLACK);
                lblLibraryManagement.setBounds(80, 30, 300, 80);
        
        
        
        frame = new JFrame();
        
        frame.setTitle("Library Management System");
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,400,400);
        
        
        Container container = frame.getContentPane();
        container.setLayout(null);
        
         frame.setVisible(true);
         
         ImageIcon li = new ImageIcon(getClass().getResource("icons/libr.jpg"));
         JLabel image=new JLabel(li);
         image.setBounds(0, 0, 400, 400);
         frame.add(image);
       
        
        admin.setBounds(90,120,200,40);
        librarian.setBounds(90,200,200,40);

 
        image.add(admin);
        image.add(librarian);
        image.add(lblLibraryManagement);
        
        admin.addActionListener(this);
        librarian.addActionListener(this);
        
      
        
       
    }
    
 

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String str=e.getActionCommand();
        
       if(str.equals("Admin")){
           frame.dispose();
           ADMIN_login form = new ADMIN_login();
    }
       if(str.equals("Librarian")){
           frame.dispose();
           LIBRARIAN_login form2 = new LIBRARIAN_login();
    }
    }
}

class test{
       public static void main(String[] args) {
       
        LibraryManagementSystem system=new LibraryManagementSystem();
    }

}
