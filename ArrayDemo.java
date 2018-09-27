public class ArrayDemo{
	public static void printArray(int[]ary){
		int i = 0;
		int j = ary.length ;
		String str = "";
		while (i<j){
			str = (ary[i] + " " + str);
			i++;
		}
		System.out.println(str);
	}
	public static void printArray(int[][]ary){
		int a = 0;
		int b = ary.length ;
		int c = ary[0].length;
		int d = 0;
		String strs = "";
		while (a<b){
			strs = (ary[a] + " " + strs);
			while (d < c){
				strs = ((ary[a][d]) + " " + strs);
				d++;
			}
			a++;
		}
		System.out.println(strs);
	}
	public static void main(String[] args){
			int[]TestArray = new int[10];
			int[][]TestArray2 = new int[5][5];
		//	((printArray(TestArray)) + "\n")  // Testing printArray
			printArray(TestArray2);
	}
}
