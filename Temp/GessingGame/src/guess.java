import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class guess {
	int totalRolls= 0;
	int totalCorrect = 0;
    int totalIncorrect = 0;
    int userGuess;
    int diceRoll;
	double percCorrect= 0;
    private JFrame frmGuessTheNumber;
	private JTextField txtUserGuess;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guess window = new guess();
					window.frmGuessTheNumber.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public guess() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGuessTheNumber = new JFrame();
		frmGuessTheNumber.setTitle("Guess The Number");
		frmGuessTheNumber.getContentPane().setBackground(Color.WHITE);
		frmGuessTheNumber.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frmGuessTheNumber.setBounds(100, 100, 675, 571);
		frmGuessTheNumber.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGuessTheNumber.getContentPane().setLayout(null);
		
		JLabel lblHeader = new JLabel("Super Dice Guessing Game");
		lblHeader.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblHeader.setBounds(218, 26, 286, 14);
		frmGuessTheNumber.getContentPane().add(lblHeader);
		
		JLabel lblInst1 = new JLabel("Enter A Number, From 1 To 6");
		lblInst1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblInst1.setBounds(243, 51, 286, 14);
		frmGuessTheNumber.getContentPane().add(lblInst1);
		
		JLabel lblInst2 = new JLabel("And Click Roll To Roll The Dice");
		lblInst2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblInst2.setBounds(238, 76, 250, 14);
		frmGuessTheNumber.getContentPane().add(lblInst2);
		
		JLabel lblUserGuess = new JLabel("Your Guess");
		lblUserGuess.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUserGuess.setBounds(61, 142, 111, 14);
		frmGuessTheNumber.getContentPane().add(lblUserGuess);
		
		JLabel lblDiceRoll = new JLabel("Dice Roll ");
		lblDiceRoll.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDiceRoll.setBounds(536, 142, 78, 14);
		frmGuessTheNumber.getContentPane().add(lblDiceRoll);
		
		txtUserGuess = new JTextField();
		txtUserGuess.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtUserGuess.setText("0");
		txtUserGuess.setBounds(91, 166, 20, 20);
		frmGuessTheNumber.getContentPane().add(txtUserGuess);
		txtUserGuess.setColumns(10);
		
		JLabel lblRollValue = new JLabel("0");
		lblRollValue.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRollValue.setBounds(568, 169, 20, 14);
		frmGuessTheNumber.getContentPane().add(lblRollValue);
		
		JLabel lblRolls = new JLabel("Number of Rolls :");
		lblRolls.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRolls.setBounds(412, 315, 129, 14);
		frmGuessTheNumber.getContentPane().add(lblRolls);
		
		JLabel lblCorrect = new JLabel("Number of Correct Guesses :");
		lblCorrect.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCorrect.setBounds(328, 370, 213, 14);
		frmGuessTheNumber.getContentPane().add(lblCorrect);
		
		JLabel lblIncorrect = new JLabel("Number of Incorrect Guesses :");
		lblIncorrect.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIncorrect.setBounds(314, 435, 227, 14);
		frmGuessTheNumber.getContentPane().add(lblIncorrect);
		
		JLabel lblRollsValue = new JLabel("0");
		lblRollsValue.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRollsValue.setBounds(568, 315, 46, 14);
		frmGuessTheNumber.getContentPane().add(lblRollsValue);
		
		JLabel lblCorrectValue = new JLabel("0");
		lblCorrectValue.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCorrectValue.setBounds(568, 370, 46, 14);
		frmGuessTheNumber.getContentPane().add(lblCorrectValue);
		
		JLabel lblIncorrectValue = new JLabel("0");
		lblIncorrectValue.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIncorrectValue.setBounds(568, 435, 46, 14);
		frmGuessTheNumber.getContentPane().add(lblIncorrectValue);
		
		JLabel lblPercent = new JLabel("Percentage of Correct Cuesses :");
		lblPercent.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPercent.setBounds(302, 493, 241, 14);
		frmGuessTheNumber.getContentPane().add(lblPercent);
		
		JLabel lblPercentValue = new JLabel("0");
		lblPercentValue.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPercentValue.setBounds(568, 493, 46, 14);
		frmGuessTheNumber.getContentPane().add(lblPercentValue);
		
		JButton btnNewButton = new JButton("Roll Dice");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				diceRoll = (int)Math.round(Math.random()*5+1) ;
				lblRollValue.setText(String.valueOf(diceRoll));
							
					userGuess = Integer.parseInt(txtUserGuess.getText());
							
					totalRolls = totalRolls + 1;
							
					if (diceRoll == userGuess)
					{
						totalCorrect +=1;
					}
					else
					{
						totalIncorrect += 1;
					}
							
					percCorrect = ((double)totalCorrect/(double)totalRolls)*100;
							
				    percCorrect = percCorrect * 100;
					percCorrect = Math.round(percCorrect);
					percCorrect = percCorrect / 100;
							
					lblRollsValue.setText(String.valueOf(totalRolls));
					lblCorrectValue.setText(String.valueOf(totalCorrect));
					lblIncorrectValue.setText(String.valueOf(totalIncorrect));
					lblPercentValue.setText(String.valueOf(percCorrect));
				
			}
		});
		btnNewButton.setBounds(286, 159, 111, 38);
		frmGuessTheNumber.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);	
			}
		});
		btnNewButton_1.setBounds(582, 11, 67, 23);
		frmGuessTheNumber.getContentPane().add(btnNewButton_1);
		
	
		
		
		
	}
}
