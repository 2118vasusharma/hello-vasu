package garimachikaramam;

import java.util.Scanner;

public class Hcf_or_Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner (System.in);
int divident = scn.nextInt();
int divisor = scn.nextInt();

while(divident % divisor!=0) {
	int rem =  divident % divisor;
	divident = divisor ;
	divisor = rem;
	 
}
System.out.println(divisor);
	}

}
