class Demo{

	public static void main(String[] args){

		int arr[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};


		int N=arr.length;

		int start = 0;

		int y=0;

		while(N>1){



			for(int i=0;i<=N-2;i++){

				System.out.print(arr[start][y]+" , ");
				y++;

			}

			 for(int j=0;j<=N-2;j++){

                                System.out.print(arr[start][y]+" , ");
                                start++;

                        }


                         for(int k=0;k<=N-2;k++){
                                
                                System.out.print(arr[start][y]+" , ");
                                y--;
                                
                        }       
                                                                                                                                                             
                        
                         for(int L=0;L<=N-2;L++){
                                
                                System.out.print(arr[start][y]+" , ");
                                start--;
                                
                        }       
                                                                                                                                                             
                         start++;
                         y++;
			 N=N-2;

	}

	 if(N==1){

		  System.out.println(arr[start][y]);
	 }

	}
}

