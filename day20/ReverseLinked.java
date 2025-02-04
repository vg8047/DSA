class Node{

	int data;
	Node next = null;

	Node(int data){

		this.data = data;

	}
}

class LinkedList{

	Node head = null;

	void addLast(int data){

		Node newnode = new Node(data);

		if(head == null){

			head = newnode;

		}else {
			Node temp = head;
			
			while(temp.next != null){

				temp = temp.next;
			}
			temp.next = newnode;
		}
	}


	void RevLinkedList(){


		if(head == null)
			return;

		 Node previous = null;
		 Node current = head;
		 Node forward = null;

		 while(current != null){

		         forward = current.next;
			 current.next = previous;
			 previous =current;
			 current = forward;
		 }

		 head= previous ;

	}

	void RecLinkedList(Node previous,Node current){

		 if(current == null){

			 head = previous;
			 return;

		 }else{
			 Node forward = current.next;
			 current.next = previous;
			 previous = current;
			 current = forward;

		 }

		 RecLinkedList(previous,current);
	}


	int Countnode(){

		Node temp = head;
		int count = 0;

		if(head == null){

			return 0;
		}

		while(temp != null){

			temp = temp.next;
			count++;

		}

		return count;

	}

	void middleNode(){

		int len = Countnode();

		Node temp = head;

		int cnt = 0;

		while(cnt<len/2){

			temp = temp.next;
			cnt++;
		}

		System.out.println(temp.data);

	}


	void middleNode2(){

		if(head == null){

			return;
		}

		Node slow = head;
		Node fast = head.next;

		while(fast != null){

			fast = fast.next;
			
			if(fast != null)
				fast = fast.next;
			
			slow = slow.next;

		}

		System.out.println(slow.data);

	}


    void printLL(){

		if(head == null){
			System.out.println("linked list is empty");

		}else{

			Node temp = head;

			while(temp != null){

				System.out.print(temp.data + "  ");
				temp = temp.next;

			}

			System.out.println();
		}
	}

}

class Client{

	public static void main(String[] args){

		LinkedList ll = new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);

		ll.printLL();

	//	ll.RevLinkedList();

		ll.printLL();

		Node previous = null;

		ll.RecLinkedList(previous,ll.head);
		ll.printLL();

		//ll.middleNode();
		  ll.middleNode2();
		

	}
}

