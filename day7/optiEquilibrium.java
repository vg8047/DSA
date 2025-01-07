class Demo{

	public static void main(String[] args){

		int arr[] = new int[]{-7,1,5,2,-4,3,0};

		int temparr[] = new int[arr.length];

	        temparr[0] = arr[0];

		for(int i=1;i<arr.length;i++){

			temparr[i] = temparr[i-1]+arr[i];

		}

		int leftmax =0;
		int rightmax =0;

		int flag =0;

		for(int i=0;i<arr.length;i++){

			rightmax = temparr[arr.length-1]-temparr[i];
         
			if(leftmax == rightmax){
                                  flag =1;
				  System.out.println(i);
				  break;
				  
			}

			leftmax =temparr[i];
                  }

		 if(flag ==0)
			 System.out.println("-1");

	}
}



