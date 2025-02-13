import java.util.*;

class Queue{
 
	int Queuearr[];
	int front;
	int rear;
	int maxsize;

	Queue(int size){

		Queuearr = new int[size];
		front = -1;
		rear = -1;
		maxsize = size;

	}

	void enqueue(int data){

		 if(rear == maxsize-1){
			 System.out.println("queue is full");
			 return;
		 }

		 if(front == -1){
			 front=rear=0;
                 }else{
			 rear++;

		 }

		 Queuearr[rear] = data;

	}

	 int dequeue(){

		  if(front == -1){
			    
			  System.out.println("Queue is empty");
			  return -1;
		  }else{
			  int ret = Queuearr[front];

			  front++;

			  if(front > rear)
				  front = rear = -1;
			  
			  return ret;
		  }
	 }

	 boolean empty(){
                     
		 if(front == -1)
			 return true;
		 else
			 return false;
	 }

	 int front(){

		  if(front == -1)
			   return -1;
		  else
			  return Queuearr[front];
	 }

         int rear(){

		 if(rear == -1)
			 return -1;
		 else
			 return Queuearr[rear];

	 }

         void printqueue(){

		 if(front == -1){

			 System.out.println("Queue is empty");
			 return ;
		 }else{

		     for(int i=front;i<=rear;i++){

			  System.out.println(Queuearr[i]+" ");
		     }
		 }

		 System.out.println();
	 }
 

}

class Client{

	public static void main(String[] args){
                   
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array size");
		
		int size = sc.nextInt();

		Queue q = new Queue(size);

		char ch;

		do{
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.empty");
			System.out.println("4.front");
			System.out.println("5.rear");
			System.out.println("6.printQueue");
			
			
			System.out.println("Enter your choice");

			int choice = sc.nextInt();

			switch(choice){

				case 1:{
                                          System.out.println("Enter the data");
				          int data = sc.nextInt();
				          q.enqueue(data);	  
				       }
				       break;

			        case 2:{
					   int flag = q.dequeue();
					   if(flag != -1)
						   System.out.println(flag+" is popped");
				       }
				       break;

			        case 3:{
				         if(q.empty())
						 System.out.println("Queue is empty");
					 else
						 System.out.println("Queue is not empty");
                                        }
				       break;

				case 4:{
				         int ret = q.front();
					 if(ret != -1)
						 System.out.println(ret);
					 else
						 System.out.println("Queue is empty");
                                        }
				        break;
				
				case 5:{
					int ret = q.rear();
					if(ret != -1)
						System.out.println(ret);
					else
						 System.out.println("Queue is empty");
                                       }
				       break;

				 case 6:
				         q.printqueue();
					 break;

				 default:
				          System.out.println("wrong choice");
					  break;
			 }

			System.out.println("Do you want to continue ?");

			ch = sc.next().charAt(0);

		}while(ch == 'Y' || ch == 'y');



	}
}
