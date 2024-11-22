package Collection_framework;

public class DoublyLinkedList {

    //create a head
    Node head;

    public void insert_at_start(int val){
        //crete a new node with this value
        Node node=new Node(val);

        //point this node to head , which will result in a forward linkage with the head
        node.next=head;
        //point this nodes prev to null , which will mean this is the first element in the list
        node.prev=null;
        //create a backward link from the head to the node, check if head is not null , as it will give error otherwise
        if(head!=null){
            head.prev=node;
        }
        //point head at node , making the node our new head
        head=node;
    }

    public void insert_at_last(int val){
        //create a new node
        Node node=new Node(val);

        //if head was null , we could have either done this or something like what is done after that

        //        if(head==null){
        //            insert_at_start(val);
        //            return;
        //        }

        if(head==null){
            node.prev=null;
            head=node;
            node.next=null;
            return;
        }

        //point a temp to head to reach the last index
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }

        //now temp is at the last
        node.prev=temp; //backward link for node
        node.next=null; //forward lnk for node
        temp.next=node; //forward link for temp
    }

    public void print_list(){
        //create a temp node to iterate over all the elements and not disturbing the structure by modifing the head
        Node temp=head;

        //move till temp is not null
        System.out.print("null -> ");
        while (temp!=null){

            //print temps value
            System.out.print(temp.val+" -> ");
            //move temp ahead
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void insert_at_index(int val,int index){

        //the node that is to be inserted
        Node node=new Node(val);

        //we need a temp to reach to point of insertion
        Node temp=head;

        //same inplementation for insertion at 0th index
        if(index==0){

            node.next=head;
            node.prev=null;
            head.prev=node;
            head=node;
            return;

        }

        //move till point of insertion
        for(int i=1;i<index;i++){
            temp=temp.next;
        }

        if(temp.next!=null){
            temp.next.prev=node;  //backward link from next node after insertion
        }
        node.next=temp.next;  //forward link from node to next node after insertion
        temp.next=node; //forward link from node before existing node to our node after insertion
        node.prev=temp; //backward link from our node to node before our node after insertion



    }

    public void print_list_reverse(){

        //first we need to go till the last value , then we have to move backwards
        Node temp=head;

        //we create another refernce called last , what we will do is we will move last wih temp and before we move temp
        //we will assign temp to last
        //so , for that , first create a node pointing to head, then we can iterate with our temp
        Node last=head;

        //we go till temp doesnt reach null
        while (temp!=null){

            //so basically before i move my temp , i point my last on temp
            //because when the loop ends , temp is at null but last will be at then last node
            last=temp;
            temp=temp.next;
        }

        //now we can move back
        System.out.print("null -> ");

        //since our doubly linked list starts from null , so we can move last until null is reached
        while (last!=null){
            System.out.print(last.val+" -> ");
            //move last as per prev because prev has the reference to the previous node
            last=last.prev;
        }
        System.out.print("null");
    }


    class Node{
        //now we will have relations from the front as well as back , so we will need an extra pointer
        //prev and next
        int val;
        Node next;
        Node prev;

        //create your constructors
        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
//        list.insert_at_start(2);
//        list.insert_at_start(3);
//        list.insert_at_start(5);
        list.insert_at_last(22);
        list.insert_at_last(33);
        list.insert_at_last(44);
        list.insert_at_last(55);

        list.print_list();

        list.insert_at_index(99,0);

        list.print_list();
//        list.print_list_reverse();
    }

}
