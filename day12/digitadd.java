class Demo{

      int sum = 0;
	
      void sumofdigit(int num){

	    while(num>0){
		
		sum=sum+num%10;

		num=num/10;

      }

      System.out.println(sum);

  }

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.sumofdigit(123);

	}

}
