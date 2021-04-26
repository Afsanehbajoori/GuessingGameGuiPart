import javax.swing.JFrame;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame {
	private JTextField textGuess;
	private JLabel lblOutput;
	private int theNumber;
	private int numberOfTries=0;
	//private JButton btnPlayAgain;
	
	public void checkGuess() {
		String guessText = textGuess.getText();
		String message="";
		
		
		try {
			
			numberOfTries=numberOfTries+1;
		int guess =Integer.parseInt(guessText);
		if (guess < theNumber)
			message= guess + " is too low. Try again.";
		else if (guess > theNumber)
			message = guess + " is too high . Try again.";
		else {
			
			message = guess + " is correct. You win after " + numberOfTries + " tries! Let's play again!";
			newGame();	
			
		}
		}catch (Exception e) {
			message="Enter a whole number between 1 and 100.";
			
		}finally {
			lblOutput.setText(message);
			textGuess.requestFocus();
			textGuess.selectAll();
		}
		
		
	}
	public void newGame() {
		theNumber = (int)(Math.random() * 100 +1);
	}
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Afsaneh's Hi-Lo Guessing Game");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Afsaneh's Guessing Game");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel.setBounds(10, 49, 255, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Guess a number between 1 and 100:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(43, 111, 296, 14);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Guess");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		
						
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(86, 185, 84, 27);
		getContentPane().add(btnNewButton);
		
	    lblOutput = new JLabel("Enter a number above and click Guess!");
		lblOutput.setHorizontalAlignment(SwingConstants.LEFT);
		lblOutput.setBounds(43, 272, 383, 14);
		getContentPane().add(lblOutput);
		
		textGuess = new JTextField();
		textGuess.setText("50");
		textGuess.setHorizontalAlignment(SwingConstants.CENTER);
		textGuess.setBounds(262, 108, 46, 20);
		getContentPane().add(textGuess);
		textGuess.setColumns(10);
		
		
		
		
	}

	public static void main(String[] args) {
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(450,400));
		theGame.setVisible(true);

	}
}
