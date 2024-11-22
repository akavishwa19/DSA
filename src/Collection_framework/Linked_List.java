package Collection_framework;

//his is the implementation of singly linked list

//we have multiple boxes pointing to each other , a loves b , b loves c , c loves d and goes like this
//every single box is called a node
//starts from head , goes till tail
//head points to the first value and tail points to the last value
//we can create a single node as a class called node and it contains 2 parts , value and a reference to whom it points, it points to another node of type node
//problem: we cant directly the index
//also we dont know how any elements are there in the list , they just know their value and the next node



public class Linked_List{

    //then we have two references to the first and the last elements of the lis called tail and head
    //head points to the first element and tail to the last
    Node head;  //if we log head or tail , it should return the node right , thats why its of type node
    Node tail;

    //something about head an tail
    //consider my list as 1 -> 2 -> 3 -> null
    //here , head is at 1
    //head.next is at 2 , head.next.next is at 3
    //head.next.next.next is at null


    //to maintain the size as well we can create a size variable
    int size;

    //constructor for which size is zero as there wont be any nodes
    public Linked_List() {
        this.size = 0;
    }

    public void insert_at_first(int val){

        //create a new node out of the value
        Node node=new Node(val);

        //point the next of this newly created node at the head;
        node.next=head;
        //now this new node is my head right , so head points the newly created node now
        head=node;

        //now if there was only one element in the list , head and tail would be pointing to each other , right?
        //so point tail to the head as they both will point to the same index
        if(tail==null){
            tail=head;
        }

        //increment the size by one as an element is added
        size++;
    }

    public void insert_at_last(int val){

        //if tail is null that is the list is empty , we can simply insert at the first index by calling the previous method and returning from it
        if(tail==null){
            insert_at_first(val);
            return;
        }
        //create the node that needs to be inserted
        Node node=new Node(val);

        //move the tails next to node
        //make node the new tail
        tail.next=node;
        tail=node;

        //increment the size
        size++;

    }

    public void insert_at_index(int val,int index){

        //if the index at which we want to insert is the first index , simply call the insert at first function and return
        if(index==0){
            insert_at_first(val);
            return;
        }
        //if index is equal to size , insert at the end and return
        if(index==size){
            insert_at_last(val);
            return;
        }
        //create a temporary node to traverse
        Node temp=head;

        //traverse till the point of insertion
        int i=1; //counter to traverse , also it is initialised as 1 because we want to reach behind the target index


        while (i<index){
            temp=temp.next;
            i++;
        }

        //create the node to be inserted
        //creting it such that , now we know temp is pointing just behind the value where insertion needs to happen
        //so our new node will come between the temp and temp.next
        //we will create our node and it will be such that it is pointing to temp.next
        //and then we will point our temp towards our node , hence temp.next points to node
        Node node=new Node(val,temp.next);
        temp.next=node;

        //increment the size
        size++;

    }

    public int delete_first(){

        //we will return which value we have deleted
        int val= head.val;

        //if there is only one element , we have to point the tail to null as it will remain pointing to the first node even after we link it out
        if(tail==head){
            tail=null;
        }

        //just move head one step ahead , so the first node is removed from the list
        head=head.next;

        //decrese the size by 1
        size--;

        return val;

    }

    public int delete_last(){

        //incase size is one , delete the first value , we may check with either head or size , we go with size as we are maintaining it
        if(size==1){
           return delete_first();
        }

        //value to be deleted
        int val= tail.val;;
        //create a temporary node to traverse till tail
        Node temp=head;

        //traverse till tail , basically point is to reach the second last element as last one will be deleted
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }

        //now temp points the second last
        //we want this temp to be our tail
        //so tail will point temp
        //and tail's next will point null

        tail=temp;
        tail.next=null;

        //decrement the size
        size--;

        //return deleted value
        return val;

    }

    public int delete_at_index(int index){
        //if its the first index value that is required to be deleted , use already existing function
        //also the same can be done for last index
        if(index==0){
            return delete_first();
        }

        if(index==size-1){
            return  delete_last();
        }

        //create a temp to reach at index previous of the deletion point pointing to head initially
        Node temp=head;

        //take temp to deletion point
        for(int i=1;i<index;i++){
            temp=temp.next;
        }

        //now temp is at previous of deletion point
        //assign deleted value in a variable to return
        int value=temp.next.val;

        //assign temp's next with the node leaving the immediate next node , so it is expelled from the list
        temp.next=temp.next.next;

        //decrement size
        size--;

        //return the deleted value
        return value;

    }

    public int get_by_index(int index){

        //create a temporary node to traerse the list
        Node temp=head;

        //reach at ith index
        for(int i=0;i<index;i++){
            temp=temp.next;
        }

        //now we are at that node which we wanted to find
        return temp.val;

    }

    public void print_list(){

        //since we cant use head to iterate over the list , we will create a temp node that points to head , hence it has all the stuff hat head had
        //if we iterate using temp , structure wont change , also head is not changing positions
        // so create a temp node
        Node temp=head;

        //iterate till temp reaches null
        while (temp!=null){

            //print temp's value
            System.out.print(temp.val+" -> ");

            //move yemp ahead by pointing temp to the next of temp
            temp=temp.next;
        }
        System.out.print("null");
    }

    static class Node {

        //it will store two values , one the actual value that it contains , and the reference to the next element , the next element is basically a node
        //since it is a node , the type that we store for next is of type as of the class
        int val;  //for value
        Node next;  //for reference

        //then we have two constructors that we can use while creating instances of the node class
        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.insert_at_first(3);
        ll.insert_at_first(5);
        ll.insert_at_first(4);
        ll.insert_at_first(1);
        ll.insert_at_first(2);

        ll.print_list();
        System.out.println();

        ll.insert_at_last(99);
        ll.insert_at_last(9);
        ll.insert_at_last(0);

        ll.print_list();
        System.out.println();

        ll.insert_at_index(101,3);

        ll.print_list();
        System.out.println();

        ll.delete_first();
        ll.delete_first();

        ll.print_list();
        System.out.println();

        ll.delete_last();
        ll.delete_last();
        ll.delete_last();
        ll.print_list();
        System.out.println();

        ll.delete_at_index(2);
        ll.print_list();
        System.out.println();

        System.out.println(ll.get_by_index(2));

    }
}
