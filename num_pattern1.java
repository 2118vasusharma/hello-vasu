package garimachikaramam;

import java.util.Scanner;

public class num_pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
int nsp = n -1;
int nst = 1;
int val = 1;
//row 
int row = 1;

while (row <=n) {
	//space 
	for (int csp = 1;csp<=nsp;csp++) {
		System.out.print(" ");
	}
	//stars
	for (int cst = 1;cst<=nst;cst++) {
		System.out.print(val);
	}
	System.out.println();
	nsp = nsp-1;
	nst = nst +2;

	
    row =  row +1;
}

	}

}

