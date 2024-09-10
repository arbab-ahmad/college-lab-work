// Stack class implementing basic stack operations
class Stack {
    // Initialize stack array with fixed size and top pointer
    private static int[] arr = new int[1];
    private static int top = -1;

    // Push operation to add an element to the stack
    static void push(int x) {
        if (top >= arr.length) {
            System.out.println("Insertion not possible! (Stack overflow)");
            return;
        }
        arr[++top] = x;
    }

    // Pop operation to remove the top element from the stack
    static int pop() {
        if (top < 0) {
            System.out.println("Stack is empty: Stack underflow!");
            return top;
        }
        return arr[top--];
    }

    // Peek operation to get the top element without removing it
    static int peek() {
        if (top < 0) {
            System.out.println("Stack is empty!");
            return top;
        }
        return arr[top];
    }

    // Check if the stack is full
    static boolean isFull() {
        return top >= arr.length;
    }

    // Check if the stack is empty
    static boolean isEmpty() {
        return top == -1;
    }
}

public class Main {
    public static void main(String[] args) {
        // Test the stack operations
        System.out.println(Stack.isEmpty()); // Check if stack is empty
        System.out.println(Stack.isFull()); // Check if stack is full
        System.out.println(Stack.peek()); // Peek the top element
        System.out.println(Stack.pop()); // Pop the top element
        Stack.push(10); // Push a new element onto the stack
    }
}
