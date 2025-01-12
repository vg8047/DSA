class Ksizesubarraycount{

	public static void main(String[] args){

		int arr[] = new int[]{-3,4,-2,5,3,-2,8,2,1,4};

	        int k=4;

		int count =0;

		for(int i=0;i<arr.length;i++){

			for(int j=i;j<arr.length;j++){

				if(j-i==3)
					count++;

			}
		}

		System.out.println(count);

	}
}
