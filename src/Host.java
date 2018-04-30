import java.io.IOException;

public class Host {
	Host[] hosts = new Host[5];
	
	public void receiveMsg(String Msg)
	{
		System.out.println(Msg);
	}
	
	public void send(String Msg, int portNum, Host hs)
	{
		int marker = 0;
		do {
			try {
				marker =0;
				hs.listen(portNum);
				System.out.println(portNum);
			} catch (IOException e) {
				marker = 1;
				portNum++;
				e.printStackTrace();
			}
		}while(marker == 1);
		
		try {
			ProjectClient ProjCli = new ProjectClient("127.0.0.1", portNum, Msg);
			ProjCli.start();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	public void listen(int portNum) throws IOException
	{
		ProjectServer s = new ProjectServer(portNum, this);
		s.start();
	}
}
