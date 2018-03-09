import java.util.*;
import java.io.*;

class Rectangle implements Serializable{
	int l,b,area;
	
	void setl(int l){
		this.l=l;
	}
	void setb(int b){
		this.b=b;
	}
	void calculateArea(){
		area= (l*b);
	}
	
	int getarea(){
		return area;
	}
}