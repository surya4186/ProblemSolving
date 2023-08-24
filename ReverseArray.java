/******************************************************************************
Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}
*******************************************************************************/

public class ReverseArray
{
    public static void reverseArray(int[] array,int start,int end){
        for(int i=0;i<array.length/2;i++){
            int tem=array[start];
            array[start]=array[end];
            array[end]=tem;
            start++;
            end--;
            
        }
        for(int n:array){
            System.out.print(n+" ");
        }
    }
	public static void main(String[] args) {
		int[] array={1, 2, 3};
		reverseArray(array,0,array.length-1);
	}
}
