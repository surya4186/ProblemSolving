/******************************************************************************
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
*******************************************************************************/

public class MaximunSubArray
{
     public static int maxSubArray(int[] nums) {
        int sum=0;
        int result=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
            result=Math.max(result,sum);
            if(sum<0){
                sum=0;
            }

        }
        return result;
        
    }
	public static void main(String[] args) {
		int[] numbers={-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(numbers));
	}
}
