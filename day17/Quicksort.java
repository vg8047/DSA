import java.util.*;
class Quicksort{


	int partition(int arr[],int start,int end){

		 int pivot = arr[end];

		 int i=start-1;

		 for(int j=start;j<end;j++){

			 if(arr[j]<=pivot){
				 
				 i++;
				 int temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;

			 }
		 }

		 int temp = arr[i+1];
		 arr[i+1] = arr[end];
		 arr[end] = temp;

		 return i+1;

	}


	void quicksort(int  arr[] , int start, int end){

		if(start<end){

			int pivotindex = partition(arr,start,end);

			quicksort(arr,start,pivotindex-1);
			quicksort(arr,pivotindex+1,end);

		}
	}

	public static void main(String[] args){

		int arr[] = new int[]{12,7,6,14,5,15,10};

		System.out.println(Arrays.toString(arr));

		Quicksort obj = new Quicksort();

		obj.quicksort(arr,0,arr.length-1);

		System.out.println(Arrays.toString(arr));

	}
}



