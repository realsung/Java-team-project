import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class List extends JFrame implements ActionListener{
	List(){
		//2번
		JPanel panel = new JPanel(new FlowLayout());
		
		int mailcnt = 10;
		JPanel[] mailPanels = new JPanel[mailcnt];
		
		String[] alist = {"sung","asd","asdd","gg","asdg","xxx","zzz","jjj","Asd","Asd","Asd","asd","asd","Asd","asd"
				,"asd","Asd,","Fdgfg"}; //메일 받은거 제목(10), 내용(20), 보낸사람 나오게
		String[] blist = {"sung","asd","asdd","gg","asdg","xxx","zzz","jjj","Asd","Asd","Asd","asd","asd","Asd","asd"
				,"asd","Asd,","Fdgfg"};
		String[] clist = {"sung","asd","asdd","gg","asdg","xxx","zzz","jjj","Asd","Asd","Asd","asd","asd","Asd","asd"
				,"asd","Asd,","Fdgfg"};
		JList mailList = new JList(alist);
		mailList.setPreferredSize(new Dimension(540, 380));
		panel.add(new JScrollPane(mailList));
		
		JButton sendMail = new JButton("Send Mail");
		sendMail.addActionListener(this);
		
		/*
		for(int i=0; i < 10; i++){
			mailPanels[i] = new JPanel(new FlowLayout());
			mailPanels[i].add(new JLabel("AAAA"));
		}
		
		/*
		for(int i=0; i < 10; i++) {
			panel.add(mailPanels[i]);
			
		}
		*/
		panel.add(sendMail);
		
		setContentPane(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Mail List");
		setSize(600,500);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new sendMail();
		dispose();
		
	}
}

