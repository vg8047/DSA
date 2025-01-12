class Demo{

	void numprint(int num){

		if(num == 0)
			return;

	         numprint(num-1);

		 System.out.println(num);

	}


	public static void main(String[] args){

                Demo obj = new Demo();

		obj.numprint(10);

	}

}
