public class ArraySearchFull{
	
	// Item 09 - search, full, forward, first-match
	public static int search01(int[] arr, int target){
		
		for( int i = 0 ; i < arr.length ; i++ ){
			
			if( arr[i] == target){
				
				return i;
			}
		}
		
		return -1;
	}
	
	// Item 10
	public static int search02(int[] arr, int target){
		
		for( int i = arr.length - 1 ; i >= 0 ; i--){
			
			if( arr[i] == target){
				
				return i;
			}
		}
		
		return -1;
	}
	
	// Item 11
	public static int search03(int[] arr, int target){
		
		int index = -1;
		
		for( int i = 0 ; i < arr.length ; i++ ){
			
			if( arr[i] == target){
				
				index = i;
			}
		}
		
		return index;
	}
	

	// Item 12
	public static int search04(int[] arr, int target){
		
		int index = -1;
		
		for( int i = arr.length - 1 ; i >= 0 ; i--){
			
			if( arr[i] == target){
				
				index = i;
			}
		}
		
		return index;
	}
	
}