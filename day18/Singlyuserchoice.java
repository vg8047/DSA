import java.util.*;
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
                  
                  char ch;

		  do{
			  System.out.println("singly linkedlist");
			  System.out.println("1.addFirst");
			  System.out.println("2.addLast");
                          System.out.println("3.addAtpos");
                          System.out.println("4.delFirst");
                          System.out.println("5.delLast");
                          System.out.println("6.delAtpos");
                          System.out.println("7.countnode");
                          System.out.println("8.printsll");
                          System.out.println("Enter your choice");

		          Scanner sc = new Scanner(System.in);

		          int choice = sc.nextInt();

				 switch(choice){

					  case 1: {

						  System.out.println("Enter data");
						  int data = sc.nextInt();
						  ll.addFirst(data);
				     

                                                  }

						  break;
	                                case 2: {

                                                  System.out.println("Enter data");
                                                  int data = sc.nextInt();
                                                  ll.addLast(data);


                                                  }

                                                  break;
                                      
		                       case 3: {

                                                  System.out.println("Enter data");
                                                  int data = sc.nextInt();

						  System.out.println("Enter pos no");
						  int pos = sc.nextInt();
                                                  ll.addAtpos(pos,data);


                                                  }

                                                  break;
                                      
	                             case 4:
						  ll.delFirst();
						  break;
                                     case 5:
						  ll.delLast();
						  break;


				    case 6: {

                                                  System.out.println("Enter pos");
                                                  int pos= sc.nextInt();
                                                  ll.addFirst(pos);


                                             }

                                             break;

		                    case 7:
					    System.out.println( ll.Countnode());
					     break;
			            case 8:
					   ll.printsLL(); 
					   break;
					     

			            default :

					     System.out.println("wrong choice");


				 }

				 System.out.println("continue?");
				 ch = sc.next().charAt(0);

		 }while(ch == 'Y' || ch == 'y');

	 }


}	 
