package garimachikaramam;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst =5;
		int nsp = 0;
	
		// row
		int row = 1;
		while (row <= n) {
			// space work
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
				// stars work
				int cst = 1;
				while (cst <= nst) {
					System.out.print("*");
					cst++;

				}
				// preparation
				System.out.println();
			
				nsp = nsp + 1;
				nst = nst - 1;
					row = row + 1;

			}
		}
	}


