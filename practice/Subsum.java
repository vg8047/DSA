class Demo{

	public static void main(String[] args){

		int arr[] = new int[]{2,3,4,12,11,7,8};
		
		for(int i=0;i<arr.length;i++){

			int sum = 0;

			for(int j=i;j<arr.length;j++){

				sum = sum +arr[j];

				System.out.println(sum);

			}

		}
	}
}
