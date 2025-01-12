class Slidingwindow{

	public static void main(String[] args){

		int arr[] = new int[]{-3,4,-2,5,3,-2,8,2,1,4};

		int k=4;

		int sum=0;

		for(int i=0;i<k;i++){

			sum = sum+arr[i];
		}

		int max = sum;

		int start = 1;
		int end = k;

		while(end<arr.length){

			sum = sum-arr[start-1]+arr[end];

		      if(sum>max)
			      max = sum;                              //time complexity = O(N) and space complexity =O(1)


		      start++;
		      end++;

		}

		System.out.println(max);

	}
}
