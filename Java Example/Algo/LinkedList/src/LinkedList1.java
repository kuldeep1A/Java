public class LinkedList1 {
    Node head;
    private static int size;
    public  LinkedList1(){
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

    // Insert the element in the linked-list
    public  void insert(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        } else{
            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }

    // Display the full linked-list
    public void display(){
        if(head == null){
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Get the length of linked-list
    public int getSize(){
        return size;
    }

    public void mergedList(LinkedList1 list1, LinkedList1 list2){
        Node current1 = list1.head;
        Node current2 = list2.head;
        Node mergedHead = null;
        Node mergedTail = null;
        if(current1 == null){
            head = list2.head;
            return;
        }
        if(current2 == null){
            return;
        }

        if(current1.data <= current2.data){
            mergedHead = current1;
            mergedTail = current1;
            current1 = current1.next;
        }else{
            mergedHead = current2;
            mergedTail = current2;
            current2 = current2.next;
        }
        while(current1 != null && current2 != null){
            if(current1.data <= current2.data){
                mergedTail.next = current1;
                mergedTail = current1;
                current1 = current1.next;
            }else{
                mergedTail.next = current2;
                mergedTail = current2;
                current2 = current2.next;
            }
        }
        if(current1 != null){
            mergedTail.next = current1;
        } else{
            mergedTail.next = current2;
        }

        head = mergedHead;
    }

    public static void main(String[] args) {
        LinkedList1 list1 = new LinkedList1();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.display();

        LinkedList1 list2 = new LinkedList1();
        list2.insert(4);
        list2.insert(5);
        list2.insert(6);
        list2.display();

        LinkedList1 merged = new LinkedList1();
        merged.mergedList(list1, list2);
        System.out.print("Merged List: ");
        merged.display();
    }
}
