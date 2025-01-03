import java.util.*;

class Demo{

	public static void main(String[] args){

		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};

		int prefixsum[] = new int[arr.length];

		prefixsum[0] = arr[0];

		for(int i=1;i<arr.length;i++){

			prefixsum[i] = prefixsum[i-1]+arr[i];

		}

		System.out.println("enter the no of queries = ");

	        int sum =0;

		Scanner sc = new Scanner(System.in);

		int query = sc.nextInt();

		for(int i=0;i<query;i++){

			int startindex = sc.nextInt();

			int endindex = sc.nextInt();

                        if(startindex ==0){

				sum=prefixsum[endindex];
                          }else{
				  sum = prefixsum[endindex]-prefixsum[startindex-1];      // space complexity = O(n)

			       }

			System.out.println("the sum between index is = "+sum);

		}
	}
}
