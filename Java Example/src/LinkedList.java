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

     // Add node in the first of linked list
     public void addFirst(int data){
        Node newNode = new Node(data);
        if(Objects.equals(head, null)){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
     }

     // Add node in the last of linked list
     public void addNode(int data){
         Node newNode = new Node(data);
         if (Objects.equals(head, null)){
             head = newNode;
             return;
         }
         Node currNode = head;
         while(!Objects.equals(currNode.next, null)){
             currNode = currNode.next;
         }
         currNode.next = newNode;
     }


     // print the entire linked list
     public void print(){
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
    //Remove the element using data
    public void remove(int data){
        Node slow = head;
        Node fast = head;
        while (!Objects.equals(fast, null)){
            slow = slow.next;
            fast = fast.next.next;
        }
    }
    public static LinkedList mergeLists(LinkedList list1, LinkedList list2){
        LinkedList newList = new LinkedList();
        Node currNode1 = list1.head;
        Node currNode2 = list2.head;
        while(!Objects.equals(currNode2, null) && !Objects.equals(currNode1, null)){
            if(currNode1.data < currNode2.data){
                newList.addNode(currNode1.data);
                currNode1 = currNode1.next;
            } else {
                newList.addNode(currNode2.data);
                currNode2 = currNode2.next;
            }
        }
        while(!Objects.equals(currNode1, null)){
            newList.addNode(currNode1.data);
            currNode1 = currNode1.next;
        }
        while(!Objects.equals(currNode2, null)){
            newList.addNode(currNode2.data);
            currNode2 = currNode2.next;
        }
        return newList;
    }
    public static LinkedList sort(LinkedList list){
        LinkedList newList = new LinkedList();

    }

    public static void main(String[] args) {
        // First list
        LinkedList list1 = new LinkedList();
        list1.addFirst(1);
        list1.addNode(7);
        list1.addNode(8);
        list1.addNode(9);
        list1.addNode(5);
        list1.print();
        System.out.println(list1.getLength());

        // Second list
        LinkedList list2 = new LinkedList();
        list2.addNode(6);
        list2.addNode(2);
        list2.addNode(3);
        list2.addNode(4);
        list2.addNode(10);
        list2.print();
        System.out.println(list2.getLength());

        LinkedList merged = LinkedList.mergeLists(list1, list2);

        Node currNode = merged.head;
        while(!Objects.equals(currNode, null)){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
    }
}
