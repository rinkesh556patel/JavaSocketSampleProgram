import java.io.*;
import java.net.*;
import java.util.Scanner;

class Asg1_2client{
	public static void main(String args[])throws Exception{
		Socket s=new Socket("127.0.0.1",5555);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		
		pw.println(num);
		
		System.out.println("\nNumber is    : " + br.readLine());
		System.out.println("\nSum of digit : " + br.readLine());
		s.close();
	}
}
/*
C:\Users\Rinkesh Patel\Desktop\4\DAD\Asg1>javac Asg1_2client.java

C:\Users\Rinkesh Patel\Desktop\4\DAD\Asg1>java Asg1_2client
Enter number :
23456

Number is    : 23456

Sum of digit : 20
*/