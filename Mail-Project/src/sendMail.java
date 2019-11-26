import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class sendMail extends JFrame implements ActionListener{
	//4
	sendMail(){
		JPanel panel = new JPanel(new FlowLayout());
		JTextField recipient = new JTextField("받을사람",20);
		JTextField title = new JTextField("제목",20);
		JTextArea content = new JTextArea("내용",10,20);
		JScrollPane scrollPane = new JScrollPane(content);
		JButton send = new JButton("전송");
		panel.add(recipient);
		panel.add(title);
		panel.add(scrollPane);
		panel.add(send);
		
		
		setContentPane(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Send Mail");
		setSize(300,300);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
