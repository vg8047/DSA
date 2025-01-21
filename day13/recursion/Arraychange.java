import java.util.*;
class Arrayeffect{

            static void Arrayprint(int arr[]){

		 for(int i=0;i<arr.length;i++){

			 arr[i] = arr[i]+5;

		 }
	 }

	public static void main(String[] args){

		int arr[] = new int[5];

		Scanner sc= new Scanner(System.in);

		for(int i=0;i<arr.length;i++){

			arr[i] = sc.nextInt();

		}

		Arrayprint(arr);

		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i] +" ");

		}

	}

}
