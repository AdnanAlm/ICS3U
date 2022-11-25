package positivePractice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUi {

	private JFrame frame;
	private JLabel lblQu1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUi window = new GUi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 603, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Positive Practice!");
		title.setFont(new Font("Tahoma", Font.PLAIN, 24));
		title.setBounds(192, 22, 190, 29);
		frame.getContentPane().add(title);
		
		JLabel statment = new JLabel("Click the Generate Quote button in order to be inspired!");
		statment.setFont(new Font("Tahoma", Font.PLAIN, 15));
		statment.setBounds(118, 99, 371, 14);
		frame.getContentPane().add(statment);
		
		JButton Btn1 = new JButton("Genrate Quote");
		Btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			int selector = (int)(Math.random()*9)+1;
				///code
				
				String Qu1 = "When you have a dream, you've got to grab it and never let go - Carol Burnett";
				String Qu2 = "Nothing is impossible. The word itself says 'I'm possible! - Audrey Hepburn";
				String Qu3 = "There is nothing impossible to they who will try — Alexander the Great";
				String Qu4 = "The bad news is time flies. The good news is you're the pilot - Michael Altshuler";
				String Qu5 = "Life has got all those twists and turns. You've got to hold on tight and off you go - Nicole Kidman";
				String Qu6 = "Keep your face always toward the sunshine, and shadows will fall behind you - Walt Whitman";
				String Qu7 = "You define your own life. Don't let other people write your script - Oprah Winfrey";
				String Qu8 = "You are never too old to set another goal or to dream a new dream - Malala Yousafzai";
				
				//making if statements and output
				
				if(selector == 1) {
					lblQu1.setText(Qu1);
				}
				else if (selector == 2) {
					lblQu1.setText(Qu2);
				}
				else if (selector == 3) {
					lblQu1.setText(Qu3);
				}
				else if (selector == 4) {
					lblQu1.setText(Qu4);
				}
				else if (selector == 5) {
					lblQu1.setText(Qu5);
				}
				else if (selector == 6) {
					lblQu1.setText(Qu6);
				}
				else if (selector == 7) {
					lblQu1.setText(Qu7);
				}
				else  {
					lblQu1.setText(Qu8);
				}
			}
		});
		Btn1.setFont(new Font("Verdana", Font.PLAIN, 15));
		Btn1.setBounds(192, 124, 190, 23);
		frame.getContentPane().add(Btn1);
		
		lblQu1 = new JLabel("When you have a dream, you've got to grab it and never let go - Carol Burnett");
		lblQu1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblQu1.setBounds(55, 200, 493, 14);
		frame.getContentPane().add(lblQu1);
	}
}
