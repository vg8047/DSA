import java.util.*;
class Demo{

	public static void main(String[] args){

		int arr[] = new int[]{2,5,3,11,7,9};

                System.out.println(rangesum(arr));

	}

	static String rangesum(int arr[]){

		Scanner sc= new Scanner(System.in);

		int startindex =sc.nextInt();

	        int endindex = sc.nextInt();

	        if(startindex<0 || startindex>arr.length-1 || endindex>arr.length-1 || endindex<0){

		 
		               return "the index should be proper in range";

		}

                 if(startindex>endindex){

	                         return "the start must be less than end";

		 }

		 int sum = 0;

                 for(int i=startindex;i<=endindex;i++){

			 sum = sum+arr[i];                        

		 }

	  return sum+"";

	}
}

	                  		 
