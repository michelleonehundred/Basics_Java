import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("California");
		list.add("Oregon");
		list.add("Washington");
		list.add("Alaska");
		
		System.out.println(list);
		list.add(null);
		
		System.out.println(list);
        list.remove(4);
		System.out.println(list);
		System.out.println(list.get(1));
		
		int pos=list.indexOf("Alaska");
		System.out.println("Alaska is at position "+pos);

	}
	
}
