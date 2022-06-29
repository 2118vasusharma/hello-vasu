package garimachikaramam;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn =  new Scanner (System.in);
int n = scn.nextInt();
int nst = 1;
int nsp = n/2;

// row 
int row = 1;
while(row <= n) {
	// space work 
	for (int csp = 1; csp <= nsp;csp++) {
		System.out.print(" ");
	}
	for (int cst = 1; cst <= nst ;cst++) {
		System.out.print("*");
	}
	System.out.println();
if(row <= n/2) {
	nsp = nsp-1;
	nst = nst+2;
}else {
	nsp = nsp+1;
	nst = nst-2;
}
row= row +1;



}



	}

}
