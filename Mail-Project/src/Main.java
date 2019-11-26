import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main extends JFrame implements ActionListener{
	JTextField idField;
	JPasswordField pwField;
	//1번
	Main(){
		JPanel panel = new JPanel(new FlowLayout());
		JLabel loginId = new JLabel("ID : ");
		JLabel loginPw = new JLabel("PW : ");
		JButton loginBtn = new JButton("Login");
		idField = new JTextField(15);
		pwField = new JPasswordField(15);
		
		//Login Event
		loginBtn.addActionListener(this);
		setContentPane(panel);
		panel.add(loginId);
		panel.add(idField);
		panel.add(loginPw);
		panel.add(pwField);
		panel.add(loginBtn);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Login");
		setSize(250,180);
		
		
		
	}
	public static void main(String[] args) {
		new Main();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Object obj = e.getSource();
		//if() //로그인 성공 new List(); 
		dispose(); //로그인창 끄기
		//else //팝업 띄움
		
		//로그인창 꺼지고new List();  ㄱ 
		new List();
	}

}
