public class FullArraySearch{
	
	// forward, first-match
	public static int find01(char[] arr, char target){
		
		for(int i=0 ; i < arr.length ; i++){
			
			if(arr[i] == target){
				
				return i;
			}
		}
		
		return -1;
	}
	
	// forward, last-match
	public static int find02(char[] arr, char target){
		
		int index = -1;
		
		for(int i=0 ; i < arr.length ; i++){
			
			if(arr[i] == target){
				
				index = i;
			}
		}
		
		return index;
	}
	
	// backward, first-match
	public static int find03(char[] arr, char target){
		
		for(int i=arr.length-1 ; i >= 0 ; i--){
			
			if(arr[i] == target){
				
				return i;
			}
		}
		
		return -1;
	}
		
	// backward, last-match
	public static int find04(char[] arr, char target){
		
		int index = -1;
		
		for(int i=arr.length-1 ; i >= 0 ; i--){
			
			if(arr[i] == target){
				
				index = i;
			}
		}
		
		return index;
	}
	
	
}