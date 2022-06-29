package garimachikaramam;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner (System.in);
int n = scn.nextInt();
int nst = n/2;
int nsp = 1;

//row 
int row = 1;
while (row <= n ) {
	//works
	int cst = 1;
	while (cst <= nst ) {
		System.out.print("*");
		cst++;
	}
	int csp=1;
	while(csp<=nsp) {
		System.out.print("  ");
		csp ++;
		
	}
	 cst =1 ;
	while (cst <= nst ) {
		System.out.print("*");
		cst ++ ;
		
	}
	
	System.out.println();
	if (row <= n/2) {
		nsp = nsp +2;
		nst = nst-1;

	}
	else {
		nsp = nsp -2;
		nst  = nst +1;
		
		
	}
	row = row++;
	
}
	}

}
