/*________________________________________________________________________________________________
	ROLL NO. : 18
	NAME     : RINKESH PATEL
	CLASS    : MCA-4
	SUBJECT  : DAD
	PROGRAM  : 5.	write a chat server and client program. The chat server accepts connections 
					from clients. Whenever one of the clients sends a chat message, it is 
					displayed for all other clients to see. Use a protocol with three commands 
					: LOGIN name, CHAT message and LOGOUT.
________________________________________________________________________________________________*/
import java.io.*;
import java.net.*;
import java.util.Scanner;

class Asg1_5 extends Thread{
	static int index=0;
	int clientNo;
	Socket s;
	String msg;
	static PrintWriter pw[]=new PrintWriter[20];
	Asg1_5(int cno,Socket s){
		clientNo=cno;
		this.s=s;
	}
	public static void main(String args[])throws Exception {
		ServerSocket ss=new ServerSocket(5555);
			
		while(true){
			Socket s=ss.accept();
			Asg1_5 obj=new Asg1_5(index,s);
			obj.start();
		}
	}
	public void run(){
		BufferedReader br=null;
		Scanner sc=new Scanner(System.in);
		try{
			pw[index++]=new PrintWriter(s.getOutputStream(),true);
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String msg;
			do{
				msg=br.readLine();
				System.out.println("Client"+ (clientNo+1) +" : "+msg);
				pw[clientNo].println("Server : "+sc.next());
			}while(!msg.equals("bye"));
		}catch(Exception e){
		
		}finally{
			//br.close();
		}
	}
}
/*_____________________________________________OUTPUT______________________________________________

________________________________________________________________________________________________*/