import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.Container;//Abstract window toolkit
import java.awt.Color;
public class First{
    public static void main(String args[]){
        JFrame frame=new JFrame();
        frame.setVisible(true);
        //frame.setSize(1000,500);frame.setLocation(100,100);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,100,1000,500);
        frame.setTitle("-----ATM MACHINE-----");
        ImageIcon icon=new ImageIcon("R.png"); 
        frame.setIconImage(icon.getImage());
        Container con=new Container(); 
        con=frame.getContentPane();//it is must for changing the background color
        Color C=new Color(173,216,230);
        // frame.setResizable(false);
        con.setBackground(C);
        // JOptionPane.showMessageDialog(frame,"How are you?");
        // JOptionPane.showMessageDialog(null,"Good Bye"); 
    }
}