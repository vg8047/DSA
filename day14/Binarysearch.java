import java.util.*;

class Demo{


	int Binarysearch(int arr[],int num){

		int start = 0;

		int end = arr.length-1;

		while(start<=end){

			int mid = (start+end)/2;

			if(arr[mid]==num)
				return mid;

			if(arr[mid]>num)
				end=mid-1;
			
			if(arr[mid]<num)
				start=mid+1;


		}

		return -1;

	}

	public static void main(String[] args){

		Demo obj = new Demo();

		int arr[] = new int[]{10,20,30,40,50};

		Scanner sc = new Scanner(System.in);

		int value = sc.nextInt();

		int ret = obj.Binarysearch(arr,value);
              
		if(ret==-1)
			
			System.out.println("Element not found");

		else
		      System.out.println("Element found at index"+ret);

	}

}
