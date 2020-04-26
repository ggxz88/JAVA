package mini_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingLogin extends JFrame implements ActionListener {
	JPanel panel;
	JLabel user_label, password_label, message;
	JTextField userName_text;
	JPasswordField password_text;
	JButton submit;
	
	SwingLogin() {
		
		// User Label
		user_label = new JLabel();
		user_label.setText("User Name :");
		userName_text = new JTextField();
		
		// Password
		password_label = new JLabel();
		password_label.setText("Password : ");
		password_text = new JPasswordField();
		
		// Submit
		submit = new JButton("제출");
		
		panel = new JPanel(new GridLayout(4, 2));
		
		panel.add(user_label);
		panel.add(userName_text);
		panel.add(password_label);
		panel.add(password_text);
		
		message = new JLabel();
		panel.add(message);
		panel.add(submit);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Adding the listeners to components
		submit.addActionListener(this);
		add(panel, BorderLayout.CENTER);
		setTitle("Login");
		setSize(400, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingLogin();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String userName = userName_text.getText();
		String password = password_text.getText();
		if (userName.trim().equals("admin") && password.trim().equals("admin")) {
			message.setText(" Hello " + userName + "");
		}
		else {
			message.setText(" Invalid user ");
		}
	}

}
