 package garimachikaramam;

import java.util.Scanner;

public class else_ifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int age = scn.nextInt();
		if (age <= 12) {
			System.out.println("child");
		} else if (age >= 12 && age < 18) {
			System.out.println("teenager");
		} else if (age >= 18 && age <= 60) {
			System.out.println("adult");
		} else {
			System.out.println("old");
		}
	}
 
}
