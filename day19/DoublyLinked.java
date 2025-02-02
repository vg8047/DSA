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

	dl.addfirst(20);
	dl.addfirst(30);

	dl.addLast(10);

	dl.addAtpos(3,15);

	dl.printDLL();
	
	dl.DelFirst();

	dl.printDLL();

	dl.DelLast();

	dl.printDLL();

	dl.addfirst(25);

	dl.printDLL();

	dl.DelatPos(2);

	dl.printDLL();

        }

}
