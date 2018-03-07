import java.io.*;
import java.net.*;
import java.util.Scanner;

class Asg1_5Client{
	public static void main(String args[])throws Exception {
		Socket s=new Socket("127.0.0.1",5555);
		Scanner sc=new Scanner(System.in);
	
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
		String msg;
		do{
			System.out.println("Enter Message : ");
			msg=sc.next();
			
			pw.println(msg);
			System.out.println(br.readLine());
		}while(!msg.equals("bye"));
	}
}
/*
*/