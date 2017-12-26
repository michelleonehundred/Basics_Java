
public class PassingPrimitivesWrappedInObjects {

	public static void main(String[] args) {
		
		int [] arOriginal= {10,20,30};
		System.out.println("Original before: "+arOriginal[0]);
		incrementValue(arOriginal);
		System.out.println("ORiginal after: "+arOriginal[0]);
	}
	
	public static void incrementValue(int[] inFunction)
	{
		inFunction[0]++;
		System.out.println("InFunction: "+inFunction[0]);
	}
	
	//the original calue did change
	
}
