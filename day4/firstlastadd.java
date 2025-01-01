import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the array size = ");

		int size = sc.nextInt();

		int arr[] = new int[size];


		for(int i=0;i<size;i++){

			arr[i]=sc.nextInt();

		}

	
		for(int i=0;i<(size+1)/2;i++){

		  if(i==size/2){

			  System.out.print(arr[i]+" ");

		  }else{
			  System.out.print(arr[i]+arr[size-i-1]+" ");

		  }

	    }
	}
 
  }
