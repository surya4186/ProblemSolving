/******************************************************************************
Input: arr[] = {22, 14, 8, 17, 35, 3}
Output:  Minimum element is: 3
        Maximum element is: 35
        
*******************************************************************************/
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
        int[] arr={22, 14, 8, 17, 35, 3};
         Arrays.sort(arr);
         System.out.println("Minimum element is: "+arr[0]);
         System.out.println("Maximum element is: "+arr[arr.length-1]);
	}
}
