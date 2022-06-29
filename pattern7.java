package garimachikaramam;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int nsp = 2*n-3;
		   
// row 
		int row = 1;
		while (row <= n) {
			// stars work
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			// space work
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			int cst = 1;
			if(row ==n) {
				cst =2;
			}
			for (; cst <= nst; cst++) {
				System.out.print("*");
			}
			System.out.println();
		nst = nst +1;
		nsp = nsp - 2;
		  
			row = row + 1;
		}
	}

}
