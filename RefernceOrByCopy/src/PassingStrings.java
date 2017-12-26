
public class PassingStrings {

	public static void main(String[] args) {
		
		String original="Original!";
		System.out.println("Origial before: "+original);
		changeString(original);
		System.out.println("Original after: "+original);
		
	}

	private static void changeString(String inFunction) {
		
		inFunction="New!";
		System.out.println("In function: "+inFunction);
		
	}
	
	//Strings are immutable
	
	//A copy of the entire String is created
	//when passed to a function
	
}
