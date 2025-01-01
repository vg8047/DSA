import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("give the size of an array");

		int size = sc.nextInt();

		int arr[] = new int[size];

		int count=0;

		int maxelement = Integer.MIN_VALUE;

		for(int i=0;i<size;i++){

			arr[i]=sc.nextInt();

		}

		for(int i=0;i<size;i++){
                                
			        if(arr[i]>maxelement){

					maxelement = arr[i];

				}

			}
		for(int i=0;i<size;i++){

			if(arr[i]<maxelement){           //time complexity = O(n)

				count++;

			}
		}

		        System.out.println("count of elements are= "+count);

	}
}
