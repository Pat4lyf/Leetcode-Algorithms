public class CircularSinglyLinkedLIst {

    private Node head;
    private Node tail;
    private int size;



    public void addFirst(int nodeValue) {
        Node node = new Node(nodeValue);

        if(head == null) { //checking if the list is empty
            node.next = node;
            head = tail = node;
        } else {
            node.next = head;
            head = node;
            tail.next = node;
        }
        size++;
        System.out.println("This is the result that shows where a node is inserted at the head");
        System.out.println("head " + head.value);
        System.out.println("head next " + head.next.value);
        System.out.println("tail " + tail.value);
        System.out.println("tail next " + tail.next.value);
    }


    public void addLast(int nodeValue) {
        Node node1 = new Node(nodeValue);
        if(head == null) { //
            node1.next = node1;
            head = tail = node1;
        } else {
            tail.next = node1;
            tail = node1;
            node1.next = head;
        }
        size++;
        System.out.println("This is the result that shows where a node is inserted at the tail");
        System.out.println("head " + head.value);
        System.out.println("head.next " + head.next.value);
        System.out.println("tail " + tail.value);
        System.out.println("tail.next " + tail.next.value);
    }

    public void insertAtSpecificPosition(int nodeValue, int location) {
        Node newNode = new Node(nodeValue);
        if(location == 0) addFirst(nodeValue);
        else if(location >= size) addLast(nodeValue);
        else {
            Node current = head;
            for(int i=0; i<location-1; i++) {
                current = current.next;
            }
            Node nextNode = current.next;
            current.next = newNode;
            newNode.next = nextNode;

            size++;
            System.out.println("Inserted at a specific location");
            System.out.println("NewNode.next " + nextNode.value);
        }
    }

    public void traversingTheList() {
        if(head == null) {
            System.out.println("The list is empty");
        } else {
            Node current = head;
            for(int i=0; i<size; i++) {
                System.out.print(current.value);
                if(i != size-1) {
                    System.out.print("=>");
                }
                current = current.next;
            }
        }

    }

    public void deleteNode(int location) {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node current = head;

        if(location == 0) { //checking if the location is the first node
            if(current.next == current) { //checking if there is only one item
                head = tail = null;
                current.next = null;
                size--;
            } else {
                Node firstNode = head.next;
                current.next = firstNode;
                head = firstNode;
                tail.next = firstNode;
                size--;
            }
        } else if(location >= size) { //checking if the location is the last node
            if(current.next == current) { //checking if there is only one item
                head = tail = null;
                current.next = null;
                size--;
            } else {
                while(current != null) {
                    if(current.next == tail) break;
                    current = current.next;
                }
                current.next = head;
                tail = current;
            }
        } else {
            for (int i=0; i<location-1; i++){
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }
    }



    private class Node {
        private int value;
        private Node next;

        public Node(int nodeValue) {
            this.value = nodeValue;
        }
    }


    public static void main(String[] args) {
        CircularSinglyLinkedLIst circularSinglyLinkedLIst = new CircularSinglyLinkedLIst();
        circularSinglyLinkedLIst.addFirst(8);
        System.out.println();
        circularSinglyLinkedLIst.addFirst(4);
        System.out.println();
        circularSinglyLinkedLIst.addFirst(2);
        System.out.println();
        circularSinglyLinkedLIst.addLast(9);
        System.out.println();
        circularSinglyLinkedLIst.insertAtSpecificPosition(10, 1);
        circularSinglyLinkedLIst.traversingTheList();
        circularSinglyLinkedLIst.deleteNode(3);
        System.out.println();
        circularSinglyLinkedLIst.traversingTheList();

    }
}
