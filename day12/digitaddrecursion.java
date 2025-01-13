class Demo{

      
	
      int sumofdigit(int num){

 
              if(num==0)
	           return 0;

             return num%10+sumofdigit(num/10);	      

      

  }

	public static void main(String[] args){

		Demo obj = new Demo();

		int ret = obj.sumofdigit(123);
               
		System.out.println(ret);

	}

}
