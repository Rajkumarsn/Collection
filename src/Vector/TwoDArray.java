package Vector;

public class TwoDArray {

	public static void main(String[] args) {
     int[][] arr={ {10,20,30,40},
    		       {1,2,3,4},
    		       {10,20,40,10}};
     for(int i=0;i<3;i++)
     {
    	 for(int j=0;j<4;j++)
    	 {
    		 System.out.print(arr[i][j] +" ");
    	 }
    	 System.out.println();
     }
         
	}

}
