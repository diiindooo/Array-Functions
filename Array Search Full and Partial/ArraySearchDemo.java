public class ArraySearchDemo{
	
	public static void main(String[] args){
			
		//                       0   1   2   3   4	
		char[] arr = new char[]{'H','A','P','P','Y'};

		System.out.println(FullArraySearch.find01(arr, 'P')); // 1
		System.out.println(FullArraySearch.find02(arr, 'P')); // 2
		System.out.println(FullArraySearch.find03(arr, 'P')); // 3
		System.out.println(FullArraySearch.find04(arr, 'P')); // 4
		
		System.out.println(PartialArraySearch.find01(arr, 0, 4, 'P')); // 5
		
		System.out.println(PartialArraySearch.find02(arr, 0, 2, 'P')); // 6
		System.out.println(PartialArraySearch.find02(arr, 0, 3, 'P')); // 7
		
	}
}