public class ArraySort {
	
	// Item 13
	// forward, ascending
	public static void sort01(int[] arr){
		
		for( int i = 0 ; i < arr.length - 1 ; i++ ){
			
			int index = ArrayMinMax.findMin01(arr, i, arr.length - 1 );
			
			if( index != i){
				
				ArraySwap.swap( arr , i , index );
				//ArraySwap.swap( arr , index , i ); <-- pwede pud ni
			}
		}
	}
	
	// Item 14
	// forward, descending
	public static void sort02(int[] arr){
		
		for( int i = 0 ; i < arr.length - 1 ; i++ ){
			
			int index = ArrayMinMax.findMax01(arr, i, arr.length - 1 );
			
			if( index != i){
				
				ArraySwap.swap( arr , i , index);
			}
		}
	}
}
