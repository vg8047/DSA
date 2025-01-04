class Demo{

	public static void main(String[] args){

		char arr[] = new char[]{'a','b','e','g','a','g'};

	        int count = 0;

		int acount = 0;

                for(int i=0;i<arr.length;i++){

			if(arr[i] == 'a')
				acount++;
			
			else if(arr[i] == 'g')
				count+=acount;

		}
	

		System.out.println(count);

	}
}
