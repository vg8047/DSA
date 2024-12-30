import java.util.*;
class Countvalue{


	static int CountofN(int num1,int num2){

		int count = 0;

		for(int i= num1;i<=num2;i++){

			count++;

		}

		return count;

	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int number1 = sc.nextInt();

		int number2 = sc.nextInt();

		int Count = CountofN(number1,number2);

		System.out.println("the value of count between "+number1+" and "+number2+" = "+Count);

	}
}
