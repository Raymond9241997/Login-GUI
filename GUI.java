import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


//action listener method allows the main method to have relations to button action by add "implements action listener" parameter
public class GUI implements ActionListener {
	
	//makes it available for all methods
	private static JLabel userlabel;
	private static JTextField userText;
	private static JLabel pwdlabel;
	private static JPasswordField pwdText;
	private static JButton button;
	private static JLabel success;
	
	

	public static void main(String[] args) {
		
		//Creating all the Panels, frameworks,password and text fields
		 userText = new JTextField(20);
		 pwdText = new JPasswordField();
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		
		
		//Setting frame size and closing option
		frame.setSize(350 , 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//adds panel with in the frame work
		frame.add(panel);
		panel.setLayout(null);
		
		//adds the catalog "USER" in the frame work
		userlabel = new JLabel("USER");
		userlabel.setBounds(10, 20, 80, 25);
		panel.add(userlabel);
		
		//adds the catalog "PASSWORD" in the frame work
		pwdlabel = new JLabel("PASSWORD");
		pwdlabel.setBounds(10, 50, 80, 25);
		panel.add(pwdlabel);
		
		
		
		//setting size of user & password text box with in the panel
		//can insert data in text box
		userText.setBounds(100,20,165,25);
		panel.add(userText);
		
		pwdText.setBounds(100,50,165,25);
		panel.add(pwdText);
		
		
		//Adds login button to panel
		button = new JButton("LOGIN");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUI()); //Action for Login
		panel.add(button);
		
		// Login message before login
		success = new JLabel("Login Action:");
		success.setBounds(10,110,300,25);
		panel.add(success);
		
		
		
		//makes panel & frame visible
		frame.setVisible(true);
		
			

	}

	//Action listener method
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//makes input readable
		String user = userText.getText();
		String password = pwdText.getText();
		
		
		//checks if user name and password matches
		if (user.equals("Raymond") && password.equals("123")) {
			//login message after successful login
			success.setText("Login Action:Login Successful!");
		}
		
		else {
			//login message after unsuccessful login
			success.setText("Login Action:Login Unsuccessful!");
		}
	}

}
