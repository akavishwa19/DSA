package Collection_framework;

public class MergeTwoSortedList {

    Node head;
    Node tail;

    public  MergeTwoSortedList merge(MergeTwoSortedList first, MergeTwoSortedList second){
        Node f=first.head;
        Node s=second.head;

        MergeTwoSortedList ans=new MergeTwoSortedList();
        while (f!=null && s!=null){
            if(f.val<s.val){
                insert_at_last(f.val);
            }
            else{
                insert_at_last(s.val);
            }
        }

        while(f!=null){
            insert_at_last(f.val);
            f=f.next;
        }

        while(s!=null){
            insert_at_last(s.val);
            s=s.next;
        }

        return ans;


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


    }

    public class Node{
        int val;
        Node next;

        public  Node(int val){
            this.val=val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        MergeTwoSortedList l1=new MergeTwoSortedList();
        MergeTwoSortedList l2=new MergeTwoSortedList();

        l1.insert_at_last(1);
        l1.insert_at_last(2);
        l1.insert_at_last(3);
        l1.insert_at_last(4);
        l1.insert_at_last(5);

        l2.insert_at_last(3);
        l2.insert_at_last(4);
        l2.insert_at_last(5);

        MergeTwoSortedList ans=l1.merge(l1,l2);
        ans.print_list();
    }

}
