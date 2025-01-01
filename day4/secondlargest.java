import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the array size = ");

		int size = sc.nextInt();

		int arr[] = new int[size];

		int firstlarge = Integer.MIN_VALUE;

		int secondlarge = Integer.MIN_VALUE;

		for(int i=0;i<size;i++){

			arr[i]=sc.nextInt();

		}

	
		for(int i=0;i<size;i++){

			if(arr[i]>firstlarge){

				secondlarge = firstlarge;
                  
				firstlarge = arr[i];


			}else if(arr[i]>secondlarge && arr[i]!=firstlarge){
                          
				secondlarge = arr[i];
		}

	}

		System.out.println(" the second largest is = " +secondlarge);
	}
}
