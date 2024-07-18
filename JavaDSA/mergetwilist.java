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

 class mergetwilist {
    public Node mergeTwoList(Node list1 , Node list2){
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        while(list1 != null && list2 != null){
            if(list1.data <= list2.data){
                temp.next = list1;
               list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 != null){
            temp.next = list1;
        }
       else{
            temp.next = list2;
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
        mergetwilist m = new mergetwilist();
        //reverseLinkedList r = new reverseLinkedList();
        // Create a linked list with values 1, 3, 2, and 4
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head1);

        
        System.out.print("Original Linked List: ");
        printLinkedList(head2);


        // Reverse the linked list
      Node merge = m.mergeTwoList(head1,head2);

        // Print the reversed linked list
        System.out.print("merged Linked List: ");
        printLinkedList(merge);
    }

}
