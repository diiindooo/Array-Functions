public class MaxFinder{
	
	// forward
	public static int find01(int[] arr, int start, int end){
		
		int maxIndex = start;
		start++;
		
		for( ; start <= end ; start++){
			
			if(arr[start] > arr[maxIndex]){
				
				maxIndex = start;
			}
		}
		
		return maxIndex;
	}

	// backward
	public static int find02(int[] arr, int start, int end){
		
		int maxIndex = end;
		end--;
		
		for( ; end >= start ; end--){
			
			if(arr[end] > arr[maxIndex]){
				
				maxIndex = end;
			}
		}
		
		return maxIndex;
	}

	
	
}