package Lab5.stock;

import javax.swing.*;

import Lab5.auth.LoginFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StockFrame extends JFrame implements ActionListener{
    JFrame frame =new JFrame();
    JLabel label = new JLabel("hello");
    JButton logoutButton = new JButton("LOGOUT");
    
 
    public StockFrame() {
        //set layout
        frame.setLayout(null);
        //set location and size
        label.setBounds(50, 150, 100, 30);
        //addComponentsToFrame
        frame.add(label);
        frame.add(logoutButton);
        //set location and size
        logoutButton.setBounds(100, 100, 100, 100);
        // addActionEvent
        logoutButton.addActionListener(this);
        
         //other
        frame.setTitle("MAIN PAGE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(250, 100, 850, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logoutButton) {
            frame.dispose();
            new LoginFrame();
      }
 
}
}