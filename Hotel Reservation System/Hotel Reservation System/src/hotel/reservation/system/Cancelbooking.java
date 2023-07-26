/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;

import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Mark
 */
public class Cancelbooking extends JFrame implements ActionListener{
    

    
     private static final String username = "root";
     private static final String password = "1234";
     private static final String dataConn = "jdbc:mysql://localhost:3306/login";
     Connection sqlConn = null;
     PreparedStatement pst = null;
     ResultSet rs = null;
    
    JButton bCheckin, bRoombooking, bRooms, bCancelbooking, bHome, bCancelP, bCancelB;
    JLabel lCancelbooking, lLogo, lP, lB;
    JPanel pCancelbooking, pBackground;
    JTextField tfP, tfB;
    
    
    Cancelbooking(){
    setResizable(false);
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setBounds(0, 0, 1080, 720);
    
    lCancelbooking = new JLabel("Cancel Booking");
    lCancelbooking.setFont(new Font("Times New Roman", Font.BOLD, 35));
    lCancelbooking.setBounds(450, 30, 250, 40);
    add(lCancelbooking);
    
    lLogo = new JLabel();
    lLogo.setBounds(10, -20, 300, 300);
    ImageIcon img1 = new ImageIcon(new ImageIcon("logo.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
    lLogo.setIcon(img1);
    add(lLogo);
    
  
    
    pCancelbooking = new JPanel();
    pCancelbooking.setBounds(442, 23, 250, 50);
    pCancelbooking.setBackground(Color.gray);
    add(pCancelbooking);
    
    bCheckin = new JButton("Check In");
    bCheckin.setBounds(80, 200, 200, 50);
    bCheckin.setFont(new Font("Rockwell", Font.BOLD, 20));
    bCheckin.addActionListener(this);
    
    lP = new JLabel("Type your ID to delete your Personal Data");
    lP.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lP.setBounds(400, 150, 450, 40);
    add(lP);

    tfP = new JTextField();
    tfP.setBounds(400, 200, 250, 40);
    add(tfP);

    lB = new JLabel("Type your ID to delete your Booking Data");
    lB.setFont(new Font("Times New Roman", Font.BOLD, 15));
    lB.setBounds(400, 320, 450, 40);
    add(lB);

    tfB = new JTextField();
    tfB.setBounds(400, 370, 250, 40);
    add(tfB);
    
    bRoombooking = new JButton("Room Booking");
    bRoombooking.setBounds(80, 270, 200, 50);
    bRoombooking.setFont(new Font("Rockwell", Font.BOLD, 20));
    bRoombooking.addActionListener(this);
    
    bRooms = new JButton("Rooms");
    bRooms.setBounds(80, 340, 200, 50);
    bRooms.setFont(new Font("Rockwell", Font.BOLD, 20));
    bRooms.addActionListener(this);
    
    bCancelbooking = new JButton("Cancel Booking");
    bCancelbooking.setBounds(80, 410, 200, 50);
    bCancelbooking.setFont(new Font("Rockwell", Font.BOLD, 20));
    bCancelbooking.setBackground(Color.orange);
    bCancelbooking.addActionListener(this);

    bCancelP = new JButton("Delete my personal data");
    bCancelP.setBounds(560, 270,380, 50);
    bCancelP.setFont(new Font("Rockwell", Font.BOLD, 20));
    bCancelP.setBackground(Color.orange);
    bCancelP.addActionListener(this);
    
    bCancelB = new JButton("Delete my Booking");
    bCancelB.setBounds(560, 440,380, 50);
    bCancelB.setFont(new Font("Rockwell", Font.BOLD, 20));
    bCancelB.setBackground(Color.orange);
    bCancelB.addActionListener(this);
    
    bHome = new JButton("Home");
    bHome.setBounds(40, 570, 100, 40);
    bHome.setFont(new Font("Rockwell", Font.BOLD, 15));
    bHome.addActionListener(this);
    
    add(bCheckin);
    add(bRoombooking);
    add(bRooms);
    add(bCancelbooking);
    add(bHome);
    add(bCancelP);
    add(bCancelB);
    
 
    pBackground = new JPanel();
    pBackground.setBounds(0, 0, 1080, 720);
    pBackground.setBackground(Color.gray);
    add(pBackground);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String url = "jdbc:mysql://localhost:3306/login";
        String username = "root";
        String password = "1234";
        
  
     
       if(e.getSource()==bCheckin){
         dispose();
         Checkin ci = new Checkin();
         ci.setVisible(true);
       }else if(e.getSource()==bRoombooking){
         dispose();
         Roombooking rb = new Roombooking();
         rb.setVisible(true);
       }else if (e.getSource()==bRooms){
         dispose();
         Rooms r = new Rooms();
         r.setVisible(true);
       }else if (e.getSource()==bCancelbooking){
         
    
       }else if (e.getSource()==bHome){
         dispose();
         MainPage mp = new MainPage(); 
         mp.setVisible(true);
       }else if(e.getSource()== bCancelP){
              try{ Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "1234");
              

              int idp = Integer.parseInt(tfP.getText());

              String sql = "DELETE FROM personaldata where id = "+ idp;
              
              
             
              Statement statement = conn.createStatement();
              
              int rows = statement.executeUpdate(sql);
              
              if (rows > 0){
                 JOptionPane.showMessageDialog(this, "Deleted successful!");
              }
            
          }catch (SQLException ex) {
      
            ex.printStackTrace();
        }
       }else if(e.getSource()== bCancelB){
              try{ Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "1234");
              
              int idB = Integer.parseInt(tfB.getText());
              String sql = "DELETE FROM booking where id = "+ idB;
              
              
             
              Statement statement = conn.createStatement();
              
              int rows = statement.executeUpdate(sql);
              
              if (rows > 0){
                 JOptionPane.showMessageDialog(this, "Deleted successful!");
              }
            
          }catch (SQLException ex) {
      
        }
    }
    }
}

