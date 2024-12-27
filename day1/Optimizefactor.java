import java.util.Scanner;

class Findfactors{

          static  int count=0;

          static int factors(int num){

		  for(int i=1;i*i<=num;i++){

			  if(num%i==0){

				  if(i == num/i)

					  count=count+1;
				  else
					  count=count+2;
			  }

		  }

		  return count;
	  }



          public static void main(String[] args){

		  Scanner sc = new Scanner(System.in);

		  System.out.print("Enter the number= ");

		  int number = sc.nextInt();

		  count=factors(number);

		  System.out.println(count);

	  }
}
