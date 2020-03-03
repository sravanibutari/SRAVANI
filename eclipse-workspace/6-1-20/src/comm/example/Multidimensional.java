package comm.example;

public class Multidimensional {
	public static void main(String[] args)
	{
	int row=5,column=5;
	int arr1[][]=new int[5][5];
	int arr2[][]=new int[5][5];
	int arr3[][]=new int[5][5];
	
      for(int i=0;i<5;i++)
      {
    	  for(int j=0;j<5;j++)
    	  {
    		  arr3[i][j]=arr1[i][j]+arr2[i][j];
    	  }
      }
      System.out.println("sum of two matrices is:");
      for(int[] :arr3)
      {
    	  for(int[] :arr3)
    	  {
    		  System.out.println(column +"   ");
    	  }
    	  System.out.println();
      }
	}
}
