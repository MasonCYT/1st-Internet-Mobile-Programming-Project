import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer extends Thread{
	private BufferedReader in;
	private PrintWriter out;
	private Socket s;
	private Host hs;
	
	public SocketServer(Socket s, Host hs)
	{
		this.s = s;
		this.hs = hs;
	}
	
	
	
	public void runServer() {
		try {
			this.out = new PrintWriter(s.getOutputStream(), true);
			this.in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			String lineIn = in.readLine();
			hs.receiveMsg(lineIn);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
//		while(true) {
//			try {
//				Socket clientSocket = serverSocket.accept();
//				ProjectRunnable r = new ProjectRunnable(clientSocket);
//				new Thread(r).start();
//			} catch(IOException e){
//				System.out.println(e.getMessage());
//			}
//		}
	}
}