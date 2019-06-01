public class ArraySwap {
	// Item 15
	public static void swap(int[] arr, int a, int b){
		int temp = arr[ a ];
		arr[ a ] = arr[ b ];
		arr[ b ] = temp;
	}
	
	// Item 15
	// public static void swap(int[] arr, int a, int b){
		// int temp = arr[ b ];
		// arr[ b ] = arr[ a ];
		// arr[ a ] = temp;
	// }	
}
