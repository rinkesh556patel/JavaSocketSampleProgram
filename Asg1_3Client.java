import java.io.*;
import java.util.*;
import java.net.*;

class Asg1_3Client{
	public static void main(String args[])throws Exception{
		Socket s=new Socket("127.0.0.1",25292);
		Scanner sc=new Scanner(System.in);
		int l,b;
		Rectangle r1=new Rectangle();
		
		System.out.print("Enter length:");
		l=sc.nextInt();
		
		System.out.print("Enter breadth:");
		b=sc.nextInt();
		
		r1.setl(l);
		r1.setb(b);
		
		ObjectOutputStream obo=new ObjectOutputStream(s.getOutputStream());
		ObjectInputStream obi=new ObjectInputStream(s.getInputStream());
		obo.writeObject(r1);
		r1=(Rectangle)obi.readObject();
		
		
		System.out.println("Area of Rectangle="+r1.getarea());
		
		s.close();
	}
}
/*
C:\Users\Rinkesh Patel\Desktop\4\DAD\Asg1>javac Asg1_3Client.java

C:\Users\Rinkesh Patel\Desktop\4\DAD\Asg1>java Asg1_3Client
Enter length:12
Enter breadth:25
Area of Rectangle=300
*/