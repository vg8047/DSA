class Demo{

	public static void main(String[] args){

		int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};

		int sum = 0;

		int maxsum = Integer.MIN_VALUE;

		int x = -1;

		int startindex = -1;

		int endindex = -1;

		for(int i=0;i<arr.length;i++){

			if(sum==0){

				x = i;
			}
                     
			sum = sum+arr[i];

			if(sum>maxsum){

				maxsum = sum;
				startindex = x;
				endindex = i;
			}

			if(sum<0)
				sum = 0;

		}

		for(int i=startindex;i<=endindex;i++){
		
	           	System.out.println(arr[i]);
               }
	}
}
