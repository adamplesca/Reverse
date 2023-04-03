// Class exercise (Piglatin)
// Adam Plesca
// 3/4/23

import javax.swing.JOptionPane;

public class PiglatinApp{
	public static void main(String args[]){

		String input, output;

		Piglatin Piglatin = new Piglatin();

		input = JOptionPane.showInputDialog(null, "Enter a word to convert into Piglatin");
		Piglatin.setInput(input);

		Piglatin.compute();

		output = Piglatin.getOutput();
		JOptionPane.showMessageDialog(null, "Here is the piglatinised version \n" + output);
	}
}