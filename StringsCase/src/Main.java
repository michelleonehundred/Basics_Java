
public class Main {

	public static void main(String...args)
	{
		
		String s1="Welcome to California";
		String s2=new String("Welcome to CaliforniA");
		//String s2="Welcome to California";
		System.out.println(s1);
		
		if(s1==s2) {
			System.out.println("They match");
		}else {
			System.out.println("They don't");
		}
		
		if(s1.equals(s2)) {
			System.out.println("They match ");
			//compares the string to the specified object
		}else {
			System.out.println("They do not");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("They match");
		}else {
			System.out.println("They donit match");
		}
		
		//string bufferedReader ---> memory and fewer objects
		//Stringbuffer ,StringBuilder
		
		String z1="Welcome";
		StringBuilder sb=new StringBuilder(z1);
		
		sb.append("to California! ");
		
		System.out.println(sb);
	}
	
}
