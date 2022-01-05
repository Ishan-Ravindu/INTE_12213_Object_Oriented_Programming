package Lab5.auth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class LoginFrame extends JFrame implements ActionListener {
 
    Container container = getContentPane();
    JLabel emailLabel = new JLabel("EMAIL");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField emailTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");
 
 
    public LoginFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
 
    }
 
    public void setLayoutManager() {
        container.setLayout(null);
    }
 
    public void setLocationAndSize() {
        emailLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        emailTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);
 
 
    }
 
    public void addComponentsToContainer() {
        container.add(emailLabel);
        container.add(passwordLabel);
        container.add(emailTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }
 
    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {

            String email = emailTextField.getText();
            char[] pwdText = passwordField.getPassword();
            String pwd = new String(pwdText);
            Login login = new Login(email,pwd);
            if (login.signIn()) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
 
        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            emailTextField.setText("");
            passwordField.setText("");
        }
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
 
 
        }
    }
 
}
