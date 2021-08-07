public class SinglyLinkedList {
    private Node head;
    private Node tail;

    public void addLast(int nodeValue) {
        Node node = new Node(nodeValue);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void addFirst(int nodeValue) {
        Node node = new Node(nodeValue);
        if(head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
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


    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addLast(2);
        singlyLinkedList.addLast(3);
        singlyLinkedList.addLast(4);
        singlyLinkedList.addLast(5);
        singlyLinkedList.addFirst(6);
        System.out.println(singlyLinkedList.indexOf(5));
    }
}
