class Ksizesubmaxsum{

	public static void main(String[] args){

		int arr[] = new int[]{-3,4,-2,5,3,-2,8,2,1,4};

		int k=4;

		int start = 0;

		int end = k-1;

		int max = Integer.MIN_VALUE;

		while(end<arr.length){

			int sum=0;

			for(int i=start;i<=end;i++){
				 
				sum = sum + arr[i];            // time complexity = O((N-k)*K)  and space complexity = O(1)

			}

			if(sum>max)
				max=sum;

			start++;
			end++;

		}

		System.out.println(max);

	}
}
