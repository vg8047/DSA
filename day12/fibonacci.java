class Demo{

	int fibonacci(int num){

		if(num<=1)
			return 1;

		return fibonacci(num-2)+fibonacci(num-1);

	}

	public static void main(String[] args){

		Demo obj = new Demo();

		int ret=obj.fibonacci(5);

		System.out.println(ret);

	}

}
