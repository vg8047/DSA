class RecBubblesort{

	int count = 0;

	void Sort(int arr[] , int n){

		boolean isSort = false;

		if(n == 1)
			return;

		count++;

		for(int j=0;j<n-1;j++){

		    if(arr[j]>arr[j+1]){

			    isSort = true;

			    int temp = arr[j];
			    arr[j]=arr[j+1];
			    arr[j+1]=temp;

		    }
		}

		if(isSort == false)
			return;

		Sort(arr,n-1);

	}

			

	public static void main(String[] args){

		int arr[] = new int[]{7,3,9,4,2,5,6};

		RecBubblesort obj = new RecBubblesort();

		obj.Sort(arr,arr.length);

		for(int i=0;i<arr.length;i++){

			System.out.println(arr[i]);

		}

		System.out.println("the no of iteration "+obj.count);

	}
}
