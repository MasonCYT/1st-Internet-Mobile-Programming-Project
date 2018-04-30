import java.io.IOException;

public class Host {
	Host[] hosts = new Host[5];
	public int id;
	public Djikstra djikstra = new Djikstra();
	public String[] decodeMessage(String Msg) {
		String [] temp = Msg.split("#");
		return temp;
	}
	public void receiveMsg(String Msg)
	{
		String [] temp = decodeMessage(Msg);
		System.out.println("Host"+this.id+" Receive: "+temp[1]);
		if(Integer.parseInt(temp[0])==this.id) {
			
			return;
		}
		else {
			
			this.send(temp[1], 8088, Integer.parseInt(temp[0]), 
					hosts[djikstra.findNextHop(Integer.parseInt(temp[0]), djikstra.djikstra(this.id, djikstra.adjacencyMatrix))]);
		}
	}
	
	public void send(String Msg, int portNum,int destination ,Host hs)
	{
		
		Msg=destination+"#"+Msg;
		int marker = 0;
		int portNumber=portNum;
		do {
			try {
				marker =0;
				hs.listen(portNumber);
//				System.out.println(portNum);
			} catch (IOException e) {
				marker = 1;
				portNumber++;
				
			}
		}while(marker == 1);
		System.out.println("Host"+this.id+" Sending to Host"+hs.id);
		try {
			
			ProjectClient ProjCli = new ProjectClient("127.0.0.1", portNumber, Msg);
			ProjCli.start();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void listen(int portNum) throws IOException
	{
		ProjectServer s = new ProjectServer(portNum, this);
		s.start();
	}
}
