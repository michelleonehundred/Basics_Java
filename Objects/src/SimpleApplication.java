import java.util.Date;

public class SimpleApplication {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Welcome welcome=new Welcome();
		welcome.sayHello();
		
		String welcome1="Hello!";  //short hand version
		System.out.println(welcome1);
		
		String welcome2 =new String("Hello!"); //long hand version
		System.out.println(welcome2);
		
		
		//turning an array of character into a string
		
		char [] chars= {'H','e','l','l','o'};
		String s=new String (chars);
		System.out.println(s);
		
		
		///////a numeric wrapper class
		
	///Sample:Double provides tools for converting float  values
		
		double doubleValue=156.5d;
		Double doubleObj=new Double(doubleValue);
		System.out.println(doubleObj);
		byte myByteValue=doubleObj.byteValue();
		System.out.println(myByteValue);
		int myIntValue=doubleObj.intValue();
		System.out.println(myIntValue);
		float myFloatValue=doubleObj.floatValue();
		System.out.println(myFloatValue);
		String myString=doubleObj.toString()+"kmm";
		System.out.println(myString);
		
		////converting primitives upwards
		//double <-float <-long <-int <-short <-byte
		
		int intValue=120;
		double doubleResult=intValue;
		System.out.println(doubleResult); //upward numeric conversion is implicit and reliable
		
		
		//converting primitives downwards
		//double ->float->long->int->short->byte
		//truncate
		double doubleValuez=3.99;
		//int intResultz=doubleValue;   //compile-time error
		
		 int intResult=(int)doubleValuez;
		 System.out.println(intResult);  //downward numeric conversion is explicit and can change data
	   
		 char dollar ='\u0024';
		 System.out.println(dollar);
		 
		 Date myDate = new Date();
		 myDate.setYear(2000);
		 System.out.println(2017-2000);
		 System.out.println(myDate);
	
	}
	
}
//everything is an object