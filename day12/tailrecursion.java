class Demo{

	int fun(int num){

		if(num==0)
			return 1;

		System.out.println(num);

		fun(--num);
	   
		return 0;	

	}

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.fun(5);

	}
}
