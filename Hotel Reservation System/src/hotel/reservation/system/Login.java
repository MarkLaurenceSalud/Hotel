/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Mark
 */

class MainPage extends JFrame implements ActionListener{
    
    
    JComboBox cb1, cb2;
    JLabel l1, l2;
    JButton b1, b2, b3, b4, b5;
    
  MainPage(){
    setResizable(false);
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     l1 = new JLabel("Hello Client!");
     l1.setBounds(900, 20, 100, 30);
     l1.setFont(new Font("Times New Roman", Font.BOLD, 15));
     add(l1);
     
     l2 = new JLabel("Welcome to our Hotel");
     l2.setFont(new Font("Times New Roman", Font.BOLD, 35));
     l2.setBounds(380, 100, 350, 30);
     add(l2);
       
     String[] Booking = {"Booking","Add Booking","My Booking"};
     cb1 = new JComboBox(Booking); 
     cb1.setBounds(20, 20, 100, 30);
     cb1.addActionListener(this);
     add(cb1);
     
     String[] Exit = {"Exit","Logout"};
     cb2 = new JComboBox(Exit); 
     cb2.setBounds(150, 20, 100, 30);
     cb2.addActionListener(this);
     add(cb2);
     
     b1 = new JButton("Check in");
     b1.setFont(new Font("Rockwell", Font.BOLD, 30));
     b1.setForeground(Color.gray);
     b1.setBounds(100, 200, 300, 60);
     
     b2 = new JButton("Room Booking");
     b2.setFont(new Font("Rockwell", Font.BOLD, 30));
     b2.setForeground(Color.gray);
     b2.setBounds(410, 200, 300, 60);
     
     b3 = new JButton("Rooms");
     b3.setFont(new Font("Rockwell", Font.BOLD, 30));
     b3.setForeground(Color.gray);
     b3.setBounds(720, 200, 300, 60);
     
     b4 = new JButton("Cancel Booking");
     b4.setFont(new Font("Rockwell", Font.BOLD, 30));
     b4.setForeground(Color.gray);
     b4.setBounds(250, 350, 300, 60);
     
     b5 = new JButton("Check Out");
     b5.setFont(new Font("Rockwell", Font.BOLD, 30));
     b5.setForeground(Color.gray);
     b5.setBounds(570, 350, 300, 60);
      
     add(b1); 
     add(b2); 
     add(b3); 
     add(b4); 
     add(b5); 
  }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==cb1){
        
       }
    }
}

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
        setResizable(false);
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
                   dispose();
                   MainPage mp = new MainPage();
                   mp.setVisible(true);
                   mp.setBounds(500, 200, 1080, 720);
                   
                   
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
            s.setResizable(false);
            s.setBounds(400, 200, 500, 300);
           }           
        });              
    }
    
}


