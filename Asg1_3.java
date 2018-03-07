/*________________________________________________________________________________________________
	ROLL NO. : 18
	NAME     : RINKESH PATEL
	CLASS    : MCA-4
	SUBJECT  : DAD
	PROGRAM  : 3.	Write a socket program to calculate area and perimeter of a rectangle 
			   (custom class created by you). The user will input proper parameters. The client 
			   will create an object of type Rectangle and send to the server. The server will 
			   send the result Rectangle obejct with proper messages, which should be displayed 
			   on client side.
________________________________________________________________________________________________*/
import java.io.*;
import java.net.*;

class Asg1_3{
	public static void main(String args[])throws Exception{
		ServerSocket ss=new ServerSocket(25292);
		Socket s=ss.accept();
		
		ObjectOutputStream obo=new ObjectOutputStream(s.getOutputStream());
		ObjectInputStream obi=new ObjectInputStream(s.getInputStream());
		
		Rectangle r=(Rectangle)obi.readObject();
		
		r.calculateArea();
		obo.writeObject(r);
		
		ss.close();
		s.close();
	}
}
/*_____________________________________________OUTPUT______________________________________________

________________________________________________________________________________________________*/