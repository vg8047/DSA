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
               

		for(int i=0;i<size/2;i++){
                    
			
			 temp = arr[i];                              // time complexity = O(n) and space complexity = O(1)
                        
			 arr[i]=arr[size-i-1];

			 arr[size-i-1] = temp;
		}
		

		for(int i=0;i<size;i++){

			System.out.print(arr[i]+" ");

		}
	}
}
