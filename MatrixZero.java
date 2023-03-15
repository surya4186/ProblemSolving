
public class MatrixZero
{
    public static void setZeros(int[][] array,int[] row,int[] col){
          for(int i=0;i<array.length;i++){
	            for(int j=0;j<array[i].length;j++){
	                if(array[i][j]==0){
	                    row[i]=-1;
	                    col[j]=-1;
	                }
	             }
	         }
	         for(int i=0;i<array.length;i++){
	            for(int j=0;j<array[i].length;j++){
	                if(col[j]==-1 || row[i]==-1){
	                    
	                  array[i][j]=0;
	                }
	            }
	        }
	        printArray(array);
	   
        
    }
    public static void printArray(int[][] matrix){
        for(int[] i:matrix){
	            for(int j:i){
	                System.out.print(j+" ");
	            }
	            System.out.println();
	        }
        
        
    }
    
	public static void main(String[] args) {
	        int [][] array={{1,1,1},
	                         {1,0,1}
	                        ,{1,1,1}};
	        int [] row=new int[array.length];
	        int [] col=new int[array.length];
	        setZeros(array,row,col);
	       
	}
}
