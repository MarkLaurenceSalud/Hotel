/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Mark
 */
public class Checkin extends JFrame implements ActionListener{
    
    private static final String username = "root";
     private static final String password = "1234";
     private static final String dataConn = "jdbc:mysql://localhost:3306/login";

     Connection sqlConn = null;
     PreparedStatement pst = null;
     ResultSet rs = null;
   
    
    JButton bCheckin, bRoombooking, bRooms, bCancelbooking, bHome, bSubmit, bClear;
    JLabel lCheckin, lLogo, lName, lPhone, lEmail, lAddress, lCity, lNationality, lPersonaldata;
    JTextField tfName, tfPhone, tfEmail, tfAddress, tfCity, tfNationality;
    JPanel pCheckin, pPersonaldata, ppd, pBackground;
    
    
    Checkin(){
    setResizable(false);
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setBounds(0, 0, 1080, 720);
    
    lCheckin = new JLabel("Check in");
    lCheckin.setFont(new Font("Times New Roman", Font.BOLD, 35));
    lCheckin.setBounds(450, 30, 150, 40);
    add(lCheckin);
    
    lLogo = new JLabel();
    lLogo.setBounds(10, -20, 300, 300);
    ImageIcon img1 = new ImageIcon(new ImageIcon("logo.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
    lLogo.setIcon(img1);
    add(lLogo);
    
    lPersonaldata = new JLabel("Personal Data");
    lPersonaldata.setFont(new Font("Times New Roman", Font.BOLD, 25));
    lPersonaldata.setBounds(430, 100, 250, 40);
    add(lPersonaldata);
    
    lName = new JLabel("Name");
    lName.setFont(new Font("Times New Roman", Font.PLAIN, 25));
    lName.setBounds(330, 190, 100, 20);
    lName.setForeground(Color.white);
    add(lName);
    
    lPhone = new JLabel("Phone");
    lPhone.setFont(new Font("Times New Roman", Font.PLAIN, 25));
    lPhone.setBounds(330, 270, 100, 20);
    lPhone.setForeground(Color.white);
    add(lPhone);
    
    lEmail = new JLabel("Email");
    lEmail.setFont(new Font("Times New Roman", Font.PLAIN, 25));
    lEmail.setBounds(330, 350, 100, 20);
    lEmail.setForeground(Color.white);
    add(lEmail);
    
    lAddress = new JLabel("Address");
    lAddress.setFont(new Font("Times New Roman", Font.PLAIN, 25));
    lAddress.setBounds(330, 430, 100, 20);
    lAddress.setForeground(Color.white);
    add(lAddress);
    
    lCity = new JLabel("City");
    lCity.setFont(new Font("Times New Roman", Font.PLAIN, 25));
    lCity.setBounds(330, 510, 100, 30);
    lCity.setForeground(Color.white);
    add(lCity);
    
    lNationality = new JLabel("Nationality");
    lNationality.setFont(new Font("Times New Roman", Font.PLAIN, 25));
    lNationality.setBounds(330, 590, 150, 30);
    lNationality.setForeground(Color.white);
    add(lNationality);
    
    tfName = new JTextField();
    tfName.setBounds(450, 190, 230, 30); 
    add( tfName);
    
    tfPhone = new JTextField();
    tfPhone.setBounds(450, 270, 230, 30); 
    add( tfPhone);
    
    tfEmail = new JTextField();
    tfEmail.setBounds(450, 350, 230, 30); 
    add( tfEmail);
    
    tfAddress = new JTextField();
    tfAddress.setBounds(450, 430, 230, 30); 
    add( tfAddress);
    
    tfCity = new JTextField();
    tfCity.setBounds(450, 510, 230, 30); 
    add( tfCity);
    
    tfNationality = new JTextField();
    tfNationality.setBounds(450, 590, 230, 30); 
    add( tfNationality);
    
    ppd = new JPanel();
    ppd.setBounds(410, 100, 200, 40);
    ppd.setBackground(Color.lightGray);
    add(ppd);
    
    pPersonaldata = new JPanel();
    pPersonaldata.setBounds(320, 150, 380, 500);
    pPersonaldata.setBackground(Color.darkGray);
    add(pPersonaldata);
  
    bCheckin = new JButton("Check In");
    bCheckin.setBounds(80, 200, 200, 50);
    bCheckin.setFont(new Font("Rockwell", Font.BOLD, 20));
    bCheckin.setBackground(Color.orange);
    bCheckin.addActionListener(this);
        
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
    bCancelbooking.addActionListener(this);
    
    bHome = new JButton("Home");
    bHome.setBounds(40, 570, 100, 40);
    bHome.setFont(new Font("Rockwell", Font.BOLD, 15));
    bHome.addActionListener(this);
    
    bClear = new JButton("Clear");
    bClear.setBounds(780, 570, 100, 30);
    bClear.setFont(new Font("Rockwell", Font.BOLD, 15));
    bClear.setBackground(Color.white);
    bClear.addActionListener(this); 

    
    
    bSubmit = new JButton("Submit");
    bSubmit.setBounds(890, 570, 100, 30);
    bSubmit.setFont(new Font("Rockwell", Font.BOLD, 15));
    bSubmit.setBackground(Color.green);
    bSubmit.addActionListener(this);
    
    
    add(bCheckin);
    add(bRoombooking);
    add(bRooms);
    add(bCancelbooking);
    add(bHome);
    add(bClear);
    add(bSubmit);
               
    pBackground = new JPanel();
     pBackground.setBounds(0, 0, 1080, 720);
     pBackground.setBackground(Color.gray);
     add(pBackground);
 
    }
   
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String name = tfName.getText();
        String phone = tfPhone.getText();
        String email = tfEmail.getText();
        String address = tfAddress.getText();
        String city = tfCity.getText();
        String nationality = tfNationality.getText();
        
       if(e.getSource()==bCheckin){
         
       }else if(e.getSource()==bRoombooking){
         dispose();
         Roombooking rb = new Roombooking();
         rb.setVisible(true);
       }else if (e.getSource()==bRooms){
         dispose();
         Rooms r = new Rooms();
         r.setVisible(true);
       }else if (e.getSource()==bCancelbooking){
         dispose();
         Cancelbooking cb = new Cancelbooking();
         cb.setVisible(true);
       }else if (e.getSource()==bHome){
         dispose();
         MainPage mp = new MainPage(); 
         mp.setVisible(true);
       }else if(e.getSource()== bClear){
            tfName.setText("");
            tfPhone.setText("");
            tfEmail.setText("");
            tfAddress.setText("");
            tfCity.setText("");
            tfNationality.setText("");
        }else if(e.getSource()== bSubmit){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "1234");
            String query = "INSERT INTO personaldata (name, phone, email, address, city, nationality) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, phone);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, city);
            preparedStatement.setString(6, nationality);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Personal Data added successfully!");
            tfName.setText("");
            tfPhone.setText("");
            tfEmail.setText("");
            tfAddress.setText("");
            tfCity.setText("");
            tfNationality.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add data.");
            }

            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
        
        }
 
    }

}

