import java.util.*;
class Countvalue{


	static int CountofN(int num1,int num2){

		int count = 0;

		if(num2>=num1){

			count = num2 - num1;

		}else{
			count = num1 - num2;
		}

		return count+1;

	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int number1 = sc.nextInt();

		int number2 = sc.nextInt();

		int Count = CountofN(number1,number2);

		System.out.println("the value of count between "+number1+" and "+number2+" = "+Count);

	}
}
