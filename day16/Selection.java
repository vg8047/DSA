class Selection{

	public static void main(String[] args){

		int arr[] = new int[]{9,8,3,5,4,7,6};
		

		for(int i=0;i<arr.length-1;i++){

			int minelement = i;

			for(int j=i+1;j<arr.length;j++){

				if(arr[j]<arr[minelement])
					minelement = j;

			}

			int temp = arr[i];

			arr[i] = arr[minelement];

			arr[minelement] = temp;

		}

		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i]+" ");

		}

	}
}
