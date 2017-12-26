
public class Calculator {

	public static void main(String[] args) {
		
		String s1=InputHelper.getInput("Enter a numeric value: ");
		String s2=InputHelper.getInput("Enter a numeric value: ");
		String op=InputHelper.getInput("Enter 1=Add,2=Substract, 3=Multiply, 4=Divide");
		
		int opInt=Integer.parseInt(op);
		double result=0;
		
		switch(opInt) {
		case 1:
			result=SimpleMath.addValues(s1,s2);
			break;
		case 2:
			result=SimpleMath.substractValues(s1, s2);
			break;
		case 3:
			result=SimpleMath.multiplyValues(s1, s2);
		    break;
		case 4:
			result=SimpleMath.devideValues(s1, s2);
			break;
		default:
			System.out.println("-----------------");
		}
		System.out.println(result);
	}
	
	
	
}
