public class ArrayDemo{
	public static void printArray(int[]ary){
		int j = ary.length ;
		System.out.print("{");
		for (int i = 0; i<j; i++) {
			System.out.print(ary[i] + ",");
		}
		System.out.println("}");
	}
	public static void printArray(int[][]ary){
		int j = ary.length ;
		System.out.print("{");
		for (int i = 0; i<j; i++) {
			for (int a = 0; a < ary[i].length; a ++){
				System.out.print(ary[i][a] +",");
			}
		}
		System.out.println("}");
	}
	public static void main(String[] args){
			int[]TestArray = new int[10];
			int[][]TestArray2 = new int[5][5];
		//	((printArray(TestArray)) + "\n")  // Testing printArray
		//	printArray(TestArray2); // Testing 2D printArray
		System.out.println(countZeros2D(TestArray2));
	}
	public static int countZeros2D(int[][] nums){
		int j = nums.length ;
		String str = "";
		for (int i = 0; i<j; i++) {
			for (int a = 0; a < nums[i].length; a ++){
				str = nums[i][a] + str;
			}
		}
		int count = 0;
		for (int a = 0; a < str.length(); a++){
			if (str.substring(a,a + 1).equals("0")){
				count ++;
		}
	}
	return count;
}
}
