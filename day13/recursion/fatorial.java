class Factorial{


	int Fact(int num){

		 if(num==0)
			 return 1;

		 return num*Fact(num-1);

	}

	public static void main(String[] args){

		Factorial obj = new Factorial();

		int ret = obj.Fact(3);

		System.out.println(ret);

	}
}
