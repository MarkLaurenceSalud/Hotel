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
public class Roombooking extends JFrame implements ActionListener{
    
    private static final String username = "root";
     private static final String password = "1234";
     private static final String dataConn = "jdbc:mysql://localhost:3306/login";

     Connection sqlConn = null;
     PreparedStatement pst = null;
     ResultSet rs = null;
    
    JButton bCheckin, bRoombooking, bRooms, bCancelbooking, bHome, bCheckout, bClear;
    JLabel lRoombooking, lLogo, lIn, lOut, lNumber, lType, lFormat;
    JPanel pRoombooking, pBackground, pBackground2;
    JTextField tfin, tfout, tfnumber, tftype;
    
    Roombooking(){
    setResizable(false);
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setBounds(0, 0, 1080, 720);
    
    lRoombooking = new JLabel("Room Booking");
    lRoombooking.setFont(new Font("Times New Roman", Font.BOLD, 35));
    lRoombooking.setBounds(580, 100, 250, 40);
    add(lRoombooking);
    
    lLogo = new JLabel();
    lLogo.setBounds(10, -20, 300, 300);
    ImageIcon img1 = new ImageIcon(new ImageIcon("logo.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
    lLogo.setIcon(img1);
    add(lLogo);
    
    lIn = new JLabel("Check In Date: ");
    lIn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    lIn.setBounds(400, 275, 150, 25);
    lIn.setForeground(Color.white);
    add(lIn);
    
    lOut = new JLabel("Check Out Date: ");
    lOut.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    lOut.setBounds(400, 325, 150, 25);
    lOut.setForeground(Color.white);
    add(lOut);
    
    lNumber = new JLabel("Number of People: ");
    lNumber.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    lNumber.setBounds(400, 375, 170, 25);
    lNumber.setForeground(Color.white);
    add(lNumber);
    
    lType = new JLabel("Room Type");
    lType.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    lType.setBounds(400, 425, 100, 25);
    lType.setForeground(Color.white);
    add(lType);
    
    lFormat = new JLabel("Use The Format:           mm/dd/yy");
    lFormat.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    lFormat.setBounds(400, 230, 300, 25);
    lFormat.setForeground(Color.white);
    add(lFormat);
    
    tfin = new JTextField();
    tfin.setBounds(560, 275, 150, 25);
    add(tfin);
    
    tfout = new JTextField();
    tfout.setBounds(560, 325, 150, 25);
    add(tfout);
    
    tfnumber = new JTextField();
    tfnumber.setBounds(560, 375, 150, 25);
    add(tfnumber);
    
    tftype = new JTextField();
    tftype.setBounds(560, 425, 150, 25);
    add(tftype);
    
    pRoombooking = new JPanel();
    pRoombooking.setBounds(435, 23, 250, 50);
    pRoombooking.setBackground(Color.gray);
    add(pRoombooking);
  
    bCheckin = new JButton("Check In");
    bCheckin.setBounds(80, 200, 200, 50);
    bCheckin.setFont(new Font("Rockwell", Font.BOLD, 20));
    bCheckin.addActionListener(this);
    
    bRoombooking = new JButton("Room Booking");
    bRoombooking.setBounds(80, 270, 200, 50);
    bRoombooking.setFont(new Font("Rockwell", Font.BOLD, 20));
    bRoombooking.setBackground(Color.orange);
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
    bClear.setBounds(630, 570, 120, 40);
    bClear.setFont(new Font("Rockwell", Font.BOLD, 15));
    bClear.setBackground(Color.white);
    bClear.addActionListener(this);
    
    bCheckout = new JButton("Checkout");
    bCheckout.setBounds(770, 570, 120, 40);
    bCheckout.setFont(new Font("Rockwell", Font.BOLD, 15));
    bCheckout.setBackground(Color.green);
    bCheckout.addActionListener(this);
    
    add(bCheckin);
    add(bRoombooking);
    add(bRooms);
    add(bCancelbooking);
    add(bHome);
    add(bCheckout);
    add(bClear);
    
    pBackground = new JPanel();
    pBackground.setBounds(320, 150, 700, 500);
    pBackground.setBackground(Color.darkGray);
    add(pBackground);
    
    pBackground2 = new JPanel();
    pBackground2.setBounds(0, 0, 1080, 720);
    pBackground2.setBackground(Color.gray);
    add(pBackground2);
 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String checkin = tfin.getText();
        String checkout = tfout.getText();
        String numberofpeople = tfnumber.getText();
        String roomtype = tftype.getText();
   
       if(e.getSource()==bCheckin){
         dispose();
         Checkin ci = new Checkin();
         ci.setVisible(true);
       }else if(e.getSource()==bRoombooking){
         
       }else if (e.getSource()==bRooms){
         dispose();
         Rooms r = new Rooms();
         r.setVisible(true);
       }else if (e.getSource()==bCancelbooking){
         dispose();
         Cancelbooking cb = new Cancelbooking();
         cb.setVisible(true);
       }else if (e.getSource()==bCheckout){
         try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "1234");
            String query = "INSERT INTO booking (checkindate, checkoutdate, numberofpeople, roomtype) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, checkin);
            preparedStatement.setString(2, checkout);
            preparedStatement.setString(3, numberofpeople);
             preparedStatement.setString(4, roomtype);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Room Booking added successfully!");
            tfin.setText("");
            tfout.setText("");
            tfnumber.setText("");
            tftype.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add data.");
            }

            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }        
       }else if (e.getSource()==bHome){
         dispose();
         MainPage mp = new MainPage(); 
         mp.setVisible(true);
       }else if(e.getSource()== bClear){
            tfin.setText("");
            tfout.setText("");
            tfnumber.setText("");
            tftype.setText("");

        } 
}
}
