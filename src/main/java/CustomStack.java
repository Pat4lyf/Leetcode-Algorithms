/**
 * This stack is created using an array
 */
public class CustomStack {
    private int[] arr;
    private int topOfStack;

    public CustomStack(int size) {
        this.arr = new int[size];
        topOfStack = -1;
        System.out.println("The stack is created with size of " + size);
    }


    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        }
        return false;
    }


    public boolean isFull() {
        if(topOfStack == arr.length - 1) {
            return true;
        }
        return false;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full");
        } else {
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("The value has been inserted successfully");
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        }
        return arr[topOfStack];
    }


    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        }
        int value = arr[topOfStack];
        topOfStack--;
        return value;
    }

    public void delete() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        }
        arr = null;
        topOfStack = -1;
        System.out.println("The stack is deleted successfully");
    }

    public static void main(String[] args) {
        CustomStack newStack = new CustomStack(3);
        newStack.push(7);
        newStack.push(8);
        System.out.println(newStack.peek());
        newStack.delete();
        System.out.println(newStack.peek());

    }

}
