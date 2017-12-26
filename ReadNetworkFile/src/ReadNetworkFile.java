
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ReadNetworkFile {

	public static void main(String[] args) throws IOException {
		
		URL url=new URL("http://www.tutorialspoint.com/java/java_files_io.htm");
		InputStream stream=url.openStream();
		BufferedInputStream buf=new BufferedInputStream(stream);
		
		StringBuilder sb=new StringBuilder();
		
		while(true) {
			int data=buf.read();
			
			if(data==-1) {
				break;
			}else {
				sb.append((char)data);
			}
		}
		System.out.println(sb);
		
	}
	
}
