package LinkedList;



class Node {
    int data;
    Node next;

    Node(int _data , Node _next) {
        this.data = _data;
        this.next = _next;
    }

    Node(int _data) {
        this.data = _data;
        this.next = null;
    }

}

public class LLTheory {

    public static void main(String[] args) {
        int [] arr = {1,3,4,5,6};
        Node ll = new Node(arr[0]);
        Node ll1 = new Node(arr[2]);
        Node l2 = new Node(arr[0] , ll1);
        System.out.println(ll.next.data);
    }
}
