// Two stack using an Array

import java.util.*;

class Twostackarr{

	int stackarr[];
	int top1;
	int top2;
        int maxsize;

	Twostackarr(int size){

                  maxsize = size;
                  stackarr = new int[size];
		  top1 = -1;
		  top2 = size;
		 
         }

	 void push1(int data){

		 if(top2-top1 >1){

			 top1++;
			 stackarr[top1] = data;
		 }else{
			 System.out.println("stack overflow");

		 }
	 }

	 void push2(int data){

                 if(top2-top1 >1){

                         top2--;
                         stackarr[top2] = data;
                 }else{
                         System.out.println("stack overflow");

                 }
         }

	 int pop1(){

		 if(top1 == -1){

		          System.out.println("Stack is empty");
			  return -1;

		 }else{
			 int value = stackarr[top1];

			 top1--;

			 return value;

		 }
	 }

	 int pop2(){

                 if(top2 == maxsize){

                          System.out.println("Stack is empty");
                          return -1;

                 }else{
                         int value = stackarr[top2];

                         top2++;

                         return value;

                 }
         }

}

class Client{

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		System.out.println("enter the size of an array");

		int size = sc.nextInt();

		Twostackarr obj =new Twostackarr(size);

		char ch;

		do{
                      System.out.println("1.push1");
		      System.out.println("2.push2");
		      System.out.println("3.pop1");
		      System.out.println("4.pop2");

		      System.out.println("enter your choice");

		      int choice  = sc.nextInt();

		      switch(choice){

			      case 1:
				      {
					      System.out.println("Enter element for stack1");
					      int data = sc.nextInt();
                                              obj.push1(data);

				      }
				      break;

			       case 2:
                                      {
                                              System.out.println("Enter element for stack2");
                                              int data = sc.nextInt();
                                              obj.push2(data);

                                      }
                                      break;

				case 3:
				        {
						int ret = obj.pop1();
						if(ret != -1){

							System.out.println(ret+"popped form stack1");

						}
					}
					break;

				case 4:
                                        {
                                                int ret = obj.pop2();
                                                if(ret != -1){

                                                        System.out.println(ret+"popped form stack1");

                                                }
                                        }
                                        break;

                                default:
					System.out.println("wrong choice");
					break;
		      }

		      System.out.println("do you want to continue ?");
		      ch = sc.next().charAt(0);

		}while(ch == 'y' || ch== 'Y');

	}
}
		         


