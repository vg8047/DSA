import java.util.*;

class Findfactors{



	static int factors(int num){

		int count=0;

		for(int i=1;i<=Math.sqrt(num);i++){

			if(num%i==0){

	                       if(i==num/i)

				       count = count+1;
			       else
				       count = count+2;
			}

		}

		return count;

	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number=");

		int number = sc.nextInt();

		int count = factors(number);

		System.out.println(count);

		}
}
