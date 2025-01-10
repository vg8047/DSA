class Maxsumofsub{

	public static void main(String[] args){

		int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};

		int max = Integer.MIN_VALUE;

		for(int i = 0;i<arr.length;i++){

			int sum = 0;

			for(int j=i;j<arr.length;j++){
                       
				sum = sum +arr[j];

				if(sum>max){                 // time complexity = O(N^2) and space complexity = O(1)

					max = sum;        // using carray forward

				}
			}
		}

		System.out.println(max);

	}
}
