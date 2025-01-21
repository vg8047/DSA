class Stringreverse{

	static String Strreverse(String name){

		  if(name==null || name.length()<=1)
			  return name;

		  return  Strreverse(name.substring(1))+name.charAt(0);

	}

	public static void main(String[] args){

		String str=Strreverse("core2web");
                
		System.out.println(str);
	}

}
