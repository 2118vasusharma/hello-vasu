package garimachikaramam;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner (System.in);
int n = scn.nextInt();
int nst = 1;
int nsp = 3;
// row 
int row = 1;
while (row <= n) {
	// stars work
	int csp=1;
	while (csp<=nsp) {
		System.out.println(" ");
	csp++;
	}
	int cst = 1;
	while (cst <= nst ) {
		System.out.print("*");
		cst ++;
		
	}
	System.out.println();
nst = nst - 2;
row = row +1;
nsp =nsp+1;
}


	}

}
