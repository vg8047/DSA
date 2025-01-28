class DivideArray{


	void DivideArray(int arr[],int start,int end){

                if(start<end){

			 int mid = start+(end-start)/2;

			 System.out.println("start="+start+" mid = "+mid + " end "+end);

			 DivideArray(arr,start,mid);
			 DivideArray(arr,mid+1,end);

		}
	}


	public static void main(String[] args){

		int arr[] = new int[] {9,1,8,2,7,3,6,4};

		DivideArray obj  = new DivideArray();

		int start = 0;

		int end = arr.length-1;

		obj.DivideArray(arr,start,end);

	}

}
