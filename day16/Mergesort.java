class Mergesort{

	void MergeArray(int arr[] ,int start,int mid,int end){

		int n1 = mid-start+1;
		int n2 =end-mid;

		int arr1[] = new int[n1];
		int arr2[] = new int[n2];

		for(int i=0;i<arr1.length;i++){

			arr1[i] = arr[start+i];

		}

		for(int j=0;j<arr2.length;j++){

			arr2[j] = arr[mid+j+1];

		}

		int i=0,j=0,k=start;

		while(i<arr1.length && j<arr2.length){

			 if(arr1[i]<arr2[i]){
				 
				 arr[k] = arr1[i];
                                 i++;
				 
			 }else{
				 arr[k] = arr2[j];
				 j++;
				 
			 }

			 k++;
		}

		while(i<arr1.length){

			arr[k] = arr1[i];
			i++;
			k++;
		}

		while(j<arr2.length){

			arr[k] = arr2[j];
			j++;
			k++;
		}
	
  }


	void Mergesort(int arr[],int start,int end){

		if(start<end){

			int mid = start + (end-start)/2;

			Mergesort(arr,start,mid);
			Mergesort(arr,mid+1,end);

			MergeArray(arr,start,mid,end);

		}
	}

	public static void main(String[] args){

		int arr[] = new int[]{9,1,8,2,7,3,6,4};

		int start = 0;

		int end = arr.length-1;

		Mergesort obj = new Mergesort();

		obj.Mergesort(arr,start,end);

		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i]+" ");

		}
	}
}
