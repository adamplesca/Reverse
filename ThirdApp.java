// String buffers
// Adam Plesca
// 3/4/23

import javax.swing.JOptionPane;

public class ThirdApp{
	public static void main(String args[]){

		String reverseWord, input;

		Reverse reverse = new Reverse();

		input = JOptionPane.showInputDialog(null, "Enter a word to be reversed");
		reverse.setInput(input);

		reverse.compute();

		reverseWord = reverse.getReverse();
		if(reverseWord != input){
			JOptionPane.showMessageDialog(null, "That is not a palindrome");
		}else if(reverseWord == input){
			JOptionPane.showMessageDialog(null, "That is a palindrome");
		}
	}
}