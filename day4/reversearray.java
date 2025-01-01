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

		int newarr[] = new int[size];
               

		for(int i=0;i<size;i++){

			newarr[i]=arr[size-i-1];          // time complexity = O(n) and space complexity = O(n)

		}
		

		for(int i=0;i<size;i++){

			System.out.print(newarr[i]+" ");

		}
	}
}
