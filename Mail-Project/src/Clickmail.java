package mail;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Clickmail  extends JFrame implements ActionListener{
	Clickmail(String data){
		String[] array = data.split("-");
		JPanel panel = new JPanel(new FlowLayout());
		JTextField recipient = new JTextField(array[1],20);
		JTextField title = new JTextField(array[2],20);
		JTextArea content = new JTextArea(array[3],10,20);
		JScrollPane scrollPane = new JScrollPane(content);
		JButton back = new JButton("돌아가기");
		back.addActionListener(this);
		
		panel.add(new JLabel("받은이메일"));
		panel.add(recipient);
		panel.add(new JLabel("제목"));
		panel.add(title);
		panel.add(scrollPane);
		panel.add(back);
		
		
		setContentPane(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Clickmail");
		setSize(300,400);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new List();
		dispose();	
	}

}
