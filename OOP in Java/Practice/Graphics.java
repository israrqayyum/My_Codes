import javax.swing.*;
import java.awt.Container;
import java.awt.Color;
class Graphics{
  public static void main(String[] args){
    JFrame Graphics= new JFrame();
    Graphics.setVisible(true);
    
    //Graphics.setLocation(100,100);//First left than right
    //Graphics.setSize(400,300);//width then height
    
    Graphics.setBounds(100,100,1000,500);
    //setBounds method set the location (left then right) first and then width and height it is combination 
    // of these two location and size
    Graphics.setTitle("--------Welcome to ATM--------");
    ImageIcon icon=new ImageIcon("R.png");
    Graphics.setIconImage(icon.getImage());
    
    Container c=Graphics.getContentPane();//it is not defined in swing class
    Color cs=new Color(173, 216, 230);
    //Graphics.setResizable(false);
    c.setBackground(cs); //173, 216, 230
    //JOptionPane.showMessageDialog(Graphics, "How are you?");
    //JOptionPane.showMessageDialog(null, "Good Bye"); 
    //Graphics.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
}
}