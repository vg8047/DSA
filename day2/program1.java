class Squareroot{


	static int Findroot(int num){

		int value = 0;

		for(int i=1;i<=num;i++){

			if(i*i==num)                    //this code have more iteration because it checks until the number so it is not efficient
				value = i;
		}

		return value;

	}
        

	public static void main(String[] args){

		 int number = 100;

		 int squareroot = Findroot(number);

		 System.out.println(squareroot);

	}
}
