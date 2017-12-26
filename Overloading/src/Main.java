
public class Main {

	public static void main(String[] args) {
		
		int value1=5;
		int value2=10;
		int value3=20;
		String valz1="1";
		String valz2="45";
		
		int result=addValues(value1,value2); 
		
		int result1=addValues(value1,value2,value3);
		
		int resultz=addValues(valz1,valz2);
		
		System.out.println("The result is "+result);
		
		System.out.println(result1);
		
		System.out.println(resultz);
	}
	
	private static int addValues(int int1,int int2)
	{
		return int1+int2;
	}
	
	private static int addValues(int int1,int int2,int int3) 
	{
		return int1+int2+int3;
	}
	
	private static int addValues(String val1,String val2)
	{
		
		int value1=Integer.parseInt(val1);
		int value2=Integer.parseInt(val2);
		return value1+value2;
	}
	
}
