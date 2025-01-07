class Demo{

	public static void main(String[] args){

		int arr[] = new int[]{1,2,3,1,3,4,6,4,6,3};

		int minelement = Integer.MAX_VALUE;
		int maxelement = Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){

			if(arr[i]<minelement){
				minelement = arr[i];

			}

			if(arr[i]>maxelement){
				maxelement=arr[i];

			}
		}

		int length= Integer.MAX_VALUE;

		int index =0;

		int minlength=Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++){

			if(arr[i]==minelement){
				 index =i;

			}

			if(arr[i]==maxelement){
				int  j=i;
				length = j-index+1;

			}                                         //time complexity = O(N)

			if(minlength>length){

				minlength=length;
			}

		}

		        	
                 System.out.println(minlength);

	}
}
