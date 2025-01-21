import java.util.*;
class Userinputarray{

            static void Arrayprint(int arr[]){

		 for(int i=0;i<arr.length;i++){

			 System.out.print(arr[i]+" ");

		 }
	 }

	public static void main(String[] args){

		int arr[] = new int[5];

		Scanner sc= new Scanner(System.in);

		for(int i=0;i<arr.length;i++){

			arr[i] = sc.nextInt();

		}

		Arrayprint(arr);

	}

}
