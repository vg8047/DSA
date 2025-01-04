import java.util.*;

class Maxelement{

	public static void main(String[] args){

	         int arr[] = new int[]{3,4,5,1,2,7,9,8};

		 int max = Integer.MIN_VALUE;

		 Scanner sc = new Scanner(System.in);

		 System.out.println("Enter the endindex");

		 int endindex = sc.nextInt();

		 int sum =0;

		 for(int i=0;i<=endindex;i++){

			 if(arr[i]>max){

				 max = arr[i];             //time complexity = O(n) and space complexity = O(1)

			 }
		 }

		 System.out.println(max);

	}
}
