class Diagonalprint{

	public static void main(String[] args){

	 int arr[][] = new int[][]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};


	  for(int i=arr[0].length-1;i>=0;i--){

		   int j=0;
		   int y=i;

		   while(j<arr.length  &&  y>=0){

			   System.out.print(arr[j][y]+"\t");

			   j++;
			   y--;

		   }

		   System.out.println();

	  }
	}
}
