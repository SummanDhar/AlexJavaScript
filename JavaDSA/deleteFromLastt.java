class Node{
    int data;
    Node next;

    Node(int data , Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class deleteFromLastt {
    public Node deleteFromLast(Node head,int N){
        Node fast = head;
        Node slow =  head;
        for(int i =0;i<N;i++)
           fast = fast.next;
        
        if(fast == null)
            return head.next;
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
            Node DelNode = slow.next;
            slow.next = slow.next.next;
            DelNode = null;
            return head;
 }
    public static void printLinkedList(Node head) {
       
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
    deleteFromLastt d = new deleteFromLastt();
    int[] arr = {1,2,3,4,5};
    Node head2 = new Node(arr[0]);
    head2.next = new Node(arr[1]);
    head2.next.next = new Node(arr[2]);
    head2.next.next.next = new Node(arr[3]);
    head2.next.next.next.next = new Node(arr[4]);
    int N = 3;
     head2 = d.deleteFromLast(head2,N);
    //System.out.println(head2);
    printLinkedList(head2);
}
}