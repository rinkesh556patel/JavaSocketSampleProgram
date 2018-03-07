/*________________________________________________________________________________________________
	ROLL NO. : 18
	NAME     : RINKESH PATEL
	CLASS    : MCA-4
	SUBJECT  : DAD
	PROGRAM  : 4.Write a simple web server that recognizes only the GET request. 
				When a client connects to the server and sends a command, such 
				as GET filename HTTP/1.0, then return a header HTTP/1.1 200 OK, 
				followed by a blank line and all lines in the file. If the file 
				does not exist, return 404 Not Found instead.]
________________________________________________________________________________________________*/

import java.net.*;
import java.util.Scanner;
import java.io.*;

class Asg1_4{
	public static void main(String args[])throws Exception{
		ServerSocket ss=new ServerSocket(5555);
		Socket s=ss.accept();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
		String fileName;
		do{
			fileName=br.readLine();
			String line="";
			String arr[]=fileName.split(" ");
			if(arr[0].equals("exit"))
				break;
			if(!(arr[0].equals("GET")))
				pw.println("Invalid command " + arr[0]);
			else{
				try{
					BufferedReader brFile=new BufferedReader(new FileReader(arr[1]));
					pw.println("HTTP/1.1 200 OK\n");
					while((line=brFile.readLine())!=null)
						pw.println(line);					
				}
				catch(Exception e){
					pw.println("404 Not Found");
				}
			}
			pw.println("new");
		}while(!fileName.equals("exit"));
		
		ss.close();
		s.close();
	}
}
/*_____________________________________________OUTPUT______________________________________________

________________________________________________________________________________________________*/