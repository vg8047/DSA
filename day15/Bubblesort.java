class Bubblesort{

	public static void main(String[] args){

		int arr[] = new int[]{2,3,4,5,8,7};

		int count =0;

		for(int i=0;i<arr.length;i++){

			boolean issort = false;

			for(int j=0;j<arr.length-i-1;j++){

				count++;

				if(arr[j]>arr[j+1]){

					issort = true;

					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;

				}

			}

			if(issort==false)
				break;
		}

	         System.out.println(count);

		for(int i=0;i<arr.length;i++){

			System.out.println(arr[i]);

		}

	}
}
