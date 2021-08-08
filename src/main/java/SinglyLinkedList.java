public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public void addLast(int nodeValue) {
        Node node = new Node(nodeValue);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addFirst(int nodeValue) {
        Node node = new Node(nodeValue);
        if(head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addAtSpecificLocation(int nodeValue, int location) {
        Node node = new Node(nodeValue);
        if(head == null) {
            head = tail = node;
        } else{
            int index = 0;
            Node current = head;

            while(index < location-1) {
                index++;
                current = current.next;
            }

            Node nextNode = current.next;
            current.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public int indexOf(int nodevalue) {
        int index = 0;
        Node current = head;
        while(current != null) {
            if(current.value == nodevalue) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public void traversingTheList() {
        if(head == null) System.out.println("The list is empty");
        Node current = head;
        for(int i=0; i<size; i++) {
            System.out.print(current.value);
            current = current.next;

            if(i != size -1) System.out.print(" => ");
        }
//        while (current != null) {
//            System.out.print(current.value);
//            current = current.next;
//            if(current != null)
//            {System.out.print(" => ");}
//        }
    }

    public void deleteFirstNode() {
        if(head == null) return; //checking if the list is empty

        //checking if there is only one node in the list
            if(head == tail) {
                head = tail = null;
                return;
            }
        head = head.next;
        size--;
    }


    public void deleteLastNode() {
        if(head == null) return; //checking if the list is empty

        if(head == tail) { //checking if there is only one item in the list
           head = tail = null;
           return;
        }

        Node current = head;

        while(current != null) { //getting the node before the last node
            if(current.next == tail) break;
            current = current.next;
        }

        tail = current;
        current.next = null;
        size--;


//        Node current = head;
//        for (int i=0; i<size-2; i++) {
//            current = current.next;
//        }
//
//        if(current == head) { //checking if there is only one item
//            head = tail = null;
//            size--;
//            return;
//        }
//
//        current.next = null;
//        tail = current;
//        size--;
    }

    public void deleteNodeFromSpecificLocation(int location) {
        if(head == null) return; //checking if the list is empty

        if(head == tail) { //checking if there is only one item in the list
            head = tail = null;
            return;
        }

        Node current = head;
        for(int i=0; i<location-2; i++) {
            current = current.next;
        }
        Node nextNode = current.next;
        current.next = nextNode.next;
        size--;
    }



    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value: " + value +
                    " next=" + next.value +
                    '}';
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addLast(2);
        singlyLinkedList.addLast(3);
        singlyLinkedList.addLast(4);
        singlyLinkedList.addLast(5);
        singlyLinkedList.addFirst(6);
        System.out.println("The index of 4 before inserting another node at location 3: " + singlyLinkedList.indexOf(4));
        singlyLinkedList.addAtSpecificLocation(7, 3);
        System.out.println("The index of 4 after inserting another node at location 3: " + singlyLinkedList.indexOf(4));
        System.out.println("The index of the newly inserted node: "+ singlyLinkedList.indexOf(7));
        singlyLinkedList.deleteFirstNode();
        singlyLinkedList.deleteLastNode();
        singlyLinkedList.traversingTheList();
        System.out.println();
        singlyLinkedList.deleteNodeFromSpecificLocation(3);
        singlyLinkedList.traversingTheList();
    }
}
