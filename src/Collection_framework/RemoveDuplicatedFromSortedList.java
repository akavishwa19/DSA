package Collection_framework;

public class RemoveDuplicatedFromSortedList {

    Node head;

    public void deleteDuplicates(){

        if(head==null){
            return;
        }

        Node temp=head;
        while (temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
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

    }
}
