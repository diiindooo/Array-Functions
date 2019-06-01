public class MinMaxDemo{
	
	public static void main(String[] args){
		
		//                    0  1  2    3    4  5     6
		int[] arr = new int[]{1, 3, 1, -23, -23, 4, -100};
		
		// System.out.println(MinFinder.find01(arr, 2, 6)); // 1
		// System.out.println(MinFinder.find01(arr, 2, 4)); // 2
		// System.out.println(MinFinder.find02(arr, 2, 4)); // 3

		// System.out.println(MaxFinder.find01(arr, 2, 6)); // 4
		// System.out.println(MaxFinder.find01(arr, 2, 4)); // 5
		// System.out.println(MaxFinder.find02(arr, 2, 4)); // 6
		
		ArrayPrintUtil.print01(arr);

		// Sorter.sort01(arr);
		// ArrayPrintUtil.print01(arr);		

		// Sorter.sort02(arr);
		// ArrayPrintUtil.print01(arr);		

		// ReverseUtil.reverse(arr, 1, 5);
		// ArrayPrintUtil.print01(arr);		
		
		// ReverseUtil.reverse(arr, 1, 5);
		// ArrayPrintUtil.print01(arr);		

		ReverseUtil.reverse(arr);
		ArrayPrintUtil.print01(arr); // 1

		ReverseUtil.reverse(arr, 1, 5);
		ArrayPrintUtil.print01(arr); // 2	

		ReverseUtil.reverse(arr, 0, 3);
		ArrayPrintUtil.print01(arr); // 3	

		
	}
	
	
	
	
}