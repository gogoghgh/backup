import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket s = null;
		try {
			s = new ServerSocket(54321);
			System.out.println("Server Start.... ");
			
			while (true) {
				Socket s1 = s.accept();
				
				InputStream is = s1.getInputStream();
				ObjectInputStream ois = new ObjectInputStream(is);
				System.out.println(ois.readObject());
				
				System.out.println("accept From: " + s1.getInetAddress().toString());
				OutputStream os = s1.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject("¾È³ç I'm Server ^^");
				
				oos.close();
				ois.close();
				s1.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
