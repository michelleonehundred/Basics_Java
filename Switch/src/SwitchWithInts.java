import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwitchWithInts {

	public static void main(String[] args) {
		
		String input=getInput("Enter a numer between 1 and 12: ");
		
		int  month=Integer.parseInt(input);
		//up to version 6 : integers shorts bytes  and a special class called enums
		// in java seven :  strings
		
		switch (month) {  //the value that you are evaluating
		case 1:
			//executable code
			System.out.println("The month is january");
			break;
		case 2:
			System.out.println("This month is march");
			break;
		case 3:
			System.out.println("This month is may");
		default:
			System.out.println("Hewoow");
			break;
		}
		
	}
	
	private static String getInput(String prompt) {
	
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print(prompt);
	
	System.out.flush();
	
	try {
		return stdin.readLine();
	}catch(Exception e) {
		return "Error: "+e.getMessage();
	}
	}
}
