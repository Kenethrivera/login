
import java.awt.*;
import javax.swing.*;



public class Login{
    
    public static JFrame frame1;
    
    public static void main(String[]args){
        
        frame1 = new JFrame("WELCOME");
        frame1.setSize(500,500);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setResizable(false);
        //frame1.setLayout(new BorderLayout());
        frame1.setLocationRelativeTo(null);
        
        JLabel label1 = new JLabel("WELCOME");
        label1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        label1.setForeground(Color.BLACK);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setBounds(0, 170 ,500,50);
        
        
        
        ImageIcon wicon = new ImageIcon("welcome.jpg");
        Image icon1 = wicon.getImage();
        Image resize = icon1.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        wicon = new ImageIcon(resize);
        
        JLabel label2 = new JLabel();
        label2.setIcon(wicon);
        label2.setBounds(0, 0, 500, 500);
        
        
        
        JLayeredPane layer1 = new JLayeredPane();
        layer1.setPreferredSize(new Dimension(500,500));
        layer1.add(label2, Integer.valueOf(0));
        layer1.add(label1, Integer.valueOf(1));
        
        frame1.add(layer1);
        frame1.setVisible(true);
        
    }
    
}