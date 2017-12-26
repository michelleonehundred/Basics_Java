import java.util.Scanner;

public class SwitchWithStrings {

	static private String[] months = { "January", "February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String value=sc.nextLine();
		
		switch(value) {
		case "January":
			System.out.println("The value is 1");
			break;
			
		case "February":
			System.out.println("The value is 2");
			break;
			
		case "March":
			System.out.println("The value is 3");
			break;
			
		default:
			System.out.println("The value is something else");
		}
		sc.close();
		
		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i]);
		}
		
		for(String month:months) {
			System.out.println(month);
		}
	}

}
