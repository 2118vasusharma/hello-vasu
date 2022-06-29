package garimachikaramam;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated methodstub
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int nr = 2 * n +1;
int nst = 1;
//row 
int row = 1;
while (row <= nr) {
	//stars
	int cst = 1;
	while (cst<=nst) {
		System.out.print("*");
		cst ++;
		
	}
	System.out.println();
	if (row <= nr/2) {
		nst= nst +1;
		
	}else {
		nst = nst -1;
		
	}
	row ++;
	

}
	}

}
