class RecSelection{


	void Sort(int arr[],int start ){

		if(start == arr.length-1)
			return;

		int minelement = start;

	         for(int j=start+1;j<arr.length;j++){

                               if(arr[j]<arr[minelement])
				       minelement = j;

		 }

		 int temp = arr[start];
		 arr[start] = arr[minelement];
		 arr[minelement] = temp;

		 Sort(arr,start+1);

	}

	public static void main(String[] args){

		int arr[] = new int[]{9,8,3,5,4,7,6};

		RecSelection obj = new RecSelection();

		obj.Sort(arr,0);

		for(int i=0;i<arr.length;i++){

			System.out.println(arr[i]);

		}

	}

}
