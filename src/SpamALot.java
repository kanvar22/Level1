import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SpamALot implements ActionListener {
	static final String FAKE_USERNAME = "jamesbondiscool321@gmail.com";
	static final String FAKE_PASSWORD = "jamesbondiscool123";
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton bt1 = new JButton();
	JButton bt2 = new JButton();
	JTextField jtf = new JTextField(20);

	public static void main(String[] args) {
		SpamALot spamlot = new SpamALot();
	}

	public SpamALot() {
		frame.add(panel);
		bt1.setText("BAD");
		bt2.setText("GOOD");
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		panel.add(jtf);
		panel.add(bt1);
		panel.add(bt2);
		frame.setVisible(true);
		frame.pack();
	}

	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		boolean messageSent = false;
		if (bt1 == e.getSource()) {
			messageSent = sendSpam(jtf.getText(), "Lotery", "Sorry, but your family has wasted a lot of money on lotery ticket so now you have $0.");
			jtf.setBackground(Color.green);
			jtf.setBackground(Color.RED);
		} else {
			messageSent = sendSpam(jtf.getText(), "Lotery", "You have won a $50,000 ticket and if you win then you will get a bonus of a cruise");
			jtf.setBackground(Color.green);
			jtf.setBackground(Color.RED);
		}
	}
}
