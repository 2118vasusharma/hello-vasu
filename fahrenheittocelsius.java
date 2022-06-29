package garimachikaramam;

import java.util.Scanner;

public class fahrenheittocelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int fmin = 0 ;
int fmax = 300;
int fstep= 20;
int fcurrent = fmin;
while(fcurrent <=fmax) {
	int celsius= (int)((5.0/9)*(fcurrent -32));// 	TYPE CASTING 
	System.out.println(fcurrent+"\t"+celsius);
	fcurrent= fcurrent+fstep; 
		
}*/
		Scanner scn = new Scanner (System.in);
		char ch=scn.next().charAt(0);
		//System.out.println(ch);
		if (ch>=97&&ch<=122) {
			System.out.println("it is a lower case " );
		}
		else if(ch>=65 &&ch<=90) {
			System.out.println("it is a upper case");
		}
		else {
	System.out.println("it is invalid character"); 
		}
		
		
	}

}
