import java.io.IOException;
import java.net.ServerSocket;

public class ProjectServer extends Thread{

	ServerSocket s1;
	Host hs;
	
	public ProjectServer(int portNum,Host hs) throws IOException
	{
		this.s1 = new ServerSocket(portNum);
		this.hs = hs;
	}
	
	public void run() {
		try {
			SocketServer ss = new SocketServer(s1.accept(),hs);
			ss.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}