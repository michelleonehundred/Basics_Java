
public class SimpleMath {

	public static double devideValues(String s1,String s2)
	{
		double d1=Double.parseDouble(s1);
		double d2=Double.parseDouble(s2);
		double result =d1/d2;
		return result;
	}
	
	public static double multiplyValues(String s1,String s2)
	{
		double d1=Double.parseDouble(s1);
		double d2=Double.parseDouble(s2);
		double result =d1*d2;
		return result;
	}
	
	public static double substractValues(String s1,String s2)
	{
		double d1=Double.parseDouble(s1);
		double d2=Double.parseDouble(s2);
		double result =d1-d2;
		return result;
	}
	
	public static double addValues(String s1,String s2)
	{
		double d1=Double.parseDouble(s1);
		double d2=Double.parseDouble(s2);
		double result =d1+d2;
		return result;
	}
	
}
