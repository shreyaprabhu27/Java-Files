import java.util.Random;

public class Example {
	
	public static void main(String[] args) {
		

//		System.out.println(checkString("aSSSS"));

//		System.out.println(isUniqueChars2("s"));
		
		char[] ch = {'a','b','c','a', 'b', 'd'};
		
		//reverseStr(ch);
		
		//removeDuplicates(ch);
		//removeDuplicates1(ch);
		
		//System.out.println(checkAnagram("aabd", "dbaa"));
		
		// System.out.println(replaceSpaces("sss"));
		int matrix[][] = {
			      { 1, 5, 9, 13, 1},
			      { 2, 6, 10, 14, 1 },
			      { 3, 7, 11, 15, 1 },
			      { 4, 8, 12, 16, 1 },
			      { 2, 2 ,2 ,2, 2, 1}
			    };
		
		//changeMatrix(matrix, 5);
		System.out.println(updateBits(1024,21, 2, 6));
		//rotate(matrix, 5);
		
		
		
		
		
	}
	
	/*
	private static int checkString(String words)
	{
		char c1, c2;
		for(int i=0; i <words.length(); i++)
		{
			c1 = words.charAt(i);
			 for(int j = i+1; j < words.length(); j++)
			 {
				 c2 = words.charAt(j);
				 if(c2 == c1)
				 {
					System.out.println(c2);
					 return 0;
				 }
			 }
				 
		}
		return 1;
		
	}
*/
	
	public static boolean isUniqueChars2(String str) {
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
		int val = str.charAt(i);
		
		if (char_set[val])
			{
			return false;
			}
		char_set[val] = true;
		}
		return true;
		}
	
	public static void removeDuplicates(char[] str) {
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length; i++) {
		int val = str[i];
		//System.out.println(val);
		//System.out.println(char_set[val]);
		if (char_set[val])
			{
			str[i] = 0;
			//System.out.println(str[i]);
			}
		char_set[val] = true;
		}
		System.out.println(str);
	}
	
	public static void removeDuplicates1(char[] str) {
		if (str == null) return;
		int len = str.length;
		if (len < 2) return;
		
		int tail = 1;
		
		for (int i = 1; i < len; ++i) {
		int j;
		for (j = 0; j < tail; ++j) {
		if (str[i] == str[j]) break;
		}
		if (j == tail) {
		str[tail] = str[i];
		++tail;
		}
		}
		str[tail] = 0;
		
		System.out.println(str);
		
		 }
	
	public static void reverseStr(char[] original)
	{
		for(int i = 0; i< original.length/2; i++)
		{
			char temp1;
			temp1 = original[i];
			//System.out.println(temp1);
			original[i] = original[original.length - i - 1];
			//System.out.println(original[i]);
			original[original.length - i - 1] = temp1;	
			//System.out.println(original[original.length - i - 1]);
		}
		
		System.out.println(original);
		
	}
	
	public static boolean checkAnagram(String str1, String str2)
	{
		//if(str1.equals(str2))
			//return false;
		if(str1.length() != str2.length())
			return false;
		char[] str1char = str1.toCharArray();
		char[] str2char = str2.toCharArray();
		
		for(int i = 0; i< str1char.length/2; i++)
		{
			//System.out.println(str1char[i]);
			if(str1char[i] != str2char[str1char.length - i - 1])
			return false;
		}
		
		return true;
		
	}
	
	public static String replaceSpaces(String str1)
	{
		//if(str1.equals(str2))
			//return false;
		
		StringBuffer newString = new StringBuffer ("");
		char[] str1char = str1.toCharArray();
		for(int i = 0; i< str1char.length; i++)
		{
			if(str1char[i] == ' ')
			 newString.append("%20");
			else 
			 newString.append(str1char[i]);
		}
		
		return newString.toString();
		
	}
	
	
	
	
	public  static void changeMatrix(int[][] matrix, int n)
	{
		int changedMatrix[][] = new int[n][n];
		for(int i = 0; i< n ;i++)
		{
			for(int j = 0; j<n; j++)
			{
			 changedMatrix[j][n-1-i] = matrix[i][j];
			}	
		}
		
		for(int i = 0; i < n ; i++)
		{
			for(int j =0; j <n ; j++)
				System.out.print(changedMatrix[i][j] + " ");
			System.out.println(" "); //start printing from the next line
		}
		System.out.println();
		
	}
	
	public static void rotate(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; ++layer) {
		int first = layer;
		int last = n - 1 - layer;
		for(int i = first; i < last; ++i) {
		int offset = i - first;
		int top = matrix[first][i]; // save top
		// left -> top
		matrix[first][i] = matrix[last-offset][first];
		
		// bottom -> left
		 matrix[last-offset][first] = matrix[last][last - offset];
		
		// right -> bottom
		matrix[last][last - offset] = matrix[i][last];
		// top -> right
		 matrix[i][last] = top; // right <- saved top
		 }
		 }
		
		for(int i = 0; i < n ; i++)
		{
			for(int j =0; j <n ; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println(" "); //start printing from the next line
		}
		System.out.println();
		
		 }
	
	public static int updateBits(int n, int m, int i, int j) {
		int max = ~0; /* All 1’s */
		
		System.out.println(max);
		// 1’s through position j, then 0’s
		int left = max - ((1 << j) - 1);
		
		System.out.println(left);
		// 1’s after position i
		int right = ((1 << i) - 1);
		
		System.out.println(right);
		// 1’s, with 0s between i and j
		int mask = left | right;
		
		System.out.println(mask);
		// Clear i through j, then put m in there
		return (n & mask) | (m << i);
		}
	
	
}
