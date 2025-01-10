class  Boundaryprint{

	public static void main(String[] args){

	 int arr[][] = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};


	   int start=0;
	   int end=0;

	   for(int i=0;i<=arr.length-2;i++){

		   System.out.print(arr[start][end]+",");
		   end++;

	   }

	   for(int i=0;i<=arr.length-2;i++){

		   System.out.print(arr[start][end]+",");
		   start++;

	   }

	   for(int i=0;i<=arr.length-2;i++){

		   System.out.print(arr[start][end]+" , ");
		   end--;

	   }

	   for(int i=0;i<=arr.length-2;i++){

		   System.out.print(arr[start][end]+ " , ");

		   start--;

	    }

	 }
	
}
