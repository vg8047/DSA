class Demo{

	public static void main(String[] args){

		int arr[] = new int[]{1,2,3,4,5};

		int rightshift = 2;

		int temparr[] = new int[arr.length];

		int shift = 2;

		for(int i=0;i<shift;i++){

			temparr[i] = arr[arr.length-shift+i];

		}

		for(int i=shift;i<arr.length;i++){

			temparr[i] = arr[i-shift];

		}

		for(int i=0;i<temparr.length;i++){

			System.out.println(temparr[i]);
		}


	}
}
