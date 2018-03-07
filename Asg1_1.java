/*________________________________________________________________________________________________
	ROLL NO. : 18
	NAME     : RINKESH PATEL
	CLASS    : MCA-4
	SUBJECT  : DAD
	PROGRAM  :
		1.	Create client and server socket programs to enable communication so that client can get 
		results of the following operations performed by the server.
		a.	Average of two numbers
		b.	Maximum of three numbers
		c.	Generate nth prime number
		d.	Generate nth Fibonacci number

________________________________________________________________________________________________*/
import java.io.*;
import java.net.*;
import java.util.Scanner;
class Asg1_1{
	public static void main(String args[]) throws Exception{
		ServerSocket ss=new ServerSocket(5555);
		Socket s=ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
		
		int choice=Integer.parseInt(br.readLine());
		
		switch(choice){
			case 1:
				int n1=Integer.parseInt(br.readLine());
				int n2=Integer.parseInt(br.readLine());
				pw.println((n1+n2)/2);
				break;
			case 2:
				n1=Integer.parseInt(br.readLine());
				n2=Integer.parseInt(br.readLine());
				int n3=Integer.parseInt(br.readLine());
				if(n1>n2 && n1>n3)
					pw.println(n1);
				else if(n2>n3)
					pw.println(n2);
				else
					pw.println(n3);
				break;
			case 3:
				n1=Integer.parseInt(br.readLine());
				int cnt=0,n=1;
				
				while(cnt!=n1){
					boolean flag=false;
					
					for(int i=2;i<=(n/2);i++){
						if(n%i==0){
							flag=true;
							break;
						}
					}		
					if(!flag){
						cnt++;
						System.out.print(" , "+n);
					}
					n++;
				}
				pw.println(--n);
				break;
			case 4:
				n1=Integer.parseInt(br.readLine());
				int a=1,b=1;
				cnt=1;
				while(cnt!=n1){
					int t=a;
					a=b;
					b=b+t;
					cnt++;
				}
				pw.println(a);
				break;
			default:
				pw.println("!!! INVLID CHOICE !!!");
		}
		ss.close();
		s.close();
	}
}
/*_____________________________________________OUTPUT______________________________________________

________________________________________________________________________________________________*/