package Lab5.auth;
import Lab5.stock.StockFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class LoginFrame extends JFrame implements ActionListener {
 
    JFrame frame = new JFrame();
    JLabel emailLabel = new JLabel("EMAIL");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField emailTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");
 
 
    public LoginFrame() {
        //set layout
        frame.setLayout(null);
        //set location and size
        emailLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        emailTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);
        //addComponentsToFrame
        frame.add(emailLabel);
        frame.add(passwordLabel);
        frame.add(emailTextField);
        frame.add(passwordField);
        frame.add(showPassword);
        frame.add(loginButton);
        frame.add(resetButton);
        // addActionEvent
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
        //other
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(450, 100, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginButton) {

            String email = emailTextField.getText();
            char[] pwdText = passwordField.getPassword();
            String pwd = new String(pwdText);
            Login login = new Login(email,pwd);
            if (login.signIn()) {
                frame.dispose();
                new StockFrame();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
 
        }

        if (e.getSource() == resetButton) {
            emailTextField.setText("");
            passwordField.setText("");
        }

        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
 
 
        }
    }
 
}
