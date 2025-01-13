class Demo{

	int sumofN(int num){

		if(num==0)
			return 0;

		return num+sumofN(--num);

	}

	

	public static void main(String[] args){

		Demo obj = new Demo();;

		int ret = obj.sumofN(5);

		System.out.println(ret);

	}
}
