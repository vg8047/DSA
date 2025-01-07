class Sumsubcarry{

	public static void main(String[] args){

		int arr[] = new int[]{2,4,1,3};

		for(int i=0;i<arr.length;i++){

			int sum = 0;

			for(int j=i;j<arr.length;j++){
     
				 sum = sum+arr[j];                  // time complexity = O(N^2) and space complexity = O(1)

				 System.out.println(sum);

			}
		}
	}
}
                               
