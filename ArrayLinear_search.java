package garimachikaramam;

public class ArrayLinear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array = {10 , 5 , 20 , 30 , 25 };
System.out.println(Linearsearch (array , 130));
	}

	public static int Linearsearch(int arr[], int item ) {
		for (int i = 0 ; i < arr.length ; i++) {
			if (arr[i] == item) {
			return i ;
			
			}
			
		}
		return -1;
	}
}
