import java.util.*;
class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size of array = ");

		int size = sc.nextInt();

		int arr[] = new int[size];

		int count = 0;

		int sum = 10;

		int iteration= 0;

		for(int i=0;i<size;i++){

			arr[i] = sc.nextInt();

		}

		for(int i=0;i<size;i++){

			for(int j=0;j<size;j++){

				iteration++;

				if(arr[i]+arr[j] == sum  && i!=j){

					count++;                             // time complexit = O(n^2)

				}
			}
		}

		System.out.println("the no of pairs="+count);

		System.out.println("the no of iterations are = "+iteration);

	}
}
