import java.util.*;

class ValidParenthesis{

	boolean ValidParenthesis(String str){

                  Stack s = new Stack();

		  for(int i=0;i<str.length();i++){

			  char ch = str.charAt(i);

			  if(ch =='{' || ch=='(' || ch== '['){

				  s.push(ch);
			  }else{
				 
				  if(!s.empty()){

		                          if(((char)s.peek()=='{' && ch=='}' )|| ((char)s.peek()=='(' && ch==')')||( (char)s.peek()=='[' && ch==']')){

			                        s.pop();
					  }else{
			               
						  return false;
		                            }

	                          }else{
			              return false;
				  }
                          }

		  }

			  if(s.empty())
				  return true;
			  else
				  return false;

              }
}

class Client{

	public static void main(String[] args){

		ValidParenthesis obj = new ValidParenthesis();

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		boolean ret = obj.ValidParenthesis(str);

		if(ret){
			System.out.println("balanecd");

		}else{
			System.out.println("not balanced");

		}
	}
}
