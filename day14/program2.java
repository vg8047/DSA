class Demo{

	 int fun(int num){

		 if(num<=0)
			 return 2;

		 int ans1=fun(num-1)+fun(num-2);

		 int ans2=fun(num-2)+fun(num-1);

		 return ans1+ans2;

	 }

	public static void main(String[] args){

		Demo obj = new Demo();

		int ret=obj.fun(2);
                
		System.out.println(ret);


	}
}

