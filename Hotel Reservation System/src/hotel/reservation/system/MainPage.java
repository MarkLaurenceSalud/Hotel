/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Mark
 */
public class MainPage extends JFrame implements ActionListener{
    
    
    
    
    JLabel lHello, lWelcome, lLogo, lCheck, lRoom, lRoomb, lCancel;
    JButton bCheckin, bRoombooking, bRooms, bCancelbooking, bLogout;
    JPanel pWelcome, pBackground;
    
  MainPage(){
    setResizable(false);
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setBounds(0, 0, 1080, 720);
    
     lHello = new JLabel("Hello Client!");
     lHello.setBounds(750, 20, 100, 30);
     lHello.setFont(new Font("Times New Roman", Font.BOLD, 15));
     add(lHello);
     
     lWelcome = new JLabel("Welcome to Hotel Titanic");
     lWelcome.setFont(new Font("Times New Roman", Font.BOLD, 35));
     lWelcome.setBounds(400, 150, 400, 30);
     add(lWelcome);
     
     pWelcome = new JPanel();
     pWelcome.setBounds(370, 90, 350, 50);
     pWelcome.setBackground(Color.gray);
     add(pWelcome);
     
     bCheckin = new JButton("Check in");
     bCheckin.setFont(new Font("Rockwell", Font.BOLD, 20));
     bCheckin.setForeground(Color.black);
     bCheckin.setBounds(250, 350, 250, 60);
     bCheckin.addActionListener(this);
     
     bRoombooking = new JButton("Room Booking");
     bRoombooking.setFont(new Font("Rockwell", Font.BOLD, 20));
     bRoombooking.setForeground(Color.black);
     bRoombooking.setBounds(250, 600, 250, 60);
     bRoombooking.addActionListener(this);
     
     bRooms = new JButton("Rooms");
     bRooms.setFont(new Font("Rockwell", Font.BOLD, 20));
     bRooms.setForeground(Color.black);
     bRooms.setBounds(720, 350, 250, 60);
     bRooms.addActionListener(this);
     
     bCancelbooking = new JButton("Cancel Booking");
     bCancelbooking.setFont(new Font("Rockwell", Font.BOLD, 20));
     bCancelbooking.setForeground(Color.black);
     bCancelbooking.setBounds(720, 600, 250, 60);
     bCancelbooking.addActionListener(this);
     
     bLogout = new JButton("Logout");
     bLogout.setFont(new Font("Rockwell", Font.BOLD, 10));
     bLogout.setForeground(Color.black);
     bLogout.setBounds(850, 25, 70, 25);
     bLogout.addActionListener(this);
     
     lLogo = new JLabel();
     lLogo.setBounds(10, -20, 300, 300);
     ImageIcon img1 = new ImageIcon(new ImageIcon("logo.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
     lLogo.setIcon(img1);
     add(lLogo);
     
     lCheck = new JLabel();
     lCheck.setBounds(300, 180, 200, 200);
     ImageIcon img2 = new ImageIcon(new ImageIcon("checkin.png").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
     lCheck.setIcon(img2);
     add(lCheck);
     
     lRoom = new JLabel();
     lRoom.setBounds(770, 115, 300, 300);
     ImageIcon img3 = new ImageIcon(new ImageIcon("rooms.png").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
     lRoom.setIcon(img3);
     add(lRoom);
     
     lRoomb = new JLabel();
     lRoomb.setBounds(300, 360, 300, 300);
     ImageIcon img4 = new ImageIcon(new ImageIcon("Roombooking.png").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
     lRoomb.setIcon(img4);
     add(lRoomb);
     
     lCancel = new JLabel();
     lCancel.setBounds(770, 390, 300, 300);
     ImageIcon img5 = new ImageIcon(new ImageIcon("Cancel.png").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
     lCancel.setIcon(img5);
     add(lCancel);
     
     add(bCheckin); 
     add(bRoombooking); 
     add(bRooms); 
     add(bCancelbooking); 
     add(bLogout);
     
     pBackground = new JPanel();
     pBackground.setBounds(0, 0, 1080, 720);
     pBackground.setBackground(Color.gray);
     add(pBackground);
     
     
  }

    @Override
    public void actionPerformed(ActionEvent e) {
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
         dispose();
         Cancelbooking cb = new Cancelbooking();
         cb.setVisible(true);
       }else if (e.getSource()==bLogout){
         dispose();
         Login L = new Login();
         L.setVisible(true);
       
    }
       
}
}