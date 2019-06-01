public class ArrayMinMax{
	
// Item 01	
	// 1. What is the method trying to do? Is it search, findMin/findMax, sort, swap
	// 2. Is the method a partial or full traversal method?
	// 3. Is the method doing a forward or backward traversal?
	public static int findMin01(int[] arr, int start, int end){
		
		int index = start;
		start++;
		
		for( ; start <= end ; start++ ){
			if( arr[start] < arr[index] ){
				index = start;
			}
		}
	
		return index;
	}	
	
// Item 02
	// 1. What is the method trying to do? Is it search, findMin/findMax, sort, swap
	// 2. Is the method a partial or full traversal method?
	// 3. Is the method doing a forward or backward traversal?
	public static int findMin02(int[] arr, int start, int end){
		
		int index = end;
		end--;
		
		for( ; end >= start ; end-- ){
			
			if( arr[end] < arr[index] ){
				
				index = end;
			}
		}
		
		return index;
	}
	
	
// Item 03
	public static int findMax01(int[] arr, int start, int end){
		
		int index = start;
		start++;
		
		for( ; start <= end ; start++ ){
			
			if( arr[start] > arr[index] ){
				
				index = start;
			}
		}
		
		return index;
	}
	
	// Item 04
	public static int findMax02(int[] arr, int start, int end){
		
		int index = end;
		end--;
		
		for( ; end >= start ; end-- ){
			
			if( arr[end] > arr[index] ){
				
				index = end;
			}
		}
		
		return index;
	}
}