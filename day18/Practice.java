class Node{

 int  data;

 Node next = null;

   Node(int data){

	   this.data = data;

   }

}

class Linkedlist{

        Node head = null;

        void addFirst(int data){

	      Node newnode = new Node(data);

		if(head == null){

			head = newnode;

		}else{

			newnode.next = head;

			head =newnode;

		}
	}

          
        void addLast(int data){


	      Node newnode = new Node(data);

	      Node temp = head;
              
              if(head == null){
	              
	                 head = newnode;
	      }else{
                 

                     while(temp.next != null){

	                     temp = temp.next;
		     }

                     temp.next = newnode;

	      }
	}	      


	int  Countnode(){

		int count = 0;

		Node temp = head;

		  if(head == null){

			  System.out.println("linkedlist is empty");

		  }else{
			  while(temp != null){

				  count++;

				  temp = temp.next;
			  }
		  }

		 return count;
	}

	void addAtpos(int pos,int data){

	

		if(pos<=0 || pos>=Countnode()+2){

			System.out.println("wrong position");
			return;

		}

		if(pos == 1){

			addFirst(data);
		
		}
	       
		if(pos == Countnode()+1){

			addLast(data);
		
		}else{

			Node newnode = new Node(data);

			Node temp  = head;

			while(pos-2 !=0){

			 temp = temp.next;
			 pos--;

			}
		

		 newnode.next = temp.next;
		 temp.next = newnode;
	     }
	}

	void delFirst(){

		if(head == null){

			System.out.println("Singly linked list is empty");

		}else if(Countnode() == 1){
			
			head = null;
		}else{
			head = head.next;

		}
	}


	void delLast(){

		if(head == null){

			System.out.println("singly linked list");

		}else if(Countnode() == 1){
			 
			head = null;
		}else{
			Node temp = head ;

			while(temp.next.next !=null){

				temp = temp.next;

			}

			temp.next = null;

		}
	}

	void delAtpos(int pos){

		if(pos<=0 || pos>=Countnode()+1){

			System.out.println("wrong input");

		}else if(pos == 1){

			delFirst();

		}else if(pos == Countnode()){

			delLast();

		}else{

			Node temp = head;
			while(pos -2 !=0){

				temp = temp.next;
				pos--;

			}

			temp.next = temp.next.next;

		}
	}


       void printsll(){

		Node temp = head;

		while(temp != null){

			System.out.print(temp.data+" ");

			temp = temp.next;

		}


		System.out.println();
	}

		
} 

class Demo{

	public static void main(String[] args){

		Linkedlist ll = new Linkedlist();

		ll.addFirst(20);
		ll.addFirst(30);

		ll.addLast(10);

		int count  = ll.Countnode();

		System.out.println(count);

		ll.printsll();

		ll.addAtpos(3,15);

		ll.printsll();

		ll.delFirst();

		ll.printsll();

		ll.delLast();

		ll.printsll();

		ll.delAtpos(2);

		ll.printsll();

	}
}


