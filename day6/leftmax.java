class Leftmax{

	public static void main(String[] args){

		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};

		int leftmax[] = new int[arr.length];

		leftmax[0] = arr[0];

		for(int i=1;i<leftmax.length;i++){

			if(arr[i]>leftmax[i-1]){

				leftmax[i] = arr[i];

			}else{
				leftmax[i] = leftmax[i-1];          // time complexity =O(n) ans space complexity = O(1)

			}


		}

		for(int i=0;i<leftmax.length;i++){

			System.out.print(leftmax[i]+" ");
		}
	}
}
