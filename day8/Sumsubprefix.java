class Sumsubprefix{

	public static void main(String[] args){

		int arr[] = new int[]{2,4,1,3};

		int prefix[] = new int[arr.length];

		prefix[0] = arr[0];

		for(int i=1;i<arr.length;i++){

			prefix[i] = prefix[i-1]+arr[i];

		}

		int sum = 0;

		for(int i=0;i<arr.length;i++){

			for(int j=i;j<arr.length;j++){

				if(i==0)
					sum=prefix[j];            // time complexity = O(N^2) and space complexity = O(N)

				else
					sum = prefix[j]-prefix[i-1];

				System.out.println(sum);

			}
		}
	}
}
