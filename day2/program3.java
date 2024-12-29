import java.io.*;

class Squareroot{

         
	static int Findroot(int num){

		int start = 1;

		int end = num;

		int ans = 0;

		int itr = 0;

		while(start<=end){

			itr++;

			int mid = (start+end)/2;

			int square = mid * mid;

                        if(square == num){

				System.out.print("the no of iteration is = "+itr);
				System.out.println();
                                return mid;
			}
			
			else if(square>num){

				       end = mid-1;
			}else{
				ans = mid;
			        start = mid+1;
			}

		}
            
	  System.out.print("the no of iteration to find Squareroot= "+itr);
          System.out.println();	  
	  return ans;
       }
	public static void main(String[] args)throws IOException{


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the number = ");

		int number = Integer.parseInt(br.readLine());

		int Squareroot = Findroot(number);

		System.out.println(Squareroot);

	}
}
