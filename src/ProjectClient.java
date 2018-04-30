import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ProjectClient extends Thread{
	private BufferedReader in;
	private PrintStream out;
	private Socket sock;
	private String Msg;
	public ProjectClient(String ip, int portNum, String Msg) throws UnknownHostException, IOException {
		this.sock = new Socket(ip, portNum);
		this.Msg = Msg;
	}
	
	@Override
	public void run()
	{
		try {
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			out = new PrintStream(sock.getOutputStream());
			out.print(Msg);
			String InMsg = in.readLine();
			
			System.out.println(InMsg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
