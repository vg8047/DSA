import java.util.*;
class Demo{

	public static void main(String[] args){

		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,2,1};

                rangesum(arr);

	}

	static String rangesum(int arr[]){

		Scanner sc= new Scanner(System.in);

		System.out.println("enter the no of queries");

		int query = sc.nextInt();

		for(int i = 0;i<query;i++){

			System.out.println("enter the start and end = ");

			int startindex = sc.nextInt();

			int endindex = sc.nextInt();

			int sum =0;

	        if(startindex<0 || startindex>arr.length-1 || endindex>arr.length-1 || endindex<0){

		 
		               return "the index should be proper in range";

		}

                 if(startindex>endindex){

	                         return "the start must be less than end";

		 }

		 for(int j=startindex;j<=endindex;j++){


			 sum = sum+arr[j];                                 //time complexity = O(query*N)
		 }

		 System.out.println("the sum between start and end= "+sum);

	}

          return "";

	}
}

	                  		 
