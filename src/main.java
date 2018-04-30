import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Msg;
		String Receiver;
		String Sender;
		int portNum;
		Djikstra djikstra = new Djikstra();
		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int k = s.nextInt();
		int adjacencyMatrix[][] = new int[v][v];
		for(int i = 0; i < k; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			int weight = s.nextInt();
			adjacencyMatrix[v1][v2] = weight;
			adjacencyMatrix[v2][v1] = weight;
		}
				
				Host h[] = new Host[5];
				for(int i=0;i<5;i++) {
					h[i]=new Host();
					h[i].id=i;
					h[i].djikstra.adjacencyMatrix=adjacencyMatrix;
				}
				for (Host host : h) {
					host.hosts=h;
				}
				try {
					h[0].send("asd", 8088,4, h[djikstra.findNextHop(4, djikstra.djikstra(0, adjacencyMatrix))]);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}	
}