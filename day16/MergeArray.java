class MergeArray{

	public static void main(String[] args){

		int arr1[] = new int[]{3,7,9,11};
		int arr2[] = new int[]{0,1,2};

		int arr[] = new int[arr1.length+arr2.length];

		int i = 0,j=0,k=0;


           while(i<arr1.length && j<arr2.length){


		   if(arr1[i]<arr2[j]){
			   arr[k]=arr1[i];
			   i++;
		   }else{
			   arr[k]=arr2[j];
			   j++;

		   }

		   k++;

	   }

	   while(i<arr1.length){

		   arr[k]=arr1[i];
		   i++;
		   k++;
	   }

	   while(j<arr2.length){
		   
		   arr[k] = arr2[j];
		   j++;
		   k++;

	   }

	   for( i=0;i<arr.length;i++){
		    
		   System.out.print(arr[i]+" ");

	   }

	}
}

