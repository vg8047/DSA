class Demo{

	int sum=0;

	int sumofN(int num){

		if(num==0)
			return 1;

		sum=sum+num;
		
		sumofN(--num);

		return sum;

	}

	

	public static void main(String[] args){

		Demo obj = new Demo();;

		int ret = obj.sumofN(5);

		System.out.println(ret);

	}
}
