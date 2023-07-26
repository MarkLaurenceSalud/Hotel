/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


/**
 *
 * @author Mark
 */
public class SignUp extends JFrame implements ActionListener{   
    
    JTextField tUsername, tPassword;
    JButton bSubmit, bClear, bLogin;
    JLabel lRegister, lUsername, lPassword, lHave;
    
    SignUp(){
    setLayout(null);
    setResizable(false);
    setBounds(400, 200, 500, 300);
      
     lRegister = new JLabel("Register");
     lRegister.setFont(new Font("Rockwell", Font.BOLD, 30));
     lRegister.setForeground(Color.gray);
     lRegister.setBounds(210, 10, 300, 40);
     add(lRegister);
     
     lUsername = new JLabel ("Username: ");
     lUsername.setBounds(130, 60, 300, 30);
     lUsername.setFont(new Font("Times New Roman", Font.BOLD, 15));
     add(lUsername);
        
     lPassword = new JLabel ("Password: ");
     lPassword.setBounds(130, 100, 300, 30);
     lPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
     add(lPassword);
     
     tUsername = new JTextField();
     tUsername.setBounds(210, 60, 120, 30); 
      
     tPassword = new JPasswordField();
     tPassword.setBounds(210, 100, 120, 30);
         
     bSubmit = new JButton("Submit");
     bSubmit.setBounds(280, 160, 80, 30);
     bSubmit.addActionListener(this);
     
     bClear = new JButton("Clear");
     bClear.setBounds(180, 160, 80, 30);
     bClear.addActionListener(this);
     
     lHave = new JLabel ("Already have an account? ");
     lHave.setBounds(285, 205, 300, 20);
     lHave.setFont(new Font("Times New Roman", Font.BOLD, 10));
     add(lHave);
     
     bLogin = new JButton("Login");
     bLogin.setBounds(400, 200, 70, 30);
     bLogin.addActionListener(this);
     
          
     add(tUsername);
     add(tPassword);
     add(bSubmit);
     add(bClear);
     add(bLogin);
     
     
    
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String username = tUsername.getText();
        String password = tPassword.getText();
        if(e.getSource()== bSubmit){
             try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "1234");
            String query = "INSERT INTO login (username, password) VALUES (?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                
                JOptionPane.showMessageDialog(this, "Account created successfully!");

       
            }else {
                JOptionPane.showMessageDialog(this, "Enter Username or Password");
            }

            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }   
        }else if(e.getSource()== bLogin){
            dispose();
            Login l = new Login();
            l.setVisible(true);       
        }else if(e.getSource()== bClear){
            tUsername.setText("");
            tPassword.setText("");
    }
    }
}
    

