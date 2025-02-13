import java.util.*;
class Stack{

	int maxsize;
	int Stackarr[];
	int top = -1;

	Stack(int size){

		maxsize = size;
		Stackarr = new int[size];

	}

	void push(int data){

		if(top == maxsize -1){

			System.out.println("stack overflow");
			return;

		}else{
			top++;
		        Stackarr[top] = data;

		 }
        }

	boolean empty(){

		if(top == -1){

			return true;

		}else{
			return false;

		}
	}

	int pop(){

		if(empty()){

			System.out.println("stack is empty");
			return -1;
		}else{

			int value = Stackarr[top];
			top--;
                        return value;

		}

	}

	int peek(){

		if(empty()){

			System.out.println("stack is empty");
			return -1;

		}else{
			return Stackarr[top];
		}
	}

	int size(){

                  return top;
	}

	void printstack(){

		 System.out.print("[");

		 for(int i=0;i<=top;i++){

                          System.out.print(Stackarr[i] + " ");

		 }
		 System.out.println("]");

	}


}

class Client{

             public static void main(String[] args){

		   Scanner sc = new Scanner(System.in);

		   System.out.print("enter array size =  ");
		   
		   int size = sc.nextInt();

		   Stack s = new Stack(size);

		   char ch;

		   do{
			   System.out.println("1.push");
			   System.out.println("2.pop");
			   System.out.println("3.peek");
			   System.out.println("4.empty");
			   System.out.println("5.stack size");
			   System.out.println("6.printstack");


			   System.out.println("Enter your choice ");
			   int choice = sc.nextInt();

			   

			   switch(choice){

				   case 1:{
					   System.out.print("enter the data =  ");
					   int data = sc.nextInt();
					   s.push(data);

				           }
					   break;

			           case 2:{
				             int flag = s.pop();

					     if(flag != -1){

						      System.out.println(flag+" is popped");
				              }
				           }

					  break;

			           case 3:{
					     int  flag = s.peek();
					      if(flag != -1){

						      System.out.println(flag);

					      }
				          }
					  break;

			           case 4:{
						  if(s.empty()){
							   
							    System.out.println("stack is empty");
						  }else{
							  System.out.println("stack is not empty");

						  }
				           }

					   break;

				  case 5:{
				              
				               System.out.println("stack size is = "+(s.size()+1));
			                       break;

			                 }
		                  
		                  case 6:{
				              s.printstack();
					      break;
				         }
		               			 
			           
			          default:
					   System.out.println("wrong choice");

			   }

                           System.out.println("do you want to continue ? ");

			   ch = sc.next().charAt(0);

		  }while(ch =='y' || ch == 'Y');

	  }


}

