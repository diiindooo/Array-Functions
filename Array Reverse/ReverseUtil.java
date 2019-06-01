public class ReverseUtil{
	
	// full
	public static void reverse(int[] arr){
	
		for(int i=0 ; i < arr.length/2 ; i++){
			ArraySwapper.swap(arr, i, arr.length-1-i);
		}
	}
	
	// partial
	public static void reverse(int[] arr, int start, int end){
		
		for( ; start < end ; ){
			
			ArraySwapper.swap(arr, start, end);
			
			start++;
			end--;
		}
	
	}

}