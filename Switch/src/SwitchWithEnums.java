
public class SwitchWithEnums {

	public static void main(String[] args) {
		
		Month month = Month.JANUARY;
		
		switch (month) {
		case JANUARY:
			System.out.println("It's the first month");
			break;
		case FEBRUARY:
			System.out.println("It's the second month");
		    break;
		case MARCH:
			System.out.println("It's the thord month");
			break;
		default:
			break;
		}
		
	}
	
}
