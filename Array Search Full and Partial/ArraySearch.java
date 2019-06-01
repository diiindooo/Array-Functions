public class ArraySearch{
	
	// Item 05
	// 1. What is the method trying to do? Is it search, findMin/findMax, sort, swap
	// 2. Is the method a partial or full traversal method?
	// 3. Is the method doing a forward or backward traversal?
	// 4. If it is a search method, is it first-match or last-match?
	public static int search01(int[] arr, int target, int start, int end){
		
		for( ; start <= end ; start++ ){
			
			if( arr[start] == target){
				
				return start;
			}
		}
		
		return -1;
	}
	
	// Item 06
	public static int search02(int[] arr, int target, int start, int end){
		
		for( ; end >= start ; end-- ){
			
			if( arr[end] == target){
				
				return end;
			}
		}
		
		return -1;
	}
	
	// Item 07
	public static int search03(int[] arr, int target, int start, int end){
		
		int index = -1;
		
		for( ; start <= end ; start++ ){
			
			if( arr[start] == target){
				
				index = start;
			}
		}
		
		return index;
	}
	
	// Item 08
	public static int search04(int[] arr, int target, int start, int end){
		
		int index = -1;
		
		for( ; end >= start ; end-- ){
			
			if( arr[end] == target){
				
				index = end;
			}
		}
		
		return index;
	}
	
}