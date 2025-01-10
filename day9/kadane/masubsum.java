class Demo{

	public static void main(String[] args){

		int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};

		int sum = 0;

		int maxsum = Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
                     
			sum = sum+arr[i];

			if(sum>maxsum)
				maxsum = sum;

			if(sum<0)
				sum = 0;

		}
		
		System.out.println(maxsum);

	}
}
