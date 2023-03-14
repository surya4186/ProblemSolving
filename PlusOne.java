package Leetcode;

public class PlusOne {
	public static int[] plusOne(int [] digits) {
		int len=digits.length-1;
		for(int i=len;i>=0;i--) {
			if(digits[i]<9) {
				digits[i]=digits[i]+1;
				return digits;
			}
		}
		return digits;
	}
	public static void printArray(int[] array) {
		for(int i:array) {
			System.out.print(i+" ");
		}
		
	}

	public static void main(String[] args) {
		int[] digits= {1,2,3};
		plusOne(digits);
		printArray(digits);
		
		
		

	}

}
