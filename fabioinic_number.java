package garimachikaramam;

import java.util.Scanner;

public class fabioinic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int i = 1;

		int a = 0;
		int b = 1;
		while (i <= n) {
			int c = a + b;
			a = b;
			b = c;
		i = i +1;
		}
		System.out.println(a);
	}

}
