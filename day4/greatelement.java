import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("give the size of an array");

		int size = sc.nextInt();

		int arr[] = new int[size];

		int count=0;

		for(int i=0;i<size;i++){

			arr[i]=sc.nextInt();

		}

		for(int i=0;i<size;i++){

			for(int j=0;j<size;j++){

				if(arr[j]>arr[i]){           // time complexity = O(n^2)

					count++;
					break;

				}
			}
		}

		System.out.println("count of elements are= "+count);

	}
}
