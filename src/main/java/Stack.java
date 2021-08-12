/**
 * This stack is created using linked list
 */
public class Stack {
    private Node head;
    private Node tail;
    private int size;

    public Stack() {
        this.head = this.tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int nodeValue) {
        Node node = new Node(nodeValue);

       if (isEmpty()) {
           head = tail = node;
       } else {
           node.next = head;
           head = node;
       }
       size++;
        System.out.println("HEAD " + head.value);
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            Node formerHead = head;
            head = head.next;
            size--;
            System.out.printf("The last node having a value of %s has been removed", formerHead.value);
        }

    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            return head.value;
        }
    }

    public void delete() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            head = tail = null;
            size = 0;
            System.out.println("The stack has been deleted");
        }
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println();
        stack.pop();
        System.out.println();
        System.out.println(stack.peek());
        stack.delete();
        System.out.println(stack.isEmpty());
    }
}
