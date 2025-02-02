import java.util.*;
class Node{

	int data;
	Node previous = null;
	Node next = null;

	Node(int data){

		this.data = data;

	}
}


class DoublyLinked{
             
	Node head = null;

	void addfirst(int data){

		Node newnode = new Node(data);

		if(head == null){

			head = newnode;

		}else{
			newnode.next = head;
			head.previous = newnode;
			head = newnode;

		}
	}


	void addLast(int data){

		Node newnode = new Node(data);

		if(head == null){

			 head = newnode;

		}else{
			Node temp = head;

			while(temp.next != null){

				temp = temp.next;

			}

                        temp.next = newnode;
			newnode.previous = temp;

		}
	}

	 int  Countnode(){
                        
		        int count = 0;

			if(head == null){

				return count;
			}else{
		
                              Node temp = head;

	        	     while(temp != null){
 
			            count++;

			            temp = temp.next;
			     }
		       }
	 return count;
	}
	

	void addAtpos(int pos,int data){

		if(pos<=0 || pos>=Countnode()+2){

			 System.out.println("wrong input ");
			 return;

		}
	       
		if(pos ==1){

			      addfirst(data);
		}
	       	if(pos == Countnode()+1){

			addLast(data);

		}else{

			Node newnode = new Node(data);
			Node temp = head;

			while(pos-2 != 0){

				temp = temp.next;
				pos--;

			}

			 newnode.previous = temp;
			 newnode.next = temp.next;
			 temp.next = newnode;
			 newnode.next.previous = newnode;
			 
			

		}
	}


	void DelFirst(){

		 if(head == null){

			 System.out.println("Linked list is empty");

		 }else if(Countnode() == 1){

			 head = null;
		 }else{
		 
		 
			 head = head.next;
			 head.next.previous = null;
		 }
	}


	void DelLast(){

		if(head == null){

			System.out.println("Linked list is empty");

		}else if(Countnode() == 1){

			head = null;

		}else{
			Node temp = head;

			while(temp.next !=null){

				temp = temp.next;
			}

			temp.previous.next = null;
			temp.previous = null;             // not compulsory in java but for safer side there should not be any link to node

		}
	}


	void DelatPos(int pos){

		if(pos<=0 || pos>=Countnode()+1){

			System.out.println("wrong input");
		
		}else if(pos == 1){

			DelFirst();
		
		}else if(pos == Countnode()){

			DelLast();
		}else{

			Node temp = head;

			while(pos-2 != 0){

				temp = temp.next;
				pos--;
			}

			temp.next = temp.next.next;
			temp.next.previous = temp;

		/*	 (or)
		 *	temp.next.next.previous = temp;
			temp.next = temp.next.next;         
			*/

		}
	}



	void printDLL(){

		if(head == null){

			System.out.println("linked list is empty");

		}else{
 
   		   Node temp = head;

	        	while(temp.next  != null){

			System.out.print(temp.data+"->");
			temp = temp.next;

		  }

		  System.out.print(temp.data);

	       }

		 System.out.println();
	}

}
	 

class Main{

	public static void main(String[] args){

	DoublyLinked dl = new DoublyLinked();

	char ch;

	Scanner sc = new Scanner(System.in);

	do{

		System.out.println("Doubly linked list");
		System.out.println("1.addfirst");
		System.out.println("2.addLast");
		System.out.println("3.addAtpos");
		System.out.println("4.DelFirst");
		System.out.println("5.Dellast");
		System.out.println("6.DelatPos");
		System.out.println("7.countnode");
		System.out.println("8.PrintDLL");
		

		System.out.println("Enter your choice");
		int choice = sc.nextInt();

		switch(choice){

			case 1:
				System.out.println("Enter data");
				int data = sc.nextInt();
				dl.addfirst(data);
				break;
			
			case 2:
				System.out.println("enter data");
			        data = sc.nextInt();
				dl.addLast(data);
				break;

			case 3:
				System.out.println("enter position");
				int position = sc.nextInt();
				System.out.println("enter data");
				 data = sc.nextInt();
				dl.addAtpos(position,data);
				break;
			
			case 4:
				dl.DelFirst();
				break;
			
			case 5:
				dl.DelLast();
				break;
			
			case 6:
				System.out.println("enter position you want to delete");
				int pos = sc.nextInt();
				dl.DelatPos(pos);
				break;

			case 7:
				System.out.println("the no of node = "+dl.Countnode());
				break;
			
			case 8:
				dl.printDLL();
				break;

			default:
				System.out.println("please enter valid num by seeing menu");

		}




		       
		System.out.println("do you want to continue ?");
		ch = sc.next().charAt(0);

	}while(ch=='Y' || ch == 'y');


        }

}
