package com.project.atm;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI implements ActionListener {
    private JFrame frame;
    private JLabel accountNumberLabel;
    private JLabel passwordLabel;
    private JTextField accountNumberField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginGUI() {
        frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);

        accountNumberLabel = new JLabel("Account Number:");
        accountNumberField = new JTextField(20);
        passwordLabel = new JLabel("Password");
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");
        messageLabel = new JLabel();

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        frame.add(accountNumberLabel);
        frame.add(accountNumberField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(messageLabel);

        loginButton.addActionListener(this);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String accountNumberString = accountNumberField.getText();
            try {
                int accountNumber = Integer.parseInt(accountNumberString);
                String password = new String(passwordField.getPassword());

                if (accountNumber == 12345 && password.equals("password")) {
                    messageLabel.setText("Login Successful");
                } else {
                    messageLabel.setText("Invalid Login Details");
                }
            } catch (NumberFormatException ex) {
                messageLabel.setText("Please enter a valid account number");
            }
        }
    }
}
