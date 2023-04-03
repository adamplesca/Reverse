// String buffers
// Adam Plesca
// 3/4/23

import javax.swing.JOptionPane;

public class ReverseApp{
	public static void main(String args[]){

		String reverseWord, input;

		Reverse reverse = new Reverse();

		input = JOptionPane.showInputDialog(null, "Enter a word to be reversed");
		reverse.setInput(input);

		reverse.compute();

		reverseWord = reverse.getReverse();
		JOptionPane.showMessageDialog(null, "the word you typed in was :" + input +" and in reverse is: "+ reverseWord);
	}
}