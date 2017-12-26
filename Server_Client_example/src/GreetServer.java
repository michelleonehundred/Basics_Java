import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class GreetServer {

	
	public static void main(String[] args){  
		try{  
		ServerSocket ss=new ServerSocket(6666);  
		Socket s=ss.accept();//establishes connection   
		DataInputStream dis=new DataInputStream(s.getInputStream());  
		String  str=(String)dis.readUTF();  
		System.out.println("message= "+str);  
		ss.close();  
		}catch(Exception e){System.out.println(e);}  
		}  
}
