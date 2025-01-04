class Leftmax{

	public static void main(String[] args){

		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};

		int leftmax[] = new int[arr.length];

		int max = Integer.MIN_VALUE;

		for(int i=0;i<leftmax.length;i++){

		    for(int j=0;j<=i;j++){

			    if(arr[j]>max){

				    max = arr[j];       // time complext = O(n^2) and space complexity = O(1)

			    }
		    }

		    leftmax[i]=max;

		}

		for(int i=0;i<leftmax.length;i++){

			System.out.print(leftmax[i]+" ");
		}
	}
}
