class Node{

	 int data ;
        
	 Node next = null;
	 
         Node(int data){

                this.data = data;
		

	 }
}

class Linkedlist{

        Node head = null;

         void addFirst(int data){

               Node newNode = new Node(data);

	       if(head ==null){

		       head = newNode;

              }else{
		      newNode.next = head;
		      head = newNode;
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

		 }
	 }

	   int  Countnode(){

		  int count = 0;

		  Node temp = head;

		  while(temp != null){

			  count++;
			  
			  temp = temp.next;

		  }

             return count;
	   }


          void addAtpos(int pos,int data){

		  if(pos <=0 || pos >=Countnode()+2){

			  System.out.println("wrong input");
                          return;
		  }


		  if(pos == 1){

			  addFirst(data);

		  }else if(pos == Countnode()+1){

			  addLast(data);

		  }else{

		  Node newnode = new Node(data);

		  Node temp = head;

		  while(pos-2 != 0){

			  temp =  temp.next;
			  pos--;
		  }

		  newnode.next = temp.next;
		  temp.next = newnode;

		  }

	  }


	  void delFirst(){

		  if(head == null){

			  System.out.println("the linked list is empty");

		  }else if(Countnode() == 1){

			     head = null;
		  }else{

			  head = head.next;
		  }
	  }


	  void delLast(){

		  if(head == null){

			  System.out.println("linked list is empty");

		  }else if(Countnode() == 1){

			  head = null;

		  }else{
			  Node temp = head;

			  while(temp.next.next != null){

				  temp = temp.next;

			  }

			  temp.next = null;
		  }
	  }
        

	  void delAtpos(int pos){


                 if(pos <=0 || pos >=Countnode()+1){

                          System.out.println("wrong input");
                          return;
                  }


                  if(pos == 1){

                          delFirst();

                  }else if(pos == Countnode()){

                          delLast();

                  }else{

                 

                  Node temp = head;

                  while(pos-2 != 0){

                          temp =  temp.next;
                          pos--;
                  }

                  temp.next = temp.next.next;

                  }
	  }



	 void printsLL(){


		 if(head == null){
			   
			 System.out.println("the linked list is empty");
		 }else{
			 Node  temp = head;

			 while(temp !=null){

				  System.out.print(temp.data+" ");
				  temp = temp.next;

			 }

			
		 }

		 System.out.println();
	 }
	      
}



class Main{

	 public static void main(String[] args){

		  Linkedlist ll = new Linkedlist();
                  
                  ll.addFirst(10);
		  ll.addFirst(20);
		  ll.addFirst(30);

		  ll.printsLL();

		 

		  ll.addLast(15);
		  ll.printsLL();
                   
		  ll.addAtpos(3,25);
		  ll.printsLL();

		  ll.delFirst();
		  ll.printsLL();

		  ll.delLast();
		  ll.printsLL();

		  ll.delAtpos(2);
		  ll.printsLL();

                 }

  }	 
