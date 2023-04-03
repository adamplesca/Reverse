// String buffers (third app)
// Adam Plesca
// 3/4/23

public class Third{

	private String reverseWord, input;
	private StringBuffer strBuff = new StringBuffer();

	public Third(){
		reverseWord = " ";
		input = " ";
	}

	public void setInput(String input){
		this.input = input;
	}

	public void compute(){
			for(int i = input.length()-1;i>=0;i--){
				strBuff.append(input.charAt(i));
				reverseWord = strBuff.toString();
		}
	}

	public String getReverse(){
		return reverseWord;
	}
}