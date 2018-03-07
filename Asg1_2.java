/*________________________________________________________________________________________________
	ROLL NO. : 18
	NAME     : RINKESH PATEL
	CLASS    : MCA-4
	SUBJECT  : DAD
	PROGRAM  : 2.Write a socket program to do the following. The user enters a five-digit number 
				from the client side. The server will return the original number and sum of the 
				digits. Appropriate message should be displayed on the client side.	
________________________________________________________________________________________________*/
import java.io.*; 
import java.net.*;
import java.util.Scanner;

class Asg1_2{
	public static void main(String args[])throws Exception{
		ServerSocket ss=new ServerSocket(5555);
		Socket s=ss.accept();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
		String input=br.readLine();
		int num=Integer.parseInt(input);
		int sum=0,n=num;
		if(input.length()==5){
			while(n>0){
				sum=sum+(n%10);
				n=n/10;
			}
			pw.println(num);
			pw.println(sum);
		}
		else{
			pw.println(num);
			pw.println(" !!! Not a five digit number !!!");
		}
		ss.close();
		s.close();
		
	}
}
/*_____________________________________________OUTPUT______________________________________________

________________________________________________________________________________________________*/