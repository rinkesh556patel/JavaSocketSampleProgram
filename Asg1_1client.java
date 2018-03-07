/*
	1_client
	Create client and server socket programs to enable communication so that client can get 
	results of the following operations performed by the server.
	a.	Average of two numbers
	b.	Maximum of three numbers
	c.	Generate nth prime number
	d.	Generate nth Fibonacci number

*/
import java.io.*;
import java.net.*;
import java.util.Scanner;
class Asg1_1client{
	public static void main(String args[]) throws Exception {
		Socket s=new Socket("127.0.0.1",5555);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Your Choice : ");
		
		int choice=sc.nextInt();
		pw.println(choice);
		switch(choice){
			case 1:				
				System.out.println("Enter no. 1 : ");
				int n1=sc.nextInt();
				System.out.println("Enter no. 2 : ");
				int n2=sc.nextInt();
				pw.println(n1);
				pw.println(n2);
				System.out.println("\nAverage of two no. : " + br.readLine());
				break;
			case 2:
				System.out.println("Enter no. 1 : ");
				n1=sc.nextInt();
				System.out.println("Enter no. 2 : ");
				n2=sc.nextInt();
				System.out.println("Enter no. 3 : ");
				int n3=sc.nextInt();
				pw.println(n1);
				pw.println(n2);
				pw.println(n3);
				System.out.println("\nMaximum of three numbers : " + br.readLine());
				break;
			case 3:
				System.out.println("Enter number  : ");
				n1=sc.nextInt();
				pw.println(n1);
				System.out.println("\nNth prime number : " + br.readLine());
				break;
			case 4:
				System.out.println("Enter number  : ");
				n1=sc.nextInt();
				pw.println(n1);
				System.out.println("\nNth fibonacci number : " + br.readLine());
				break;
			default:
				pw.println("!!! INVALID CHOICE !!!");
		}
		s.close();
	}
}