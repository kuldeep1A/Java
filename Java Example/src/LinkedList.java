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

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);
        System.out.print("List 1: ");
        list1.display();

        LinkedList list2 = new LinkedList();
        list2.insert(2);
        list2.insert(4);
        list2.insert(6);
        System.out.print("List 2: ");
        list2.display();

        LinkedList mergedList = new LinkedList();
        mergedList.mergeList(list1, list2);
        System.out.print("Merged List: ");
        mergedList.display();
    }
}