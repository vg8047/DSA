import java.util.*;
class SumofN{


	static int SumofValue(int num){

		int sum = 0;
                
		sum = (num*(num+1))/2; // gauss theorem of sum of n numbers
		
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

	
