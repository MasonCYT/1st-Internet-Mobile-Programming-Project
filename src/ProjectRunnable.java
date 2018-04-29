import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ProjectRunnable implements Runnable {
	
	protected Socket clientSocket = null;
	
	public ProjectRunnable(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}
	
	public void run() {
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			String arg1;
			arg1 = in.readLine();
			System.out.println("Client says: " + arg1);
			out.println("Message received");
		} catch(IOException e) {
			e.printStackTrace();
		}	
	}	
}