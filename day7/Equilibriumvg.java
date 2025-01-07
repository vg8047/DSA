class Demo{

	public static void main(String[] args){

		int arr[] = new int[]{-7,1,5,2,-4,3,0};

		int flag = 0;
                 
		int leftsum = 0;

		for(int i=0;i<arr.length;i++){
                      
			int rightsum =0;

			for(int j=i+1;j<arr.length;j++){

				 rightsum = rightsum + arr[j];

			}

		    if(leftsum == rightsum){

			    flag = 1;

			    System.out.println(i);
			    break;

		    }

		    leftsum = leftsum+arr[i];

		}

		    if(flag==0){

			    System.out.println("-1");

		    

		}
	}
}



