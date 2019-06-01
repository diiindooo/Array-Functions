public class MinFinder{
	
	// forward
	public static int find01(int[] arr, int start, int end){
		
		int minIndex = start;
		start++;
		
		for( ; start <= end ; start++){
			
			if(arr[start] < arr[minIndex]){
				
				minIndex = start;
			}
		}
		
		return minIndex;
	}

	// backward
	public static int find02(int[] arr, int start, int end){
		
		int minIndex = end;
		end--;
		
		for( ; end >= start ; end--){
			
			if(arr[end] < arr[minIndex]){
				
				minIndex = end;
			}
		}
		
		return minIndex;
	}

	
	
}