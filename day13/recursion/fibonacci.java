class Fibonacci{

	static int fibo(int num){

		int a=0,b=1;
       
		int c=0;

		for(int i=0;i<num-2;i++){

			c = a+b;

			a=b;
			b=c;

		}

		return c;

	}

	public static void main(String[] args){

		int ret=fibo(4);

		System.out.println(ret);

	}

}
