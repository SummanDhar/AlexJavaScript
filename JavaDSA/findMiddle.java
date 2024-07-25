
//     class Node{
//     int data;
//     Node next;

//     Node(int data , Node next){
//         this.data = data;
//         this.next = next;
//     }
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
// public class findMiddle {
//  public Node findMiddleElement(Node head){
    
//     Node slow = head;
//     Node fast = head;
//     while(fast != null && fast.next != null && slow!=null)
//     fast = fast.next.next;
//     slow = slow.next;
//     return slow;
// }
    

// public static void main(String[] args) {
//     findMiddle f = new findMiddle();
//     //reverseLinkedList r = new reverseLinkedList();
//     // Create a linked list with values 1, 3, 2, and 4
//     Node head = new Node(1);
//     head.next = new Node(3);
//     head.next.next = new Node(2);
//     head.next.next.next = new Node(4);
//     Node middleNode = f.findMiddleElement(head);
//     System.out.println(middleNode.data);
// }
// }
