package garimachikaramam;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array = {5 ,7,10,12,15,20,27,31,36,42,55,58,60,65,70,80};
System.out.println(binarysearch(array, 80));
	}

	public static int binarysearch (int [] arr , int item ) {
		int lo = 0;
		int hi = arr.length -1;
		while (lo <= hi ) {
			int mid  = (lo + hi)/2;
			if (arr[mid] < item) {
				lo = mid +1;
			}else if (arr [mid] > item ) {
				hi = mid -1 ;
				
			}else {
				return mid ;
			}
		
		}
		return -1 ;
	}
}
