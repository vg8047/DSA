class Demo{

            void print(int num){

		if(num<=1)
			return;

		 print(num-2);

		 System.out.println(num);

		 print(num-1);

	}

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.print(5);

	}

}
