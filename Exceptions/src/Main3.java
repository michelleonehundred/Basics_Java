import java.net.URI;
import java.net.URISyntaxException;

public class Main3 {
public static void main(String[] args) {
	
	try {
		URI url=new URI("https:\\google.com");
	} catch (URISyntaxException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("The uri is not working");
	}finally{
		System.out.println("Hello");
	}
}
	
}
