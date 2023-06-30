/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Mark
 */

class SignUp extends JFrame{
    
    JTextField t1, t2;
    JButton b1;
    JLabel l1, l2, l3;
    
    SignUp(){
    setLayout(null);
    
     t1 = new JTextField();
     t2 = new JPasswordField();
     b1 = new JButton("Submit");
     
     l1 = new JLabel("Register");
     l1.setFont(new Font("Rockwell", Font.BOLD, 30));
     l1.setForeground(Color.gray);
     l1.setBounds(125, 10, 300, 30);
     add(l1);
     
     l2 = new JLabel ("Username: ");
     l2.setBounds(25, 60, 300, 30);
     l2.setFont(new Font("Times New Roman", Font.BOLD, 15));
     add(l2);
        
     l3 = new JLabel ("Password: ");
     l3.setBounds(25, 100, 300, 30);
     l3.setFont(new Font("Times New Roman", Font.BOLD, 15));
     add(l3);
     
     t1.setBounds(100, 60, 120, 30);               
     t2.setBounds(100, 100, 120, 30);
     b1.setBounds(120, 140, 80, 30);
     
     b1.addActionListener(new ActionListener (){
         @Override
         public void actionPerformed(ActionEvent ae){
            
           dispose(); 
         }
     
     });
          
     add(t1);
     add(t2);
     add(b1);
       
   }
}
    

public class Login extends JFrame{
    
    JTextField t1, t2;
    JButton b1, b2;
    JLabel l1, l2, l3, l4;
    
    Login(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        l1 = new JLabel("Login");
        l1.setFont(new Font("Rockwell", Font.BOLD, 30));
        l1.setForeground(Color.gray);
        l1.setBounds(125, 10, 300, 30);
        add(l1);
        
        l2 = new JLabel("");
        l2.setBounds(250, 80, 300, 30);
        add(l2);
        
        l3 = new JLabel ("Username: ");
        l3.setBounds(25, 60, 300, 30);
        l3.setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(l3);
        
        l4 = new JLabel ("Password: ");
        l4.setBounds(25, 100, 300, 30);
        l4.setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(l4);
        
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");
        b2 = new JButton("SignUp");
        
        t1.setBounds(100, 60, 120, 30);               
        t2.setBounds(100, 100, 120, 30);
        b1.setBounds(85, 140, 80, 30);
        b2.setBounds(175, 140, 80, 30);
        
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        
       
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
               if(t1.getText().toString().equals("admin")&& t2.getText().toString().equals("admin"))
               {
                  
                   l2.setText("Welcome Costumer");
               }
               else
                   l2.setText("Invalid Username or Password");
            }
        });
        
        b2.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent ae){
            dispose();
            SignUp s = new SignUp();
            s.setVisible(true);
            s.setBounds(400, 200, 500, 300);
           }           
        });              
    }
    
}


