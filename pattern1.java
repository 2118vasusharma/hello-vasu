package garimachikaramam;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst =1;
		 //rows 
		int row = 1;
		while (row <=n) {
			//works 
			int cst = 1;
			while (cst <=nst) {
				System.out.print("*");
				cst= cst+1;
				
			}
			System.out.print("\n");
			nst = nst +1;
			row = row +1;

			
		}
	
	}

}
