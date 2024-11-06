import java.util.Stack;

public class IntegerStack {
    private Stack<Integer> stack;

    // Constructor to initialize the stack
    public IntegerStack() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed element: " + element);
    }

    // Method to pop an element from the stack
    public void popElement() {
        if (!stack.isEmpty()) {
            int removedElement = stack.pop();
            System.out.println("Popped element: " + removedElement);
        } else {
            System.out.println("Stack is empty, cannot pop.");
        }
    }

    // Method to display the current elements in the stack
    public void displayStack() {
        System.out.println("Current Stack: " + stack);
    }

    public static void main(String[] args) {
        IntegerStack integerStack = new IntegerStack();

        // Test the stack operations
        integerStack.pushElement(10);
        integerStack.pushElement(20);
        integerStack.pushElement(30);

        integerStack.displayStack(); // Display the current stack

        integerStack.popElement();
        integerStack.displayStack(); // Display the stack after popping
    }
}
