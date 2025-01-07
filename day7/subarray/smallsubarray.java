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

		int length= 0;

		int minlength=Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++){

			if(minelement == maxelement){
				minlength=1;

			}

			if(arr[i]==minelement){

			       for(int j = i+1;j<arr.length;j++){

                                        if(arr[j]==maxelement){

					        length=j-i+1;
                                                                                     //time complexuty = O(N^2)
						if(minlength>length)
							minlength = length;

					}

			       }
			}else if(arr[i]==maxelement){

				for(int j=i+1;j<arr.length;j++){

					if(arr[j]==minelement){

						 length = j-i+1;

						 if(minlength>length)
							 minlength=length;

					}
				}
			}

		}

		System.out.println(minlength);

	}
}
