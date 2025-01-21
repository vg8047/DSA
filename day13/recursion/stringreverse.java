class Demo{

	static void Strreverse(String name){

		char chararr[] = name.toCharArray();

		int start = 0;

		int end = chararr.length-1;

		while(start<end){

			char temp = chararr[start];

			chararr[start]=chararr[end];

			chararr[end] = temp;

			start++;
			end--;

		}

		System.out.println(chararr);

		
	}

	public static void main(String[] args){


	          Demo obj = new Demo();

		  String str = new String("core2web");

		  Strreverse(str);

	}

}

