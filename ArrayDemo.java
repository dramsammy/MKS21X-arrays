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
		//	System.out.println(countZeros2D(TestArray2)); // Testing CountZeroes2d
		//  fill2D(TestArray2); // Testing Fill2d
		//  printArray(fill2DCopy(TestArray2)); // Testing fill2DCopy
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
	public static void fill2D(int[][] vals){
		int j = vals.length;
		for (int a = 0; a < j; a++){
			for (int b = 0; b < vals[a].length; b ++){
				if (a == b){
					vals[a][b] = 3;
				}
				else {vals[a][b] = 1;
				}
			}
		}
		printArray(vals);
	}

	public static int[][] fill2DCopy(int[][] vals){
      for (int i = 0; i < vals.length; i++){
      	for (int t = 0; t < vals[i].length; t++){
        	if (vals[i][t] < 0){
						vals [i][t] = 3;}
          else {
              vals[i][t] = 1;}
						}
					}
            return vals;

}
}
