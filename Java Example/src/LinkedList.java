import java.util.Objects;

public class LinkedList {
    Node head;
    private static int size;
    public LinkedList(){
        this.head = null;
        size = 0;
    }
    public static class Node{
         int data;
         Node next;
         public Node(int data){
             this.data = data;
             this.next = null;
             size++;
         }
     }

     // Add node in the last of linked list
     public void insert(int data){
         Node newNode = new Node(data);
         if (Objects.equals(head, null)){
             head = newNode;
             return;
         } else {
             Node currNode = head;
             while(!Objects.equals(currNode.next, null)){
                 currNode = currNode.next;
             }
             currNode.next = newNode;
         }
     }


     // print the entire linked list
     public void display(){
        if(Objects.equals(head, null)){
            return;
        }
        Node currNode = head;
        while(!Objects.equals(currNode, null)){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
         System.out.println("null");
     }

     // Access the length of linked list
    public int getLength(){
        return size;
    }
    public void mergeList(LinkedList list1, LinkedList list2) {
        Node current1 = list1.head;
        Node current2 = list2.head;
        Node mergedHead = null;
        Node mergedTail = null;

        if (current1 == null) {
            head = list2.head;
            return;
        }
        if (current2 == null) {
            return;
        }

        if (current1.data <= current2.data) {
            mergedHead = current1;
            mergedTail = current1;
            current1 = current1.next;
        } else {
            mergedHead = current2;
            mergedTail = current2;
            current2 = current2.next;
        }

        while (current1 != null && current2 != null) {
            if (current1.data <= current2.data) {
                mergedTail.next = current1;
                mergedTail = current1;
                current1 = current1.next;
            } else {
                mergedTail.next = current2;
                mergedTail = current2;
                current2 = current2.next;
            }
        }

        if (current1 != null) {
            mergedTail.next = current1;
        } else {
            mergedTail.next = current2;
        }

        head = mergedHead;
    }

    public void sort(){
        head = mergeSort(head);
    }

    private Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node Middle = getMiddle(head);
        Node nextToMiddle = Middle.next;
        Middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextToMiddle);

        return merge(left, right);
    }

    private Node getMiddle(Node head){
        if(head == null)
            return null;

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node left, Node right){
        Node sorted = null;

        if(left == null)
            return right;
        if (right == null)
            return left;
        if (left.data <= right.data){
            sorted = left;
            sorted.next = merge(left.next, right);
        } else {
            sorted = right;
            sorted.next = merge(left, right.next);
        }

        return sorted;
    }
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insert(4);
        list1.insert(1);
        list1.insert(6);
        System.out.print("List 1: ");
        list1.display();

        LinkedList list2 = new LinkedList();
        list2.insert(2);
        list2.insert(3);
        list2.insert(5);
        System.out.print("List 2: ");
        list2.display();

        LinkedList merge = new LinkedList();
        merge.mergeList(list1, list2);
        System.out.print("Merged List: ");
        merge.display();
        System.out.print("Sorted List: ");
        merge.sort();
        merge.display();
    }
}