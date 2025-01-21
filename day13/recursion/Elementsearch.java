import java.util.*;
class Linearsearch{

            static void Arrayprint(int arr[],int num){

		    boolean flag = false;

		 for(int i=0;i<arr.length;i++){

			  if(arr[i]==num){

				  System.out.print("the num found at index="+i);
				  flag=true;

			  }
                   }

		   if(flag == false){
			   System.out.println("Element not found");

		   }
	 }

	public static void main(String[] args){

		int arr[] = new int[5];

		Scanner sc= new Scanner(System.in);

		for(int i=0;i<arr.length;i++){

			arr[i] = sc.nextInt();

		}

		Arrayprint(arr,20);

	}

}
