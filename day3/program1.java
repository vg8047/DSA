import java.util.*;
class SumofN{


	static int SumofValue(int num){

		int sum = 0;

		int iteration = 0;

		for(int i=1;i<=num;i++){

                        iteration++;
			sum = sum+i;

		}

	 System.out.println("the no of iterations are = "+iteration);	
	 return sum;

	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number= ");

		int number = sc.nextInt();

		int Sumvalue = SumofValue(number);

		System.out.println("sum of value upto"+number+"= "+Sumvalue);

	}
}

	
