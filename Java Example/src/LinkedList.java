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

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // list
        list.addFirst(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        //print
        list.print();
        //length
        System.out.println(list.getLength());
    }

}
