import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Store;

public class MailListView {

    MailListView(GmailClass gmc) throws MessagingException {

        Folder inbox = gmc.store.getFolder("inbox");
        inbox.open(Folder.READ_ONLY);
        int messageCount = inbox.getMessageCount();

        System.out.println("Total Messages:- " + messageCount);

        Message[] messages = inbox.getMessages();

        for(int i = 0; i < messageCount; i++){
            System.out.println(messages[i].getSubject());
        }

    }
}
