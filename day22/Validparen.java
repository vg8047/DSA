import java.util.*; 
class Parenthesis{


	boolean validparenthesis(String str){

		Stack<Character> s = new Stack<Character>();

		for(int i=0;i<str.length();i++){

			char ch = str.charAt(i);

			if(ch == '{' || ch=='(' || ch=='['){

				s.push(ch);
			}else{
				if(!s.empty()){

                                   
					if(((char)s.peek()=='('&& ch==')') || ((char)s.peek()=='{'&& ch == '}' )|| ((char)s.peek() =='[' && ch==']')){

					         s.pop();
					}else{
						return false;

					}

				}
				else{
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


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the expression");

		String str = sc.next();

		Parenthesis obj = new Parenthesis();
		boolean ret = obj.validparenthesis(str);

                 
		if(ret){

			System.out.println("Balanced");
		}else{
			System.out.println("not balanced");

		}
	}
}
