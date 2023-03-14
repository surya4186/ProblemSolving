package Leetcode;

/*
   Input: array = [-2,1,-3,4,-1,2,1,-5,4]
   Output: 6
   Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */
public class MaximumSubarray {
	private static int maxSubarray(int[] array) {
		int max = 0;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			max = Math.max(max, sum);
			if (sum < 0) {
				sum = 0;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubarray(array));

	}

}
