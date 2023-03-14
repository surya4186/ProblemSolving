package Leetcode;
/*
 * Input: array = [1,3,5,6], target = 5
   Output: 2
   
   Input: array = [1,3,5,6], target = 2
   Output: 1
 */

public class SearchPosition {
	private static int searchInsert(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			} else if (array[i] > target) {
				return i;

			}
		}
		return array.length;
	}

	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 6 };
		int target = 2;
		System.out.println(searchInsert(array, target));

	}

}
