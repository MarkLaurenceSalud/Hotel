/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


/**
 *
 * @author Mark
 */

public class Login extends JFrame implements ActionListener{
    
  private static final String username = "root";
     private static final String password = "1234";
     private static final String dataConn = "jdbc:mysql://localhost:3306/login";

     Connection sqlConn = null;
     PreparedStatement pst = null;
     ResultSet rs = null;
     
    JTextField tUsername, tPassword;
    JButton bLogin, bSignUp, bClear;
    JLabel lLogin, lUsername, lPassword;
    
    Login(){
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 200, 500, 300);
        
        lLogin = new JLabel("Login");
        lLogin.setFont(new Font("Rockwell", Font.BOLD, 30));
        lLogin.setForeground(Color.gray);
        lLogin.setBounds(205, 10, 300, 50);
        add(lLogin);
        
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
        
        bLogin = new JButton("Login");
        bLogin.setBounds(170, 160, 80, 30);
        bLogin.addActionListener(this);
        
        bSignUp = new JButton("SignUp");
        bSignUp.setBounds(270, 160, 80, 30);
        bSignUp.addActionListener(this);
        
        bClear = new JButton("Clear");
        bClear.setBounds(70, 160, 80, 30);
        bClear.addActionListener(this);
        
        add(tUsername);
        add(tPassword);
        add(bLogin);
        add(bSignUp);
        add(bClear);

      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String username = tUsername.getText();
        String password = tPassword.getText();
        
        
        
        if(e.getSource()== bLogin){
            try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "1234");

          
            String query = "SELECT * FROM login WHERE username = ? AND password = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);


            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
           
                JOptionPane.showMessageDialog(this, "Login successful!");
                dispose();
                MainPage mp = new MainPage();
                mp.setVisible(true);
            } else {
       
                JOptionPane.showMessageDialog(this, "Invalid username or password!");
            }


            resultSet.close();
            statement.close();
            conn.close();

        } catch (Exception ex) {
      
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred during login.");
        }
    
        }else if(e.getSource()== bSignUp){
            dispose();
            SignUp s = new SignUp();
            s.setVisible(true);
        }else if(e.getSource()== bClear){
            tUsername.setText("");
            tPassword.setText("");
        }
        
    }

   
}


