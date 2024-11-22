package Collection_framework;

public class CircularLinkedList {

    Node head;
    Node tail;
    int size;

    public void insert_after_tail(int val){
        //node to be inserted
        Node node=new Node(val);

        //if list is empty , node is the new head and tail , then return
        if(head==null){
            head=node;
            tail=node;
            node.next=head; // this is beacuse we want to ensure
            size++;
            return;
        }


        tail.next=node; //reference tail to the node
        node.next=head; //reference node to the head
        tail=node;      //assign node the tail

        size++;

    }

    public void print_list(){

        //edge caees
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        //create a temp node to iterate over the list
        Node temp=head;

        System.out.print(" * ");

        //do while loop because we want it to run atleast once
        do {
            System.out.print(temp.val +" -> ");
            temp=temp.next;
        }
        while ((temp !=head));
        System.out.print(" * ");
    }

    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list=new CircularLinkedList();
        list.insert_after_tail(6);
        list.insert_after_tail(7);
        list.insert_after_tail(8);
        list.insert_after_tail(9);
        list.insert_after_tail(10);

        list.print_list();

    }

}
