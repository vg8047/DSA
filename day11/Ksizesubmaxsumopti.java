class prefixksizesubmaxsum{

	public static void main(String[] args){

		int arr[] = new int[]{-3,4,-2,5,3,-2,8,2,1,4};

		int k=4;

		int prefixsum[] = new int[arr.length];

		prefixsum[0]=arr[0];

		for(int i=1;i<arr.length;i++){

			prefixsum[i]=prefixsum[i-1]+arr[i];

		}

		int start = 0;

		int end = k-1;

		int max = Integer.MIN_VALUE;

		int sum=0;

		while(end<arr.length){

                       if(start==0)
			       sum=end;

		        else
				sum = prefixsum[end]-prefixsum[start-1];             // time complexity = O(N) and space complexity=O(N)

			if(sum>max)
				max=sum;

			start++;
			end++;

		}

		System.out.println(max);

	}
}






