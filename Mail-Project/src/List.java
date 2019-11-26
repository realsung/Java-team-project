import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class List extends JFrame implements ActionListener,ListSelectionListener{
	JList mailList;
	List(){
		//2번
		JPanel panel = new JPanel(new FlowLayout());
		
		int mailcnt = 10;
		JPanel[] mailPanels = new JPanel[mailcnt];
		
		String[] alist = {"sung","asd","asdd","gg","asdg","xxx","zzz","jjj","Asd","Asd","Asd","asd","asd","Asd","asd"
				,"asd","Asd,","Fdgfg"}; //메일 받은거 제목(10), 내용(20), 보낸사람 나오게
		String[] blist = {"123123@gmailcom","asd","asdd","gg","asdg","xxx","zzz","jjj","Asd","Asd","Asd","asd","asd","Asd","asd"
				,"asd","Asd,","Fdgfg"};
		String[] clist = {"sungadflsdfmklfdafsjflksdfjsldkfdlfmsdlfmsdlfmsdlkfsmdflsmdfldfdasfmsldfmsdklfmladmfllsmdlf","asd","asdd","gg","asdg","xxx","zzz","jjj","Asd","Asd","Asd","asd","asd","Asd","asd"
				,"asd","Asd,","Fdgfg"};
		for (int i=0;i<alist.length;i++) {
			alist[i]="받는사람-"+alist[i]+"-"+blist[i]+"-"+clist[i];
		}
		mailList = new JList(alist);
		mailList.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		mailList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mailList.addListSelectionListener(this);
		mailList.setPreferredSize(new Dimension(500, 300));
		panel.add(new JScrollPane(mailList));
		JButton sendMail = new JButton("send mail");
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
		setSize(560,300);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new sendMail();
		dispose();
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		if (e == null || mailList.getSelectedIndex() < 0) {
            return;
        }
		String data=(String)mailList.getSelectedValue();
		new Clickmail(data);
		dispose();
	}
}
