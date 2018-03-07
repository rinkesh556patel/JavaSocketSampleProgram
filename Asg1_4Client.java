
import java.net.*;
import java.util.Scanner;
import java.io.*;

class Asg1_4Client{
	public static void main(String args[])throws Exception{
		Socket s=new Socket("127.0.0.1",5555);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
		String str="";
		Scanner sc=new Scanner(System.in);
		do{
			System.out.print("> ");
			str=sc.nextLine();
			
			String line="";
			pw.println(str);
			try{
				while(!(line=br.readLine()).equals("new")){
					System.out.println(line);
				}
			}catch(Exception e){}			
		}while(!str.equals("exit"));
		s.close();
	}
}
/*
C:\Users\Rinkesh Patel\Desktop\4\DAD\Asg1>javac Asg1_4Client.java

C:\Users\Rinkesh Patel\Desktop\4\DAD\Asg1>java Asg1_4Client
> GET t1.txt
HTTP/1.1 200 OK

this is file
abcd
xyz
> GET t2.txt
404 Not Found
> exit
*/