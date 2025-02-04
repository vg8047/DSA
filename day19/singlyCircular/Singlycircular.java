class Node{

	int data;
	Node next = null;

	Node(int data){

		this.data = data;

	}

}

class CircularLinkedList{

	Node head = null;
	Node first;
	
	 void addFirst(int data){

		 Node newnode = new Node(data);

		if(head == null){

			head = newnode;
			newnode.next = newnode;
		        first = newnode;
		

		}else{
			newnode.next = head;
			head = newnode;

			Node temp = head;

			while(temp.next != first ){

				temp = temp.next;

			}

			temp.next.next = head;

			

		}

		
		
	}

	void addLast(int data){

		Node newnode = new Node(data);

		if(head == null){

			 head = newnode;
			 newnode.next = newnode;
			 first = newnode;

		}else{
		      
			Node temp = head;

			while(temp != first){

                                   temp = temp.next;
			}

			 temp.next = newnode;
			 newnode.next = head;
			 first = newnode;

		}
	}

	int  Countnode(){

		int count = 0;

		if(head == null){

			return 0;
		}else{

	               Node temp = head;
		       
		       while(temp != first){

			       count++;
			       temp = temp.next;

		       }
		}

		return count+1;

	}

		 
	void addAtpos(int pos,int data){
		 
              if(pos<=0 || pos>=Countnode()+2){
         
                        System.out.println("wrong input");

             }else if(pos == 1){
                            
                           addFirst(data);
                 
	     }else if(pos == Countnode()+1){

                         addLast(data);
             }else{
                      Node newnode = new Node(data);
                      Node temp = head;
                   
                      while(pos -2 != 0){
	        
	                      temp = temp.next;
			      pos--;
		      }
                      
		      newnode.next = temp.next;
                      temp.next = newnode;
	     }
	}


	void DelFirst(){

		   if(head == null){

			   System.out.println("Linked list is empty");
		   
		   }else if(Countnode() ==1){

			   head = null;
		   }else{
		   
		   
			    Node temp = head;

			    head = head.next;
			    
			    while(temp != first){

				    temp = temp.next;
			    }

			    temp.next = head;

		   }
	}

	void DelLast(){

		if(head == null){
			 
			System.out.println("Linked list is empty");
		
		}else if(Countnode() == 1){
                          
		            head = null;
		}else{	    
			Node temp = head;

			while(temp.next != first){

				temp = temp.next;
			}

			temp.next = head;
			first = temp;

		}
	}

	 void DelAtpos(int pos){

              if(pos<=0 || pos>=Countnode()+1){

                        System.out.println("wrong input");

             }else if(pos == 1){

                           DelFirst();

             }else if(pos == Countnode()){

                         DelLast();
             }else{
                      
                      Node temp = head;

                      while(pos -2 != 0){

                              temp = temp.next;
			      pos--;
                      }

                      temp.next = temp.next.next;
                      
             }
        }


                      		      
      void PrintCLL(){

        	 if(head == null){

		       System.out.println("CLL is empty");

	       }else{
		       Node temp = head;
		       while(temp != first){

			 System.out.print(temp.data+ " ");
			 temp = temp.next;

		        }

		       System.out.println(temp.data);
		 
	      }
        }
 }



class Client{

	public static void main(String[] args){


		CircularLinkedList cl = new CircularLinkedList();
                
	  	cl.addFirst (10);
		cl.DelFirst();
	   	cl.addFirst(20);
	   	cl.addFirst(30);
 
                cl.PrintCLL();	

	   	cl.addLast(40);

	   	cl.PrintCLL();

        	cl.addAtpos(2,15);

		cl.PrintCLL();

		cl.DelFirst();

		cl.PrintCLL();

		cl.DelLast();

		cl.PrintCLL();

		cl.DelAtpos(3);
 
        	cl.PrintCLL();
		


	}
}
