package mini_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class game extends JFrame implements ActionListener, KeyListener {
	
	JPanel panel, panelbutton, panelProgress;
	JLabel reply_label;
	JButton submit, reset, recreate, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, backspace ;
	
	StringBuffer textArea = new StringBuffer();
	int textAreaRow = 0;
	StringBuffer answer = new StringBuffer();
	StringBuffer reply = new StringBuffer();
	
	JTextField tfieldView = new JTextField(8);
	JTextArea tAreaView = new JTextArea(20, 40);
	JScrollPane scroll = new JScrollPane(tAreaView);
	
	int LENGTH = 4;
	
	game() {
		
		reply_label = new JLabel();
		reply_label.setText("정답 입력 : ");
		
		RandomNum();
		
		// 버튼 부분
		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		backspace = new JButton("←");
		reset = new JButton("Reset");
		recreate = new JButton("숫자 다시 생성");
		submit = new JButton("제출");
		
		panel = new JPanel();
		panelbutton = new JPanel();
		panelProgress = new JPanel();
		
		tfieldView.setEditable(false);
		tAreaView.setEditable(false);

		// 버튼 생성
		panel.add(reply_label);
		panel.add(tfieldView);
		panel.add(submit);
		panel.add(reset);
		
		panelbutton.add(button1);
		panelbutton.add(button2);
		panelbutton.add(button3);
		panelbutton.add(backspace);
		panelbutton.add(button4);
		panelbutton.add(button5);
		panelbutton.add(button6);
		panelbutton.add(recreate);
		panelbutton.add(button7);
		panelbutton.add(button8);
		panelbutton.add(button9);
		panelbutton.add(button0);
		
		panelProgress.add(scroll);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
		
		// 버튼 액션 리스너
		submit.addActionListener(this);
		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		backspace.addActionListener(this);
		reset.addActionListener(this);
		recreate.addActionListener(this);
		
		// tfieldView 포커스 및 키 리스너 
		tfieldView.requestFocus(); // 키 이벤트를 받을 컴포넌트를 강제로 설정
		tfieldView.addKeyListener(this);
		
		// 프레임 설정
		setLayout(new BorderLayout());
		panelbutton.setLayout(new GridLayout(3, 4, 5, 5)); // 3 x 4에 좌우 간격 5, 상하 간격 5
		
		add(panel, BorderLayout.NORTH);
		add(panelProgress, BorderLayout.CENTER);
		add(panelbutton, BorderLayout.SOUTH);
		
		setTitle("숫자 야구"); // 프레임 타이틀
		setSize(500, 500); // 프레임 크기 
		setVisible(true); // 프레임을 화면에 출력
		
	}

	public static void main(String[] args) {
		new game();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("0")) {
			if(reply.length() < LENGTH) {
				reply.append("0");
				tfieldView.setText(reply.toString());
			}
		}
		
		if(e.getActionCommand().equals("1")) {
			if(reply.length() < LENGTH) {
				reply.append("1");
				tfieldView.setText(reply.toString());
			}
		}
		
		if(e.getActionCommand().equals("2")) {
			if(reply.length() < LENGTH) {
				reply.append("2");
				tfieldView.setText(reply.toString());
			}
		}
		
		if(e.getActionCommand().equals("3")) {
			if(reply.length() < LENGTH) {
				reply.append("3");
				tfieldView.setText(reply.toString());
			}
		}
		
		if(e.getActionCommand().equals("4")) {
			if(reply.length() < LENGTH) {
				reply.append("4");
				tfieldView.setText(reply.toString());
			}
		}
		
		if(e.getActionCommand().equals("5")) {
			if(reply.length() < LENGTH) {
				reply.append("5");
				tfieldView.setText(reply.toString());
			}
		}
		
		if(e.getActionCommand().equals("6")) {
			if(reply.length() < LENGTH) {
				reply.append("6");
				tfieldView.setText(reply.toString());
			}
		}
		
		if(e.getActionCommand().equals("7")) {
			if(reply.length() < LENGTH) {
				reply.append("7");
				tfieldView.setText(reply.toString());
			}
		}
		
		if(e.getActionCommand().equals("8")) {
			if(reply.length() < LENGTH) {
				reply.append("8");
				tfieldView.setText(reply.toString());
			}
		}
		
		if(e.getActionCommand().equals("9")) {
			if(reply.length() < LENGTH) {
				reply.append("9");
				tfieldView.setText(reply.toString());
			}
		}
		
		if(e.getActionCommand().equals("←")) {
			tfieldView.setText(reply.reverse().delete(0, 1).reverse().toString());
		}
		
		if(e.getActionCommand().equals("Reset")) {
			reset();
			RandomNum();
		}
		
		if(e.getActionCommand().equals("제출")) {
			if(tfieldView.getText().isEmpty()) {
				JOptionPane.showMessageDialog(this, "숫자를 입력해주세요.", "주의", JOptionPane.WARNING_MESSAGE);
			}
			else if(reply.length() != LENGTH) {
				JOptionPane.showMessageDialog(this, "숫자 4개를 입력해주세요.", "주의", JOptionPane.WARNING_MESSAGE);
			}
			else if(overlap(tfieldView.getText())) {
				JOptionPane.showMessageDialog(this, "중복된 숫자가 있습니다.", "주의", JOptionPane.WARNING_MESSAGE);
			}
			else {
				Compare();
				reply.delete(0, reply.length());
				tfieldView.setText(reply.toString());
			}
		}
		if(e.getActionCommand().contentEquals("숫자 다시 생성")) {
			RandomNum();
		}
		

		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyChar() == '0') {
			reply.append("0");
			tfieldView.setText(reply.toString());
		}
		
		if (e.getKeyChar() == '1') {
			reply.append("1");
			tfieldView.setText(reply.toString());
		}
		
		if (e.getKeyChar() == '2') {
			reply.append("2");
			tfieldView.setText(reply.toString());
		}
		
		if (e.getKeyChar() == '3') {
			reply.append("3");
			tfieldView.setText(reply.toString());
		}
		
		if (e.getKeyChar() == '4') {
			reply.append("4");
			tfieldView.setText(reply.toString());
		}
		
		if (e.getKeyChar() == '5') {
			reply.append("5");
			tfieldView.setText(reply.toString());
		}
		
		if (e.getKeyChar() == '6') {
			reply.append("6");
			tfieldView.setText(reply.toString());
		}
		
		if (e.getKeyChar() == '7') {
			reply.append("8");
			tfieldView.setText(reply.toString());
		}
		
		if (e.getKeyChar() == '8') {
			reply.append("8");
			tfieldView.setText(reply.toString());
		}
		
		if (e.getKeyChar() == '9') {
			reply.append("9");
			tfieldView.setText(reply.toString());
		}
		
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			tfieldView.setText(reply.reverse().delete(0, 1).reverse().toString());
		}
		
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if(tfieldView.getText().isEmpty()) {
				JOptionPane.showMessageDialog(this, "숫자를 입력해주세요.", "주의", JOptionPane.WARNING_MESSAGE);
			}
			else if(reply.length() != LENGTH) {
				JOptionPane.showMessageDialog(this, "숫자 4개를 입력해주세요.", "주의", JOptionPane.WARNING_MESSAGE);
			}
			else if(overlap(tfieldView.getText())) {
				JOptionPane.showMessageDialog(this, "중복된 숫자가 있습니다.", "주의", JOptionPane.WARNING_MESSAGE);
			}
			else {
				Compare();
				reply.delete(0, reply.length());
				tfieldView.setText(reply.toString());
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_R) {
			reset();
			RandomNum();
		}
		
		if(e.getKeyCode() == KeyEvent.VK_C) {
			RandomNum();
		}
		
		
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void Compare() {
		
		int out = 0;
		int ball = 0;
		int strike = 0;
		
		
		
		for (int i = 0; i < LENGTH; i++) {
			if(answer.charAt(i) == reply.charAt(i)) {
				strike++;
			}
		}
		
		for (int i = 0; i < LENGTH; i++) {
			for(int j = 0; j < LENGTH; j++) {
				if(answer.charAt(i) == reply.charAt(j)) {
					ball++;
				}
			}
		}
		
		textAreaRow++;
		
		out = 4 - strike - ball;
				
		textArea.append("strike : " + strike + ", ball : " + ball + ", out : " + out + " --- " + tfieldView.getText() + "\n");
		tAreaView.setText(textArea.toString());
		
	}
	
	public boolean overlap(String str) {
		boolean over = false;
		for(int i = 0; i < LENGTH-1; i++) {
			for(int j = i + 1; j < LENGTH; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					over = true;
				}
			}
		}
		
		return over;
	}
	
	public void RandomNum() {
		
		answer.append((int)(Math.random() * 9 + 1));
		for (int i=0; i<LENGTH-1; i++) {
			answer.append((int)(Math.random() * 10));
		}
		
		while (overlap(answer.toString())) {
			answer.append((int)(Math.random() * 9 + 1));
			for (int i = 0; i < LENGTH-1; i++) {
				answer.append((int)(Math.random() * 10));
			}	
		}
		
	}
	
	public void reset() {
		reply.delete(0, reply.length());
		answer.delete(0, answer.length());
		textArea.delete(0, textArea.length());
		tfieldView.setText("");
		tAreaView.setText("");
	}
	
}
