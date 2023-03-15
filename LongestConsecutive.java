
/*
    Input: nums = [100,4,200,1,3,2]
    Output: 4
    Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
*/
import java.util.Arrays;
public class LongestConsecutive
{
    public static int longestConsecutive(int[] nums){
        Arrays.sort(nums);
        int max=1;
        int result=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]-1){
                max++;
            }else if(nums[i]!=nums[i+1]-1){
                max=1;
            }
            result=Math.max(max,result);
        }
        return result;
    }
	public static void main(String[] args) {
		int [] nums={0,3,7,2,5,8,4,6,0,1};
		
		System.out.println(longestConsecutive(nums));
	}
}
