 import java.util.*;
class Twostack{

	Stack<Integer> mergeStack(Stack<Integer>s1,Stack<Integer>s2){

		Stack<Integer> s3 = new Stack<Integer>();

		while(!s1.empty() && !s2.empty()){

			if(s1.peek() >s2.peek()){

				s3.push(s1.pop());

			}else{
				s3.push(s2.pop());

			}
		}

		while(!s1.empty()){

			s3.push(s1.pop());

		}

		while(!s2.empty()){

			s3.push(s2.pop());

		}

		 while(!s3.empty()){

			 s2.push(s3.pop());

		 }

		 return s2;
	}

              
}


class Client{

	public static void main(String[] args){

             Stack<Integer> s1 = new Stack<Integer>();


	     Stack<Integer> s2 = new Stack<Integer>();

	     s1.push(1);
	     s1.push(2);
	     s1.push(4);

	     s2.push(3);
	     s2.push(8);
	     s2.push(19);

	     Twostack obj = new Twostack();

	     Stack s3 = obj.mergeStack(s1,s2);


	     System.out.println(s3);

	}
}
		
