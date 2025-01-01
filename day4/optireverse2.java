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

		 int temp = 0;
               
		 int i = 0;

		 int j = size-1;

		 while(i<j){

			 temp = arr[i];

			 arr[i] = arr[j];

			 arr[j] = temp;

			 i++;

			 j--;

		 }
		

		for(int k=0;k<size;k++){

			System.out.print(arr[k]+" ");

		}
	}
}
