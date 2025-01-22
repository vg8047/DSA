import java.util.*;

class Binaryrecursion{


	int Binarysearch(int arr[],int num,int start,int end){

		
		        if(start>end)

				return -1;	
                       else{

			int mid = (start+end)/2;

			if(arr[mid]==num)
				return mid;

			if(arr[mid]>num)
				return Binarysearch(arr,num,start,mid-1);
			
			else
				 return Binarysearch(arr,num,mid+1,end);

		       }
         }

	public static void main(String[] args){

		Binaryrecursion obj = new Binaryrecursion();

		int arr[] = new int[]{10,20,30,40,50};

		Scanner sc = new Scanner(System.in);

		int value = sc.nextInt();

		int start = 0;

		int end = arr.length-1;

		int ret = obj.Binarysearch(arr,value,start,end);
              
		if(ret==-1)
			
			System.out.println("Element not found");

		else
		      System.out.println("Element found at index"+ret);

	}

}
