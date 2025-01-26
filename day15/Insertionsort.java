class Insertionsort{

	public static void main(String[] args){

		int arr[] = new int[]{8,3,1,7,5,4,2};

		for(int i=1;i<arr.length;i++){

			  int element = arr[i];

			  int j=i-1;

			  while(j>=0 && arr[j]>element){

				  arr[j+1]=arr[j];
				  j--;

			  }

			  arr[j+1]=element;

		}

		for(int i=0;i<arr.length;i++){

			System.out.println(arr[i]);

		}

	}
}
