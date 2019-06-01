public class PartialArraySearch{
	
	// forward, first-match
	public static int find01(char[] arr, int start, int end, char target){
		
		for(;start <= end ; start++){
			
			if(arr[start]==target){
				
				return start;
			}
		}
		
		return -1;
	}
	
	// forward, last-match
	public static int find02(char[] arr, int start, int end, char target){
		
		int index = -1;
		
		for(;start <= end ; start++){
			
			if(arr[start]==target){
				
				index = start;
			}
		}
		
		return index;
	}
	
	// backward, first-match
	public static int find03(char[] arr, int start, int end, char target){
		
		for(; end >= start ; end--){
			
			if(arr[end]==target){
				
				return end;
			}
		}
		
		return -1;
	}

	// backward, last-match
	public static int find04(char[] arr, int start, int end, char target){
		
		int index = -1;
		
		for(; end >= start ; end--){
			
			if(arr[end]==target){
				
				index = end;
			}
		}
		
		return index;
	}

	
}