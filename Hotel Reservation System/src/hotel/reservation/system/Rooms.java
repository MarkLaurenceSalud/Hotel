/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Mark
 */
public class Rooms extends JFrame implements ActionListener{
    
    JButton bCheckin, bRoombooking, bRooms, bCancelbooking, bHome;
    JLabel lRooms, lLogo, lSingle, lDouble, lTriple, lsingle,ldouble,ltriple, lS24, lD24, lT24;
    JPanel pRooms, pBackground, pSingle, pDouble, pTriple, pBackground2;
    
    Rooms(){
    setResizable(false);
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setBounds(0, 0, 1080, 720);
    
    lRooms = new JLabel("Rooms");
    lRooms.setFont(new Font("Times New Roman", Font.BOLD, 35));
    lRooms.setBounds(610, 100, 250, 40);
    add(lRooms);
    
    lLogo = new JLabel();
    lLogo.setBounds(10, -20, 300, 300);
    ImageIcon img4 = new ImageIcon(new ImageIcon("logo.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
    lLogo.setIcon(img4);
    add(lLogo);
    
    lSingle = new JLabel("Single");
    lSingle.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    lSingle.setBounds(400, 175, 100, 25);
    lSingle.setForeground(Color.white);
    add(lSingle);
    
    lDouble = new JLabel("Double");
    lDouble.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    lDouble.setBounds(630, 175, 115, 25);
    lDouble.setForeground(Color.white);
    add(lDouble);
    
    lTriple = new JLabel("Triple");
    lTriple.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    lTriple.setBounds(880, 175, 115, 25);
    lTriple.setForeground(Color.white);
    add(lTriple);
    
    lS24 = new JLabel("₱ 2,000.00 / 24 Hours");
    lS24.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    lS24.setBounds(340, 475, 200, 25);
    lS24.setForeground(Color.white);
    add(lS24);
    
    lD24 = new JLabel("₱ 3,000.00 / 24 Hours");
    lD24.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    lD24.setBounds(585, 475, 200, 25);
    lD24.setForeground(Color.white);
    add(lD24);
    
    lT24 = new JLabel("₱ 4,500.00 / 24 Hours");
    lT24.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    lT24.setBounds(830, 475, 200, 25);
    lT24.setForeground(Color.white);
    add(lT24);
    
    lsingle = new JLabel();
    lsingle.setBounds(330, 175, 300, 300);
    ImageIcon img1 = new ImageIcon(new ImageIcon("single.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
    lsingle.setIcon(img1);
    add(lsingle);
    
    pSingle = new JPanel();
    pSingle.setBounds(390, 175, 70, 30);
    pSingle.setBackground(Color.lightGray);
    add(pSingle);
    
    ldouble = new JLabel();
    ldouble.setBounds(570, 175, 300, 300);
    ImageIcon img2 = new ImageIcon(new ImageIcon("double.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
    ldouble.setIcon(img2);
    add(ldouble);
    
    pDouble = new JPanel();
    pDouble.setBounds(625, 175, 70, 30);
    pDouble.setBackground(Color.lightGray);
    add(pDouble);
    
    ltriple = new JLabel();
    ltriple.setBounds(810, 175, 300, 300);
    ImageIcon img3 = new ImageIcon(new ImageIcon("triple.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
    ltriple.setIcon(img3);
    add(ltriple);
    
    pTriple = new JPanel();
    pTriple.setBounds(870, 175, 70, 30);
    pTriple.setBackground(Color.lightGray);
    add(pTriple);
    
    pRooms = new JPanel();
    pRooms.setBounds(435, 23, 130, 50);
    pRooms.setBackground(Color.gray);
    add(pRooms);
    
    pBackground = new JPanel();
    pBackground.setBounds(320, 150, 700, 500);
    pBackground.setBackground(Color.darkGray);
    add(pBackground);
  
    bCheckin = new JButton("Check In");
    bCheckin.setBounds(80, 200, 200, 50);
    bCheckin.setFont(new Font("Rockwell", Font.BOLD, 20));
    bCheckin.addActionListener(this);
    
    bRoombooking = new JButton("Room Booking");
    bRoombooking.setBounds(80, 270, 200, 50);
    bRoombooking.setFont(new Font("Rockwell", Font.BOLD, 20));
    bRoombooking.addActionListener(this);
    
    bRooms = new JButton("Rooms");
    bRooms.setBounds(80, 340, 200, 50);
    bRooms.setFont(new Font("Rockwell", Font.BOLD, 20));
    bRooms.setBackground(Color.orange);
    bRooms.addActionListener(this);
    
    bCancelbooking = new JButton("Cancel Booking");
    bCancelbooking.setBounds(80, 410, 200, 50);
    bCancelbooking.setFont(new Font("Rockwell", Font.BOLD, 20));
    bCancelbooking.addActionListener(this);
 
    bHome = new JButton("Home");
    bHome.setBounds(40, 570, 100, 40);
    bHome.setFont(new Font("Rockwell", Font.BOLD, 15));
    bHome.addActionListener(this);
    
    add(bCheckin);
    add(bRoombooking);
    add(bRooms);
    add(bCancelbooking);
    add(bHome);
    
    pBackground2 = new JPanel();
     pBackground2.setBounds(0, 0, 1080, 720);
     pBackground2.setBackground(Color.gray);
     add(pBackground2);
 
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
         
       }else if (e.getSource()==bCancelbooking){
         dispose();
         Cancelbooking cb = new Cancelbooking();
         cb.setVisible(true);
       }else if (e.getSource()==bHome){
         dispose();
         MainPage mp = new MainPage(); 
         mp.setVisible(true);
    }
}
}