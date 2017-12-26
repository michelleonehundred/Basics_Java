
public class Main {
	public static void main(String[] args) {
       //static ... doesn't have any copy
		
		Issue iss1=new Issue();
		Issue iss2=new Issue();
		
		iss1.name="Bob";
		iss2.name="Sue";
		
		//iss1.description="ggg";
		Issue.description="awesome";
		//that's how static can be called
		Issue.showInfo();
		
		System.out.println(iss1.name);
		System.out.println(iss2.name);
		//////////////////
		
		StringBuilder sb=new StringBuilder();
		
		sb.append("My name is")
		.append("James")
		.append(" and I am 45 yrs old");
		
		System.out.println(sb.toString());
		
		
	}
}
