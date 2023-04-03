// Class exercise (Piglatin)
// Adam Plesca
// 3/4/23

public class Piglatin{

	private String input, output;
	private StringBuffer strBuff = new StringBuffer();

	public Piglatin(){
		input = "";
		output = "";
	}

	public void setInput(String input){
		this.input = input;
	}
	public void compute(){
		for(int i = 1; i < input.length(); i++){
			strBuff.append(input.charAt(i));
		}
		strBuff.append(input.charAt(0));
		strBuff.append("ay");
		output = strBuff.toString();
	}
	public String getOutput(){
		return output;
	}
}