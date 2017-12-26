import java.util.HashMap;

public class Main {

	public static void main(String[]args)
	{
		//unordered collection of data
		//structures
		//or associative arrays
		//key ,values
		
		HashMap<String,String> map=new HashMap<String,String>();
		
		map.put("California","Sacremento");
		map.put("Oregon","Salem");
		map.put("Washington","Olympia");
		
		map.put("Alaska","Juneau");
		System.out.println(map);
		
		String cap=map.get("Oregon");
		System.out.println("The capital of Oregon is "+cap);
		
		map.remove("California");
		System.out.println(map);
		System.out.println(map.isEmpty());
	}
	
}
