class Maxsumofsub{

	public static void main(String[] args){

		int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};

		int max = Integer.MIN_VALUE;

		int prefix[] = new int[arr.length];

		prefix[0] = arr[0];

		for(int i=1;i<arr.length;i++){

			prefix[i] = prefix[i-1]+arr[i];

		}

		for(int i = 0;i<arr.length;i++){

			int sum = 0;

			for(int j=i;j<arr.length;j++){
                       
				if(i==0)
				      sum = prefix[i];
				else
					sum = prefix[j]-prefix[i-1];

				if(sum>max){                 

					max = sum;   

				}
			}
		}

		System.out.println(max);

	}
}
