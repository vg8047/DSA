//Reverse string using stack

import java.util.*;
class RevStringstack{

	String revString(String str){

		Stack<Character> s = new Stack<Character>();

		char arr[] = new char[str.length()];

		for(int i=0;i<str.length();i++){

			 s.push(str.charAt(i));

		}

		int i = 0;

		while(!s.empty()){

			arr[i] = s.pop();
			i++;

		}

		return new String(arr);

           }

}

class Client{

	public static void main(String[] args){
 
		 Scanner sc = new Scanner(System.in);

		 System.out.println("Enter string to reverse");

		 String str = sc.next();

		 RevStringstack obj = new RevStringstack();

		 String rev = obj.revString(str);

		 System.out.println(rev);

	}
}



