import java.util.*;
class Squareroot{



	static int Findroot(int num){

		int value = 0;

		for(int i=1;i<=num;i++){

			if(i*i <= num)         // these code is less iterate than previous because it  breaks on getting the correct value
				value=i;
			else
				break;

		}

		return value;
	}


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number = ");

		int number = sc.nextInt();

		int squareroot = Findroot(number);

		System.out.println(squareroot);

	}
}
