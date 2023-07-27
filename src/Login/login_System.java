package Login;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login_System {
	
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	
public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					login_System window = new login_System();
					window.frame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}	
		});
			
			
		}
	}


