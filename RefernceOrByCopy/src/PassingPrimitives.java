
public class PassingPrimitives {

	public static void main(String[] args) {
		
		int original =10;
		System.out.println("Original "+original);
		incrementValue(original);
		System.out.println("Proginal after : "+original);
		
		//The original value didn't change
		
	}
	
	private static void incrementValue(int inFunction)
	{
		inFunction++;
		System.out.println("In function: "+inFunction);
	}
	
}
