import java.util.*;
class Demo{

	 public static void main(String[] args){

		 int arr[] = new int[]{1,2,3,4,5,6};

		 int shift = 2;
      
		 arr= rotateshift(arr,shift);

		 System.out.println(Arrays.toString(arr));

	 

	 }

	 static int[] rotateshift(int []arr,int k){

	             int n = arr.length;

		     reverse(arr,0,n-1);

		     reverse(arr,0,k-1);

		     reverse(arr,k,n-1);

	      return arr;

	 }

	 static void reverse(int arr[],int start,int end){
                
		 int temp =0;

                 while(start<end){

			 temp = arr[start];

			 arr[start] = arr[end];

			 arr[end] = temp;

			 start++;
			 end--;

		 }
	 }

}




