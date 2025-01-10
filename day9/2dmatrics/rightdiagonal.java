class Demo{

	public static void main(String[] args){

		int arr[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

		int startindex = 0;

		int endindex = arr.length-1;

		
                while(startindex<arr.length && endindex>=0){

			System.out.println(arr[startindex][endindex]);

			startindex++;
			endindex--;

		}
	}
}
