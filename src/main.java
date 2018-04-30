import java.util.Scanner;

import com.ssaurel.djikstra.Edge;
import com.ssaurel.djikstra.Graph;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Msg;
		String Receiver;
		String Sender;
		int portNum;
		
//		Host A = new Host();
//		Host B = new Host();
//		Host C = new Host();
//		Host D = new Host();
//		Host E = new Host();
		
		Host h[] = new Host[5];
		
		Edge[] edges = {
			      new Edge(1, 2, 1), 
			      new Edge(2, 3, 4), 
			      new Edge(3, 5, 7),
			      new Edge(2, 4, 3),	      
			      new Edge(4, 5, 5),
			      
			      new Edge(1, 4, 3),
			      new Edge(1, 5, 1),
			      new Edge(2, 4, 1),
			      new Edge(3, 5, 4),
			      new Edge(4, 5, 2), 
			      new Edge(4, 6, 7), 
			      new Edge(4, 7, 2),
			      new Edge(5, 6, 4), 
			      new Edge(6, 7, 5)
			    };
			    
			    Graph g = new Graph(edges);
			    g.calculateShortestDistance();
			    
			    g.printResult(); // let's try it !
			    
			    h[0].send("Hello", 80, h[1]);
//		A.hosts[0] = A;11
//		B.hosts[0] = A;
//		C.hosts[0] = A;
//		D.hosts[0] = A;
//		E.hosts[0] = A;
//		
//		A.hosts[1] = B;
//		B.hosts[1] = B;
//		C.hosts[1] = B;
//		D.hosts[1] = B;
//		E.hosts[1] = B;
//		
//		A.hosts[2] = C;
//		B.hosts[2] = C;
//		C.hosts[2] = C;
//		D.hosts[2] = C;
//		E.hosts[2] = C;
//		
//		A.hosts[3] = D;
//		B.hosts[3] = D;
//		C.hosts[3] = D;
//		D.hosts[3] = D;
//		E.hosts[3] = D;
//		
//		A.hosts[4] = E;
//		B.hosts[4] = E;
//		C.hosts[4] = E;
//		D.hosts[4] = E;
//		E.hosts[4] = E;
//		
//		System.out.println("Please Input the Message: ");
//		Msg = sc.nextLine();
//		
//		System.out.println("Input the port: ");
//		portNum = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.println("Input sender: ");
//		Sender = sc.nextLine();
//		
//		System.out.println("Input receiver: ");
//		Receiver = sc.nextLine();
//		
//		System.out.println(Msg);
//		A.send(Msg, portNum, B);
//		
//		if (Sender == "A") {
//			if(Receiver == "B") {
//				A.send(Msg,portNum, B);
//			}else if(Receiver == "C") {
//				A.send(Msg, portNum, C);
//			}else if(Receiver == "D") {
//				A.send(Msg, portNum, D);
//			}else if(Receiver == "E") {
//				A.send(Msg, portNum, E);
//			}
//		}if (Sender == "B") {
//			if(Receiver == "A") {
//				B.send(Msg,portNum, A);
//			}else if(Receiver == "C") {
//				B.send(Msg, portNum, C);
//			}else if(Receiver == "D") {
//				B.send(Msg, portNum, D);
//			}else if(Receiver == "E") {
//				B.send(Msg, portNum, E);
//			}
//		}if (Sender == "C") {
//			if(Receiver == "A") {
//				C.send(Msg,portNum,A);
//			}else if(Receiver == "B") {
//				C.send(Msg, portNum, B);
//			}else if(Receiver == "D") {
//				C.send(Msg, portNum, D);
//			}else if(Receiver == "E") {
//				C.send(Msg, portNum, E);
//			}
//		}if (Sender == "D") {
//			if(Receiver == "A") {
//				D.send(Msg,portNum,A);
//			}else if(Receiver == "B") {
//				D.send(Msg, portNum, B);
//			}else if(Receiver == "C") {
//				D.send(Msg, portNum, C);
//			}else if(Receiver == "E") {
//				D.send(Msg, portNum, E);
//			}
//		}if (Sender == "E") {
//			if(Receiver == "A") {
//				E.send(Msg,portNum,A);
//			}else if(Receiver == "B") {
//				E.send(Msg, portNum, B);
//			}else if(Receiver == "C") {
//				E.send(Msg, portNum, C);
//			}else if(Receiver == "D") {
//				E.send(Msg, portNum, D);
//			}
//		}
	}	
}