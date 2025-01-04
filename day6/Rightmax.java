class Rightmax{

	public static void main(String[] args){

		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};

		int Rightmax[] = new int[arr.length];

		Rightmax[Rightmax.length-1] = arr[arr.length-1];

		for(int i=(Rightmax.length-2);i>=0;i--){

			if(Rightmax[i+1]<arr[i]){

				Rightmax[i] = arr[i];

			}else{
				Rightmax[i] = Rightmax[i+1];          // time complexity =O(n) ans space complexity = O(1)

			}


		}

		for(int i=0;i<Rightmax.length;i++){

			System.out.print(Rightmax[i]+" ");
		}
	}
}
