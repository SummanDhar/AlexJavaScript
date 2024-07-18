class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        data = data1;
        next = next1;
    }
    Node(int data1){
        data = data1;
        next = null;
    }
    }
    
     /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class addtwolinkexnumber {
    public Node addTwoNumbers(Node l1, Node l2) {
    Node dummyNode =new Node(-1);
    Node temp = dummyNode;
    int carry = 0;
    while(l1 != null || l2 != null || carry == 1){
        int sum = 0;
        if(l1 != null){
            sum += l1.data;
            l1 = l1.next;
        }
        if(l2 != null){
            sum += l2.data;
            l2 = l2.next;
        }
        sum += carry;
        carry = sum/10;
        Node node = new Node(sum%10);
        temp.next = node;
        temp = temp.next;
    }
    return dummyNode.next;
}

         // Function to print the linked list
         public static void printLinkedList(Node head) {
           
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            addtwolinkexnumber m = new addtwolinkexnumber();
            //reverseLinkedList r = new reverseLinkedList();
            // Create a linked list with values 1, 3, 2, and 4
            Node head1 = new Node(2);
            head1.next = new Node(4);
            head1.next.next = new Node(3);
           // head1.next.next.next = new Node(4);
    
            Node head2 = new Node(5);
            head2.next = new Node(6);
            head2.next.next = new Node(7);
            head2.next.next.next = new Node(9);
    
            // Print the original linked list
            System.out.print("Original Linked List: ");
            printLinkedList(head1);
    
            
            System.out.print("Original Linked List: ");
            printLinkedList(head2);
    
    
            // Reverse the linked list
          Node merge = m.addTwoNumbers(head1,head2);
    
            // Print the reversed linked list
            System.out.print("merged Linked List: ");
            printLinkedList(merge);
        }
    
    }
    