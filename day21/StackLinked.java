class Node{

	int data;

	Node next = null;

	Node(int data){
		 
		this.data = data;

	}
}

class LinkedList{

	 Node head=null;

	 void addFirst(int data){

		 Node newnode = new Node(data);

		 if(head == null){

			 head = newnode;
		 
		 }else{
			 newnode.next = head;
			 head = newnode;

		 }

	 }

	 void pop(){

		  if(head == null){

			  System.out.println("LL is empty");

		  }else{
			  System.out.println(head.data+" is popped");
			  head = head.next;

		  }

	 }

	 void peek(){

		   System.out.println(head.data);

	 }



	 void print(){


		 if(head == null){

			 System.out.println("linked list is empty");

		 }else{

		     Node temp = head;

		     System.out.print("[");

		     while(temp != null){

			 System.out.print(temp.data + "  ");
			 temp = temp.next;
		     }

		     System.out.println("]");
		}

	 }

}

class Client{

	 public static void main(String[] args){

		 LinkedList ll = new LinkedList();

		 ll.addFirst(10);
		 ll.addFirst(20);
		 ll.addFirst(30);

		 ll.print();

		 ll.pop();

		 ll.peek();

	 }
}



