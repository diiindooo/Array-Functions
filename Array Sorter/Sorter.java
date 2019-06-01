public class Sorter{
	
	// ascending, forward
	public static void sort01(int[] arr){

		for(int i=0;i<arr.length-1;i++){
			
			int index = MinFinder.find01(arr, i, arr.length-1);
			
			if(index!=i){
				
				ArraySwapper.swap(arr,i,index);
			}
		}
	}
	
	// descending, forward
	public static void sort02(int[] arr){

		for(int i=0;i<arr.length-1;i++){
			
			int index = MaxFinder.find01(arr, i, arr.length-1);
			
			if(index!=i){
				
				ArraySwapper.swap(arr,i,index);
			}
		}
	}
}